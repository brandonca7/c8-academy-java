package com.bptn.course._09_exception_handling;

public class DivideByZero {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 2;
		
		try {
			int result = num1/num2;
		} catch(ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Something went wrong");
		} finally {
			System.out.println("Bye");
		}
		
		
		
		
		
	}

}
