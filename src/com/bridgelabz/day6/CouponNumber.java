package com.bridgelabz.day6;

import java.util.Scanner;
/**
 * 
 * @author LENOVO
 *
 */
public class CouponNumber {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * taking input 5 , 3-digit number from user
		 * then taking a random number of 3 digit
		 * checking while random is same as the 5 3-digit number from user
		 * if matched then Coupon Number generated
		 * 
		 */
		
		System.out.println("Enter five numbers of 3 digits");
		Scanner sc = new Scanner(System.in);
		int A1 = sc.nextInt();
		int A2 = sc.nextInt();
		int A3 = sc.nextInt();
		int A4 = sc.nextInt();
		int A5 = sc.nextInt();
		
		int X = 1;
		while (X < 999999) {

			X = 100 + (int) (Math.random() * 999);

			if (X == A1) {
				System.out.println("matched " + A1);
			} else if (X == A2) {
				System.out.println("matched " + A2);
			} else if (X == A3) {
				System.out.println("matched " + A3);
			} else if (X == A4) {
				System.out.println("matched " + A4);
			} else if (X == A5) {
				System.out.println("matched " + A5);
			}
		}
		sc.close();
	}
}