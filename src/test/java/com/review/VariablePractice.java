package com.review;

public class VariablePractice {

	static int age=35;
	static int salary=5000;
	String password="Sar123$";
	static int a=10;
	static int b=20;
	
	public static void main(String[] args) {
		
		
		System.out.println("age="+age);
		System.out.println("salary="+salary);
		int sum =age+salary;
		System.out.println("Sum="+sum);
		int minus =salary-age;
		System.out.println("Deduction="+minus);
		
		System.out.println("A value="+a);//a=10
		System.out.println("B value="+b);//b=20
		a=a+b;
		b=a-b;
		System.out.println("B value="+b);//b=10
		
		System.out.println("A value="+a);//a=20
	
		
	}
	
}
