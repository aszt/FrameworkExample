package com.tcy.ssh.service;

import java.util.List;

import com.tcy.ssh.dao.EmployeeDao;
import com.tcy.ssh.entities.Employee;

public class EmployeeService {

	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public List<Employee> getAll() {
		return employeeDao.getAll();
	}
	
	public void delete(Integer id) {
		employeeDao.delete(id);
	}

	public void saveOrUpdate(Employee employee) {
		employeeDao.saveOrUpdate(employee);
	}

	public Employee get(Integer id) {
		return employeeDao.get(id);
	}
	
}
