import java.util.*;
public class BankApp1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter a blance(e.g., 200.45):");
		double balance = input.nextDouble();
		input.nextLine();
		
		
		if (0 < balance && balance <= 1000) {
			//Valid initial blaance  
		}
		else {
			System.out.println("Error: initial balance " + balance + "is not in (0, 1000].");
			
		}
		
		/* -------------------- STAGE 2 --------------------*/
		System.out.println("Enter a transaction type: \"d\" or \'w\"):" );
		String type = input.nextLine(); 
		if(type.equals("d")) {
			// valid transaction type 
		}
				
		else if (type.equals("w")) {
			//valid transaction type 
		}
		
		else {
			System.out.println("Error: transactoin type " + type + " is neither d nor w.");
		}
			
		/* -------------------- STAGE 3 --------------------*/
		System.out.println("Enter an amount for " + type + ": " );
		double amount = input.nextDouble(); 
		input.hasNextLine(); 
		
		if (type.equals("d")) {
			if ( amount <=0) {
				System.out.println("Error: deposit amount is not positive.");
				
			}
			else if (balance + amount > 1000) {
				System.out.println("Error: deposit amount is too large." );
				
			}
			else {
				balance = balance + amount; 
				balance += amount; 
			}
			
		} 
		else if (type.equals("w")) {
			if ( amount <=0) {
				System.out.println("Error: deposit amount is not positive.");
				
			}
			else if (amount >= balance) {
				System.out.println("Error: withdraw amount is too large." );
				
			}
			else {
				balance = balance - amount; 
				balance -= amount; 
			}
			
		}
		/* -------------------- STAGE 4 --------------------*/

			System.out.println("Resulting balance after performing transactions of type" + type + "with $" + amount+ ": " + balance);
		

		
input.close();
	}

}
