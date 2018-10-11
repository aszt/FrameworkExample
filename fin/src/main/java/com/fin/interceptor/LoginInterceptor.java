package com.fin.interceptor;

import com.alibaba.fastjson.JSON;
import com.fin.bean.UserThreadLocal;
import com.fin.common.CookieUtils;
import com.fin.pojo.Accounts;
import com.fin.service.impl.CommonService;
import com.fin.service.impl.RedisService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor extends HandlerInterceptorAdapter {

    private Logger log = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    private CommonService commonService;

    @Autowired
    private RedisService redisService;

    /**
     * 请求处理前调用
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //从浏览器中获取用户的登录令牌token
        String token = CookieUtils.getCookieValue(request, commonService.COOKIE_NAME);
        String key = this.commonService.USER_REDIS_KEY + token;
        String jsonAccount = this.redisService.get(key);//判断redis中是否还有token
        if (jsonAccount == null) {
            log.debug("登录失效");
//            System.out.print("登录失效");
            //说明登录已经失效
            CookieUtils.deleteCookie(request, response, commonService.COOKIE_NAME);
            response.setStatus(401);//返回状态码退出登录
            return false;
        } else {
            Accounts account = JSON.parseObject(jsonAccount, Accounts.class);
            //说明登录有效,即时更新token有效时间
            this.redisService.expire(key, 30 * 60);
            UserThreadLocal.set(account);//再将用户信息放入本地线程池中
            return true;
        }
    }

    /**
     * Controller 方法调用之后执行、DispatcherServlet 进行视图返回渲染之前被调用
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    /**
     * DispatcherServlet 渲染了对应的视图之后执行
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
        UserThreadLocal.set(null);
    }

}
