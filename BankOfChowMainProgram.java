import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

  /*A Scanner is used throughout the program and is declared as a class
  variable so that it doesn't need to be implemented over and over again.*/
	public static Scanner input = new Scanner(System.in);
	
  ////////////////////////////////////////////////////////////////////////
  ///////////////////////////////PART 1///////////////////////////////////
  /*The header for this method/function is incomplete.  Complete the header for the 
  displayMenu method below. The complete body code is given and does not need 
  to be modified*/
	displayMenu() 
  {
    System.out.println("======BANK OF CHOW======");
    /*The DecimalFormat object is used to set 2-digit decimal precision for 
    the outputs*/
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("\t$" + df.format(balance));
		System.out.println("0. Exit");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		return input.nextInt();
	}

	////////////////////////////////////////////////////////////////////////
  ///////////////////////////////PART 2///////////////////////////////////
  /*Write a method/function called authenticatePin() that prompts the user
  to enter their PIN (Personal Identification Number).  The embedded
  PIN code is 2468.  The user has three tries to input the correct PIN.
  If they input the correct PIN within 3 tries, then the method prints 
  "Access Granted" and returns TRUE, otherwise it prints "Access Denied"
  and returns FALSE.*/

	authenticatePin(){ 
		
		//Complete the code for the method/function header and body.
	}


	////////////////////////////////////////////////////////////////////////
  ///////////////////////////////PART 3///////////////////////////////////
  /*Write the header and body for a method/function called deposit() that 
  prompts the user to enter an amount to deposit.  If the user enters a 
  positive value, the program will print "Deposit Successful" and return 
  the amount to be added to the account balance.  If the user does not 
  enter a positive value, the program will print "Deposit Rejected" and 
  return 0.*/
	deposit() {
		
    //Complete the code for the method/function header and body.
	}
	////////////////////////////////////////////////////////////////////////
  ////////////////////////////////////////////////////////////////////////


	////////////////////////////////////////////////////////////////////////
  ///////////////////////////////PART 4///////////////////////////////////
  /*Write the header and body for a method/function called withdraw() that 
  prompts the user to enter an amount to withdraw from the account.  If the 
  user enters a value that is less then or equal to the balance of the 
  account, the program will print "Withdrawl Successful" and return 
  the amount to be removed from the account balance.  If the user enters a,
  value that is greater than the account balance, the program will print 
  "Deposit Rejected" and return 0.*/
	withdraw() {
		
		//Complete the code for the method/function header and body.
		
	}


	////////////////////////////////////////////////////////////////////////
  ///////DO NOT MODIFY THE CODE IN THIS PART OF THE PROGRAM///////////////
  ////////////////////////////////////////////////////////////////////////

	public static void main(String[] args) {
		
		double balance =888;
		int menuChoice = 0;
		if(authenticatePin() == true)
		{
			do
      {
				menuChoice = displayMenu(balance);
				if(menuChoice == 1)
					balance += deposit();
				else if(menuChoice == 2)
					balance -= withdraw(balance);
					
			}while(menuChoice != 0);
		}
	}
}
