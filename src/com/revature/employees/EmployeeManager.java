package com.revature.employees;

public class EmployeeManager {
public static void main(String[] args) {
// make an array with 5 employees
	Employee[] employee=new Employee[5];
	for(int i=0; i<employee.length; i++) 
		employee[i]=new Employee();
		
		employee[0].createEmployee(2343, "August", "IT",60000);
		employee[0].displayEmployee();
		
		employee[1].createEmployee(2344, "Stephanie", "HR", 60000);
		employee[1].displayEmployee();
		
		employee[2].createEmployee(2345, "Jake", "Sales", 60000);
		employee[2].displayEmployee();
		
		employee[3].createEmployee(2346, "Jill", "IT", 60000);
		employee[3].displayEmployee();
		
		employee[4].createEmployee(2347, "Joe", "Sales", 60000);
		employee[4].displayEmployee();
	

}
}