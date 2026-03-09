import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static DecimalFormat df= new DecimalFormat("00.00");
	
	////////////////////////////////////////////////////////////////
	//////////////////////////////Part 1////////////////////////////
	////////////////////////////////////////////////////////////////
	/*
	 This method has a double parameter for the price.  It prints the
	 5% tax line of the bill and then returns the total tax needed for 
	 this bill
	 */
	calculateTax() {

	}
	
	////////////////////////////////////////////////////////////////
	//////////////////////////////Part 2////////////////////////////
	////////////////////////////////////////////////////////////////
	/*
	This method has a double parameter for the price.  It prints the
	15% tip line of the bill and then returns the total tip needed for 
	this bill
	*/
	calculateTip(){

	}
	
	////////////////////////////////////////////////////////////////
	//////////////////////////////Part 3////////////////////////////
	////////////////////////////////////////////////////////////////
	/*
	This method has a double parameter for the price, a double parameter
	for the tax and a double parameter for the tip.  It prints the
	"Total:"  line of the bill and then returns the total cost needed for 
	this meal
	*/
	public static double calculateTotal(double price, double tax, double tip) {

	}
	
	////////////////////////////////////////////////////////////////
	//////////////////////////////Part 4////////////////////////////
	////////////////////////////////////////////////////////////////
	/*
	This method uses all of the methods above to generate the cost 
	the meal by combining the cost of meal1 and meal2 into one bill.
	See the Sample Output for how this should look.
	*/
	myTreat() {

	}
	
	////////////////////////////////////////////////////////////////
	//////////////////////////////Part 5////////////////////////////
	////////////////////////////////////////////////////////////////
	/*
	This method uses all of the methods above to generate the cost the meal 
	by combining the cost of meal1 and meal2, and then splitting the cost
	evenly.  See the Sample Output for how this should look.
	*/	
	evenSplit() {

	}
	
	////////////////////////////////////////////////////////////////
	//////////////////////////////Part 6////////////////////////////
	////////////////////////////////////////////////////////////////
	/*
	This method uses all of the methods above to generate the cost 
	the meal by keeping the cost of meal1 and meal2 separate.  See 
	the Sample Output for how this should look.
	*/
	piratesCode() {
		

	}
	
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int choice = 0;
		double meal1 = 0, meal2 = 0;
		
		System.out.println("\t\tBill Splitter");
		System.out.println("=========================================");
		System.out.print("How much did the first meal cost?  $");
		meal1 = input.nextDouble();
		System.out.print("How much did the second meal cost? $");
		meal2 = input.nextDouble();
		System.out.println("=========================================");
		System.out.println("What would you like to do?");
		System.out.println("1. My Treat");
		System.out.println("2. Even Split");
		System.out.println("3. Pirate's Code");
		System.out.print(">>");
		choice = input.nextInt();
		System.out.println();
		
		if(choice == 1)
			myTreat(meal1, meal2);
		else if (choice == 2)
			evenSplit(meal1, meal2);
		else if (choice == 3)
			piratesCode(meal1, meal2);

	}

}
