package com.rays.basic;

public class ReverseDigit {

	public static void main(String[] args) {
		int reverse = 0;
		int a = 123456;
		while (a != 0) {
			int remainder = a % 10;
			reverse= reverse*10 + remainder;
			a = a / 10;
		}

		System.out.println("rev no is " + reverse);
	}
}
