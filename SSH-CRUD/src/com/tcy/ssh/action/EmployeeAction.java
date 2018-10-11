package com.tcy.ssh.action;

import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import com.tcy.ssh.entities.Employee;
import com.tcy.ssh.service.DepartmentService;
import com.tcy.ssh.service.EmployeeService;

public class EmployeeAction extends ActionSupport implements RequestAware, ModelDriven<Employee>, Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private EmployeeService employeeService;

	private DepartmentService departmentService;

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public String list() {
		// ���ݴ�����������з���
		request.put("employees", employeeService.getAll());
		return "list";
	}

	private Integer id;

	public void setId(Integer id) {
		this.id = id;
	}

	public String delete() {
		employeeService.delete(id);
		return SUCCESS;
	}

	public String input() {
		request.put("departments", departmentService.getAll());
		return INPUT;
	}

	public String save() {
		 System.out.println(model);
		model.setCreateTime(new Date());
		employeeService.saveOrUpdate(model);
		return SUCCESS;
	}

	//��ȡֵ����
	public void prepareInput() {
		if(id!=null) {
			model = employeeService.get(id);
		}
	}
	
	//��ȡ��ֵ
	public void prepareSave() {
		model = new Employee();
	}

	private Map<String, Object> request;

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}

	@Override
	public void prepare() throws Exception {
		// ɶҲûд���ò�����struts2�������ø÷���
		// ����������
	}

	private Employee model;

	@Override
	public Employee getModel() {
		return model;
	}

}
