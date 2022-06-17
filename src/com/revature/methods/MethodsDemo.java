package com.revature.methods;

import java.util.Scanner;


public class MethodsDemo {
public static void main(String[] args) {
	sum();
	subtract();
	divide();
	multiply();
	
}
	public static void sum() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number 1 : ");
	int n1 = sc.nextInt();
	System.out.print("Enter Number 2 : ");
	int n2 = sc.nextInt();
	int sum = n1 + n2;
	System.out.println("Sum of " + n1 + " and " + n2 + " is " + sum);
	
	}
	public static void subtract() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number 1 : ");
	int n1 = sc.nextInt();
	System.out.print("Enter Number 2 : ");
	int n2 = sc.nextInt();
	int subtract = n1 - n2;
	System.out.println(n1 + " minus " + n2 + " is " + subtract);
	
	}
	public static void divide() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number 1 : ");
	int n1 = sc.nextInt();
	System.out.print("Enter Number 2 : ");
	int n2 = sc.nextInt();
	int divide = n1 / n2;
	System.out.println(n1 + " divided by " + n2 + " is " + divide);
		
		
	}
	public static void multiply() {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number 1 : ");
	int n1 = sc.nextInt();
	System.out.print("Enter Number 2 : ");
	int n2 = sc.nextInt();
	int multiply = n1 * n2;
	System.out.println(n1 + " multiplied by " + n2 + " is " + multiply);
				
	}
}
