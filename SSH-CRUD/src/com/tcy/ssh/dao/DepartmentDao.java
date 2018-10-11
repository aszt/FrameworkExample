package com.tcy.ssh.dao;

import java.util.List;

import com.tcy.ssh.entities.Department;

public class DepartmentDao extends BaseDao {
	public List<Department> getAll() {
		String hql = "FROM Department";
		return getSession().createQuery(hql).list();
	}
}
