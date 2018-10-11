package com.tcy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcy.bean.Employee;
import com.tcy.dao.EmployeeMapper;
import com.tcy.service.EmployeeService;

@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeMapper employeeMapper;
	
	@Override
	public List<Employee> getEmployee() {
		List<Employee> employeeList= employeeMapper.getEmployee();
		return employeeList;
	}

}
