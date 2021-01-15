package com.rays.basic;

public class TableDimensional {

	public static void main(String[] args) {
		int a[ ]=new int [12];
		a[0]=2;
		for(int i=1; i<a.length-1; i++){
			for(int x=1; x<a.length; x++){
				a[i] = a[0]*x;
				 System.out.println(""+a[i]);
			}
	System.out.println( );
		}
	}	
	}