package com.tcy.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.tcy.bean.Employee;
@Repository
public interface EmployeeMapper {

	List<Employee> getEmployee();
}
