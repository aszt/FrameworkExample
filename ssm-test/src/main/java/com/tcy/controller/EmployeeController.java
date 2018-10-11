package com.tcy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.tcy.service.EmployeeService;


@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// Spring Web MVC 提供Model、Map或ModelMap让我们能去暴露渲染视图需要的模型数据。
	
	//@PathVariable是用来获得请求url中的动态参数
	//@Param("businessId") Integer businessId,@Param("memberId") Long memberId 获取多个参数
	//接受json参数@RequestBody User user，配置consumes="application/json"
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public String queryAll(Map<String, Object> map) {
		map.put("employeeList", employeeService.getEmployee());
		return "/queryAll";
	}

	/*@RequestMapping("/getAll")
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView("queryAll");
		//mav.addObject("replayName", liveInfo.getReplayName());
		//以  ${requestScope.replayName}的形式来接收
		return mav;
	}

	@RequestMapping("/getAll")
	public String getEmps(Model model) {
		model.addAttribute("pageInfo", employeeService.getEmployee());
		return "/queryAll";
	}*/
	
	//通过PathVariable获取路径中的参数(等于截取地址中的字符串)
	@RequestMapping(value="/pathvariable/{name}", method=RequestMethod.GET)
	public String PathVariable(@PathVariable("name") String name) {
		System.out.println(name);
		return "/queryAll";
	}
	
	
	
}
