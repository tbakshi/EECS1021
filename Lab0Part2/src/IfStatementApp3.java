import java.util.*;
public class IfStatementApp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter an integer balance");
		int initialBalance = input.nextInt(); 
		
		System.out.println("Enter an amount of withdraw:");
		int amount = input.nextInt(); 
		
		if(initialBalance < 0 ) {
			System.out.println("Error: Initial balance should not be negative.");
			
		}
			else if (amount <0) {
				System.out.println("Error: Amount to withdraw should not be negative.");

		}
			else if (amount>= initialBalance) {
				System.out.println("Error: Amount to withdraw should not be smaller than balance.");

		}
		
	
		else {
			initialBalance = initialBalance - amount; 
			System.out.println("Inital balance " + initialBalance + "after withdrawing" + amount);
			System.out.println("has the resulting blaance " + initialBalance);
		}
		
		
	input.close();	
	}

}
