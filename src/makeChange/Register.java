package makeChange;

import java.util.Scanner;

public class Register {

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
		
		tender += .005;
		
		if ( tender < cost) {
			System.err.println("**           ALERT           **");
			System.err.println("** AMOUNT GIVEN INSUFFICIENT **");
		}
		if ( tender == cost) {
			System.out.println("Exact Amount!");
			System.out.println("No change required!");
		}
		
		if (tender > cost) {
			double change = (double)(tender - cost);
			System.out.printf("Change Due: $" + "%, .2f", (change));
			System.out.println("\n");


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
				System.out.println("$20: "+twenties);
			}
			if (change / 10 > 1) {
				tens = (int) (change / 10);
				change = change % 10;
				System.out.println("$10: "+tens);
			}
			if (change / 5 > 1) {
				fives = (int) (change / 5);
				change = change % 5;
				System.out.println("$5:  "+fives);
			}
			if (change / 1 > 1) {
				ones = (int) (change / 1);
				change = change % 1;
				System.out.println("$1:  "+ones);
			}
			change *= 100;
			
			if (change / 25 > 1) {
				quarters = (int) (change / 25);
				change = (change % 25);
				System.out.println("Quarters: "+quarters);
			}
			if (change / 10 > 1) {
				dimes = (int) (change / 10);
				change = (change % 10);
				System.out.println("Dimes: "+dimes);
			}
			if (change / 5 > 1) {
				nickels = (int) (change / 5);
				change = (change % 5);
				System.out.println("Nickels: "+nickels);
			}
			if (change >= 1) {
				pennies = (int) (change / 1);
				change = (change % 1);
				System.out.println("Pennies: "+pennies);
			}

		}
		

	}

}

