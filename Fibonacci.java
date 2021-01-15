package com.rays.basic;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
	int a =0, b=0;
	int c=1;
	Scanner s = new Scanner(System.in);
	System.out.println("please enter the number");
	int x = s.nextInt();
	System.out.println("the result series is = ");
for (int i=0; i<=x; i++){
	a=b;
	b=c;
	c=a+b;
	System.out.println(a);
}
	}
}
