package com.rays.basic;

public class Palindrome {

	public static void main(String[] args) {
		int x,n,y,r;
		n=45681;
		x=n;
		y=0;
		for( ; n!=0; n/=10){
			r=n%10;
			y=y*10+r;
		}
	if(x==y)
		System.out.println(x+" is a palindrom");
	else
		System.out.println(y+" is a palindrom");
	
	}

}
