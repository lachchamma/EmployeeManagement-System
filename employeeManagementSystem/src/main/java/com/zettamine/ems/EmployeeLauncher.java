package com.zettamine.ems;

import java.util.Scanner;

import com.zettamine.ems.dto.Employee;
import com.zettamine.ems.service.EmployeeServiceImpl;

public class EmployeeLauncher {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		boolean status=true;
	while(status) {
		System.out.println("1.New Employee");
		System.out.println("2.Search Employee");
		System.out.println("3.Update Employee");
		System.out.println("4.Delete Employee");
		System.out.println("5.All Employee");
		System.out.println("6.Exit");
		
		System.out.print("Enter your Option");
		int option=sc.nextInt();
		EmployeeServiceImpl emp=new EmployeeServiceImpl();
		Integer id=null;
		String name=null;
		Float sal=null;
		Employee emp1=null;
		
switch(option) {
		
	case 1: status=false;
			System.out.print("Enter employee id");
			 id=sc.nextInt();
			System.out.print("Enter employee name");
			 name=sc.next();
			System.out.print("Enter employee sal");
			 sal=sc.nextFloat();
			 emp1=new Employee(id,name,sal);
			emp.saveEmployee(emp1);
			break;
			
	case 2:System.out.print("Enter employee id");
	         id=sc.nextInt();
	         emp.findById(id);
	         break;
	case 3:System.out.print("Enter employee id");
	 		id=sc.nextInt();
	 		System.out.print("Enter employee name");
	 		name=sc.next();
	 		System.out.print("Enter employee sal");
	 		sal=sc.nextFloat();
	 		emp1=new Employee(id,name,sal);
	 		emp.updateEmployee(id, emp1);
	 		break;
	case 4:System.out.print("Enter employee id");
		id=sc.nextInt();
		emp.deleteById(id);
		break;
	case 5:
		 emp.findByAll();
		 break;
	
	case 6:
		   System.out.print("Application designed and developed by ");
		   System.out.println("\tteam@Zettamine ");
		  System.exit(0);
		   
		   return;
		   
    default:System.err.println("......Invalid input Please try Again!!!!!");		   
	
		}
		
	}//close while loop
sc.close();
	}
	

}
