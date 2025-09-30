package com.bptn.course._06_oop_basics;

import java.util.Scanner;

class MethodLogic {
	
	String readUserName() {
		Scanner scanner = new Scanner(System.in);
		String username = scanner.nextLine();
		scanner.close();
		return username;
	}
	
	void printUserName(String username) {
		System.out.println("Hello, "+username);
	}
	
}

public class InstanceMethods {
	public static void main(String args[]) {
		MethodLogic myObj = new MethodLogic();
		String input = myObj.readUserName();
		myObj.printUserName(input);
	}
}
