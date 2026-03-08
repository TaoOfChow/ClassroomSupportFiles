package code;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Main {

	public static Scanner input = new Scanner(System.in);
	
	public static int displayMenu(double balance) {
		
		System.out.println("======BANK OF CHOW======");
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\t$" + df.format(balance));
		System.out.println("0. Exit");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		return input.nextInt();
	}
	
	public static boolean authenticatePin() {
		
		int pin = 0;
		int tries = 3;
		do {
			System.out.print("Please Enter Your PIN:");
			pin = input.nextInt();
			tries--;
			if(pin == 2468)
			{
				System.out.println("Access Granted");
				return true;
			}
				
		}while(pin != 2468 && tries > 0);
		
		System.out.println("Access Denied");
		return false;
	}
	
	public static double deposit() {
		
		System.out.print("Enter the amount: $");
		double amount = input.nextDouble();
		
		if(amount >= 0) {
			System.out.println("Deposit Successful");
			return amount;
		}
		else
		{
			System.out.println("Deposit Rejected");
			return 0;
		}
		
	}
	
	public static double withdraw(double balance) {
		
		System.out.print("Enter the amount: $");
		double amount = input.nextDouble();
		
		if(amount <= balance) {
			System.out.println("Withdrawl Successful");
			return amount;
		}
		else
		{
			System.out.println("Withdrawl Rejected");
			return 0;
		}
		
	}

	public static void main(String[] args) {
		
		
		double balance =888;
		int menuChoice = 0;
		if(authenticatePin() == true)
		{
			do{
				menuChoice = displayMenu(balance);
				if(menuChoice == 1)
					balance += deposit();
				else if(menuChoice == 2)
					balance -= withdraw(balance);
					
			}while(menuChoice != 0);
		
			System.out.println("Goodbye");
		}
	}
}
