package com;

import java.util.Scanner;

public class Addition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int a;
		a= sc.nextInt();
		System.out.println("Value of a is:"+a);
		int b;
		b=sc.nextInt();
		System.out.println("Value of b is:"+b);
		System.out.println("Addition :"+(a+b));
	}

}
