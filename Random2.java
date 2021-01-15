package com.rays.basic;

import java.util.Random;

public class Random2 {

	public static void main(String[] args) {
		int max = 100;
		int min = 1;
		for(int j=0; j<5; j++){
	 Random r = new Random();
	 int i = min+r.nextInt(max);
          System.out.println(i);
		}
	}
	}
