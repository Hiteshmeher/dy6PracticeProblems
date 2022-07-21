package com.bridgelabz.day6;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		/**
		 * taking start time from system by entering 1 using scanner taking end time
		 * from system by entering 2 using scanner calculating elapsed time (ENDTIME-
		 * START TIME) elapsed will be in mili seconds dividing elapsed by 1000 to get
		 * result in seconds
		 * 
		 */
		long elapsed = 0;
		long StartTime = System.currentTimeMillis();
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 to start the stop watch ");
		int N = input.nextInt();
		if (N == 1) {
			System.out.println("Starting time is " + StartTime);
		}
		long StopTime = System.currentTimeMillis();
		Scanner input2 = new Scanner(System.in);
		System.out.println("Press 2 to start the stop watch ");
		int M = input2.nextInt();
		if (M == 2) {
			System.out.println("Starting time is " + StopTime);
		}
		elapsed = StopTime - StartTime;
		System.out.println("Elapsed is " + (elapsed / 1000) + " Seconds");
		input.close();
		input2.close();
	}
}