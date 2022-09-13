package com.test;

public class UserTest implements User {

	@Override
	public String greeting(String greet) {
		return greet;
	}

	@Override
	public Integer userId(int id) {
		return id;
	}

	@Override
	public void m1(int a, int b) {
		System.out.println(a + b * b - a);

	}

	@Override
	public int m2() {
		return 44;
	}

	@Override
	public double userSalary(double salary) {
		return salary;
	}

}
