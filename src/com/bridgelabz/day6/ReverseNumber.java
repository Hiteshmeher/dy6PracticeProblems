package com.bridgelabz.day6;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */
public class ReverseNumber {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * initialize reverse is zero
		 * taking number from user
		 * checking number is not zero then proceed
		 * calculating remainder
		 * add this remainder with reverse value
		 * Divide the number taken from user to 10 and put in number itself
		 * 
		 */
		int number ,reverse = 0;  
		System.out.println("Enter a number"); 
		Scanner sc = new Scanner(System.in); 
				number=sc.nextInt();
		while(number != 0)
		{  
		int remainder = number % 10; 
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		sc.close();
	}
}