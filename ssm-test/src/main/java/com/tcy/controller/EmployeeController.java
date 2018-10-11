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

	// Spring Web MVC �ṩModel��Map��ModelMap��������ȥ��¶��Ⱦ��ͼ��Ҫ��ģ�����ݡ�
	
	//@PathVariable�������������url�еĶ�̬����
	//@Param("businessId") Integer businessId,@Param("memberId") Long memberId ��ȡ�������
	//����json����@RequestBody User user������consumes="application/json"
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public String queryAll(Map<String, Object> map) {
		map.put("employeeList", employeeService.getEmployee());
		return "/queryAll";
	}

	/*@RequestMapping("/getAll")
	public ModelAndView add() {
		ModelAndView mav = new ModelAndView("queryAll");
		//mav.addObject("replayName", liveInfo.getReplayName());
		//��  ${requestScope.replayName}����ʽ������
		return mav;
	}

	@RequestMapping("/getAll")
	public String getEmps(Model model) {
		model.addAttribute("pageInfo", employeeService.getEmployee());
		return "/queryAll";
	}*/
	
	//ͨ��PathVariable��ȡ·���еĲ���(���ڽ�ȡ��ַ�е��ַ���)
	@RequestMapping(value="/pathvariable/{name}", method=RequestMethod.GET)
	public String PathVariable(@PathVariable("name") String name) {
		System.out.println(name);
		return "/queryAll";
	}
	
	
	
}
