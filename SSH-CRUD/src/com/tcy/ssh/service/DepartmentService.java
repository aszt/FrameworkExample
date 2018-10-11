package com.tcy.ssh.service;

import java.util.List;

import com.tcy.ssh.dao.DepartmentDao;
import com.tcy.ssh.entities.Department;

public class DepartmentService {
	private DepartmentDao departmentDao;

	public void setDepartmentDao(DepartmentDao departmentDao) {
		this.departmentDao = departmentDao;
	}

	public List<Department> getAll() {
		return departmentDao.getAll();
	}
}
