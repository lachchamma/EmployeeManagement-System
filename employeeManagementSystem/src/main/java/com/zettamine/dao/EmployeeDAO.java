package com.zettamine.dao;

import java.util.List;

import com.zettamine.ems.dto.Employee;

public interface EmployeeDAO {
	Integer saveEmployee(Employee emp);
	Employee findById(Integer id);
	List<Employee> findByAll();
	Integer updateEmployee(Integer id,Employee emp);
	Integer deleteById(Integer id);

}
