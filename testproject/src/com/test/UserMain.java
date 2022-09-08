package com.test;

public class UserMain {
	public static void main(String[] args) {
		UserTest test = new UserTest();
		String greet = test.greeting("Hello World");
		System.out.println(greet);
		Integer id = test.userId(193);
		System.out.println(id);
		test.m1(5, 9);
	}

}
