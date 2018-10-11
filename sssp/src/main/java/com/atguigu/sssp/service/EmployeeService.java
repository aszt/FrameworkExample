package com.atguigu.sssp.service;

import org.springframework.data.domain.Page;

import com.atguigu.sssp.entity.Employee;

public interface EmployeeService {

	public Page<Employee> getPage(int pageNo, int pageSize);
	
	public Employee getByLastName(String lastName);
	
	public void save(Employee employee);

	public Employee get(Integer id);

	public void delete(Integer id);
}
