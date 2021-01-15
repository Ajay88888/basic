package com.rays.basic;

public class Armstrong {

	public static void main(String[] args) {
		int c=0, a, n, t;
		n=220;
		t=n;
		while(n>0){
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
		}
if(t==c)
System.out.println(c+" is a armstrong number");

	else
System.out.println(t+" is a armstrong number");
		}
}

