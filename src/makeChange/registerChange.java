package makeChange;

import java.util.Scanner;

public class registerChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("** Attention Cashier! **\n");
		System.out.println("Our system shows a customer is trying to purchase an item.\n");
		System.out.println("Due to a recent issue in cashier theft, I, the \"computer\" will"
				+ " be determining the amount due.\n");
		System.out.print("Please enter the cost of the item: ");
		double cost = sc.nextDouble();
		sc.nextLine();
		System.out.println("");

		System.out.println("Ouch, inflation is really kicking into gear.\n");
		System.out.print("Now, please enter the amount recieved: ");

		double tender = sc.nextDouble();
		sc.nextLine();
		System.out.println("");

		if (tender < cost) {
			System.err.println("**           ALERT           **");
			System.err.println("** AMOUNT GIVEN INSUFFICIENT **");
		}
		if (tender == cost) {
			System.out.println("Exact Amount!");
			System.out.println("No change required!");
		}

		if (tender > cost) {
			double change = tender - cost;
			change += 0.005;
			change *= 100;
			change = (int) (change * 1);
			System.out.printf("Change Due: $" + "%, .2f", (change / 100));
			System.out.println("\n");

			int twenties = 0;
			int tens = 0;
			int fives = 0;
			int ones = 0;
			int quarters = 0;
			int dimes = 0;
			int nickels = 0;
			int pennies = 0;

			if (change / 2000 >= 1) {
				twenties = (int) (change / 2000);
				change = change % 2000;
				System.out.println("$20: " + twenties);
			}
			if (change / 1000 >= 1) {
				tens = (int) (change / 1000);
				change = change % 1000;
				System.out.println("$10: " + tens);
			}
			if (change / 500 >= 1) {
				fives = (int) (change / 500);
				change = change % 500;
				System.out.println("$5:  " + fives);
			}
			if (change / 100 >= 1) {
				ones = (int) (change / 100);
				change = change % 100;
				System.out.println("$1:  " + ones);
			}

			if (change / 25 >= 1) {
				quarters = (int) (change / 25);
				change = (change % 25);
				if (quarters == 1) {
					System.out.println("Quarter: " + quarters);

				} else {
					System.out.println("Quarters: " + quarters);
				}
			}
			if (change / 10 >= 1) {
				dimes = (int) (change / 10);
				change = (change % 10);
				if (dimes == 1) {
					System.out.println("Dime: " + dimes);

				} else {
					System.out.println("Dimes: " + dimes);
				}
			}
			if (change / 5 >= 1) {
				nickels = (int) (change / 5);
				change = (change % 5);
				if (nickels == 1) {
					System.out.println("Nickel: " + nickels);
				} else {
					System.out.println("Nickels: " + nickels);
				}
			}
			if (change >= 1) {
				pennies = (int) (change / 1);
				change = (change % 1);
				if (pennies == 1) {
					System.out.println("Penny: " + pennies);

				} else {
					System.out.println("Pennies: " + pennies);
				}
			}

		}
		sc.close();

	}

}
