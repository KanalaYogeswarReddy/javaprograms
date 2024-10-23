package com.javaprograms.p;

import java.util.Scanner;

public class Launch1 {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num-1");
			int num1 = sc.nextInt();
			System.out.println("Enter the num-2");
			int num2 = sc.nextInt();
			int res = num1/num2;
			System.out.println(res);
			
		}
		catch (Exception e)
		{
			System.out.println("Exception Occured in Main is handled");
		}
		
	}

}
