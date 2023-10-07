package makeChange;

import java.util.Scanner;

public class registerChange {

	public static void main(String[] args) {

		float cost = 3.96f;
		System.out.printf("Cost:       $" + "%, .2f", cost);
		System.out.println("");
		float tender = 20.00f;
		System.out.printf("Tendered:   $" + "%, .2f", tender);
		System.out.println("");
		System.out.println("");

		if (tender > cost) {
			float change = (tender - cost);
			System.out.printf("Amount Due: $" + "%, .2f", (change));
			System.out.println("");

			// change list

			int twenties = 0;
			int tens = 0;
			int fives = 0;
			int ones = 0;
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;

			if (change / 20 > 1) {
				twenties = (int) (change / 20);
				change = change % 20;
//				System.out.println("20s place : "+change);
				System.out.println("$20: "+twenties);
			}
			if (change / 10 > 1) {
				tens = (int) (change / 10);
				change = change % 10;
//				System.out.println("10s place: "+change);
				System.out.println("$10: "+tens);
			}
			if (change / 5 > 1) {
				fives = (int) (change / 5);
				change = change % 5;
//				System.out.println("5s place: "+change);
				System.out.println("$5: "+fives);
			}
			if (change / 1 > 1) {
				ones = (int) (change / 1);
				change = change % 1;
//				System.out.println("1s place: "+change);
				System.out.println("$1: "+ones);
			}
			if (change / 0.25 > 1) {
				quarters = (int) (change / 0.25);
				change = (float)(change % 0.25);
//				System.out.println("0.25 place: "+change);
				System.out.println(".10c: "+quarters);
			}
			if (change / 0.10 > 1) {
				dimes = (int) (change / 0.10);
				change = (float)(change % 0.10);
//				System.out.println("0.10 place: "+change);
				System.out.println(".05c: "+dimes);
			}
			if (change / 0.01 > 1) {
				pennies = (int) (change / 0.01);
				change = (float)(change % 0.01);
//				System.out.println("0.01 place: "+change);
				System.out.println(".1c: "+pennies);
			}

		}

//					change %= ten;
//					System.out.println("$10: "+change);
//					change %= five;
//					System.out.println("$5: "+change);
//					change %= one;
//					System.out.println("$1: "+change);
//					change %= quarter;
//					System.out.println("$0.25: "+change);
//					change %= dime;
//					System.out.println("$0.10: "+change);
//					change %= nickel;
//					System.out.println("$0.05: "+change);
//					change %= penny;
//					System.out.println("$0.01: "+ change);

	}

}
