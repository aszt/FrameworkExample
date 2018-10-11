package com.atguigu.sssp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.atguigu.sssp.entity.Department;
import com.atguigu.sssp.repository.DepartmentRepository;
import com.atguigu.sssp.service.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;

	@Transactional(readOnly = true)
	@Override
	public List<Department> getAll() {
		return departmentRepository.getAll();
	}

}
