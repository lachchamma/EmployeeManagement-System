package com.zettamine.ems.service;

import java.util.List;

import com.zettamine.ems.dto.Employee;

public interface EmployeeService {
	void saveEmployee(Employee emp);
	void findById(Integer id);
	void findByAll();
	void updateEmployee(Integer id,Employee emp);
	void deleteById(Integer id);


}
