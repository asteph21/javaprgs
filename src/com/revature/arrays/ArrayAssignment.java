package com.revature.arrays;

public class ArrayAssignment {


public static void main(String[] args) {

	//Create array of 11 elements and assign value
	int []arr= {24,27,34,54,22,31,29,28,33,21,48};
	
	//Display array using enhanced for loop
	System.out.print("Array using enhanced for loop: ");
	System.out.println(" ");
	for (int a:arr) {
	System.out.println(a);
	}
	System.out.println(" ");
	//Calculate and display the sum of the elements
	int sum =0;
	for(int i= 0; i<arr.length; i++) {
		sum = sum +arr[i];
	}
	System.out.println("Sum of the array: " +sum);
	System.out.println(" ");
	
	//Display all the even numbers
	System.out.print("Even Numbers: ");
	System.out.println(" ");
	for(int j=0; j<arr.length; j++) {
		if(arr[j]%2==0) {
		
		System.out.println(arr[j]);
		
		}	
	}
	System.out.println(" ");
	//Display all the odd numbers
	System.out.print("Odd Numbers: ");
	System.out.println(" ");
	for(int o=0; o<arr.length; o++) {
		if(arr[o]%2!=0){
		System.out.println(arr[o]);
		
		}
	}
	System.out.println(" ");
	//Calculate and display the sum of even and odd
	System.out.print("Sum of Even and Odd: ");
	System.out.println(" ");
	
	for(int e=0; e<arr.length; e++) {
		arr[e]%2==0;
		
	}
	//Sort the array from smallest to largest
	//Find the average
	//Display the 3 largest and smallest numbers
}
}