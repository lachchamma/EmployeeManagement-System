package com.zettamine.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.ems.configs.ConnectionFactory;
import com.zettamine.ems.dto.Employee;

public class EmployeeDAOImpl  implements EmployeeDAO{

	
	private static Statement st=null;
	private static Connection con=null;
	public EmployeeDAOImpl() {
		try {
			con=ConnectionFactory.getConnectionDB();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public Integer saveEmployee(Employee emp) {
		String query="insert into emp values(109,'Subhash',5009.90)";
		try {
			int rowsAffected=st.executeUpdate(query);
			return rowsAffected;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Employee findById(Integer id) {
		String query="select ename,sal from emp where empno="+id;
		try {
			ResultSet rs=st.executeQuery(query);
			if(rs.next()) {
				String name=rs.getString(1);
				Float sal=rs.getFloat(2);
				Employee emp=new Employee(id,name,sal);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> findByAll() {
		String query="select * from emp";
		List<Employee> empList=new ArrayList<>();
		try {
			ResultSet rs=st.executeQuery(query);
			Integer id=rs.getInt(1);
			String name=rs.getString(2);
			Float sal=rs.getFloat(3);
			Employee emp=new Employee(id,name,sal);
			empList.add(emp);
			return empList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return null;
	}

	@Override
	public Integer updateEmployee(Integer id, Employee emp) {
		String query="update emp set ename="+"'"+emp.getEname()+"',sal="+emp.getSal()+"where empno="+id;
		try {
			
			return st.executeUpdate(query);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Integer deleteById(Integer id) {
		String query="delete from emp where empno="+id;
	try {
		int rowsAffected=st.executeUpdate(query);
		return rowsAffected;
	} catch (SQLException e) {
		e.printStackTrace();
	}
		return null;
	}

}
