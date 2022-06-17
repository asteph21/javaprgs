package com.revature.employees;

public class Employee {
	int empId;
	String name;
	String department;
	double salary;
public void createEmployee(int empId, String name, String department, double salary){
	this.empId=empId;
	this.name=name;
	this.department=department;
	this.salary=salary;
}
	
public void displayEmployee() {
	System.out.println("Employee ID: " + this.empId + " Name: " +this.name + " Department: " + this.department + " Salary: " +this.salary);
	
}
	
	}

