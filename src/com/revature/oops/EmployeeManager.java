package com.revature.oops;

public class EmployeeManager {
public static void main(String[] args) {
	
	//Employee emp=new Employee();
SalariedEmployee se=new SalariedEmployee(101,"August",40);
double salSE=se.calculateSalary(se.getDaysPresent());
System.out.println("Id : "+se.getId() +" Name : "+se.getName()+ " Days Present : "+se.getDaysPresent()+ "Salary : " +salSE); 

ContractEmployee ce=new ContractEmployee(201,"Stephanie",40);
double  salCE=ce.calculateSalary(ce.getHoursWorked());
System.out.println("Id : "+ce.getId() +" Name : "+ce.getName()+ " Hours Worked : " +ce.getHoursWorked()+ "Salary : " +salCE);
}
}