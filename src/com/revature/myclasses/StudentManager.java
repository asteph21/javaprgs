package com.revature.myclasses;

public class StudentManager {
public static void main(String[] args) {
	// Create an Object of Student class
	Student s1=new Student();
	
	s1.createStudent(101, "August", "Java");
	// Create a second object;
	
	Student s2=new Student();
	s2.createStudent(102, "Stephanie", "Python");
	
	// Call the display method
	s1.displayStudent();
	s2.displayStudent();
	
	Student [] student=new Student[5];
	for(int i=0; i<student.length; i++)
		student[i]=new Student();
	
	student[0].createStudent(105, "akdj", "ajdk");
	student[0].displayStudent();
	
	student[1].createStudent(106, "hjh", "hjh");
	student[1].displayStudent();
}
}