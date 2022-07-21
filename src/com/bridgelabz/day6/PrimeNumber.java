package com.bridgelabz.day6;

import java.util.Scanner;
/**
 * 
 * @author LENOVO
 *
 */
public class PrimeNumber {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * getting a number from user as input 
		 * initialize i = 1 and then increasing till input number 
		 * calculating modulus of input number with i
		 */

		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		for (int i = 1; i <= N; i++) {
			if (N % i == 0)
				a++;
		}
		if (a < 3) {
			System.out.println(N + " is prime");
		} else {
			System.out.println(N + " is not a prime");
		}
		sc.close();
	}

}