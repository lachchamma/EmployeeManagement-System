package com.zettamine.ems.service;

import java.util.List;

import com.zettamine.dao.EmployeeDAO;
import com.zettamine.dao.EmployeeDAOImpl;
import com.zettamine.ems.dto.Employee;

public class EmployeeServiceImpl  implements EmployeeService{

	EmployeeDAO dao=new EmployeeDAOImpl();
	@Override
	public void saveEmployee(Employee emp) {
		int n=dao.saveEmployee(emp);
		if(n>0) {
			System.out.println(n+" employee saved to emp table.... ");
		}else {
			System.err.println("NO Saved operation done check the Log...");
		}
		
	}

	@Override
	public void findById(Integer id) {
		Employee emp=dao.findById(id);
		if(emp!=null) {
			System.out.println(emp);
			
		}else {
			System.err.println("Not found the matching employee...");
		}
		
		
	}

	@Override
	public void findByAll() {
		List<Employee> empList=dao.findByAll();
		if(empList!=null) {
			System.out.println(empList);
		}else {
			System.err.println("not found any matching employees...");
		}
		
		
	}

	@Override
	public void updateEmployee(Integer id, Employee emp) {
		int rowsAffected=dao.updateEmployee(id, emp);
		if(rowsAffected>0) {
			System.out.println(rowsAffected+" employee updated");
		}else {
			System.err.println("Update operation is failed check again....");
		}
		
		
	}

	@Override
	public void deleteById(Integer id) {
		int rowsAffected=dao.deleteById(id);
		if(rowsAffected>0) {
			System.out.println(rowsAffected+" employee deleted");
		}else {
			System.err.println("Delete  operation is failed check again....");
		}
		
	}

}
