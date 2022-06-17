package com.revature.methods;

import java.util.Scanner;

public class MethodsDemo2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in); //function call with args
	System.out.println("Enter num1 : ");
	int n1=sc.nextInt();
	System.out.println("Enter number 2 : ");
	int n2=sc.nextInt();
	int res=sum(n1,n2); //function call with arguments and a return value
	System.out.println("Sum of " +x + " and " + y + " is " + res);
	sub(n1,n2);
	
	mult(n1,n2);
	div(n1,n2);
}
	//function definition -with parameters and return
	public static int sum(int x,int y) {
		int result =x+y;
		return result;
		
	}
	
}
