package com.atguigu.sssp.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.sssp.entity.Employee;
import com.atguigu.sssp.repository.EmployeeRepository;
import com.atguigu.sssp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Transactional(readOnly = true)
	@Override
	public Page<Employee> getPage(int pageNo, int pageSize) {
		PageRequest pageable = new PageRequest(pageNo - 1, pageSize);
		return employeeRepository.findAll(pageable);
	}

	@Override
	public Employee getByLastName(String lastName) {
		return employeeRepository.getByLastName(lastName);
	}

	@Transactional
	@Override
	public void save(Employee employee) {
		if(employee.getId() == null) {
			// 设置创建时间
			employee.setCreateTime(new Date());
		}
		employeeRepository.saveAndFlush(employee);
	}

	@Transactional(readOnly = true)
	@Override
	public Employee get(Integer id) {
		return employeeRepository.findOne(id);
	}

	@Override
	public void delete(Integer id) {
		employeeRepository.delete(id);
	}

}
