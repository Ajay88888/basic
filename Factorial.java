package com.rays.basic;

public class Factorial {

	public static void main(String[] args) {
		int fact = 1;
		int number = 5;
		for (int i2 = 1; i2<= number; i2++) {
			fact = fact * i2;
		}
		System.out.println(fact);
	}

}