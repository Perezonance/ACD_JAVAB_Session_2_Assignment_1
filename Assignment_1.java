package com.AManuel.Perez.Session2;

import java.util.Scanner;

public class Assignment_1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please Enter 3 Integers:");
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("The max of the 3 values is: " + max(a, b, c));
		
	}
	
	public static int max(int a, int b, int c) {
		
		if(a >= b && a >= c) {
			return a;
		}else if( b >= a && b >= c) {
			return b;
		}else {
			return c;
		}

	}
	
}
