import java.util.*;
public class IfStatementApp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter an integer balance");
		int balance = input.nextInt(); 
		
		System.out.println("Enter an amount of withdraw:");
		int amount = input.nextInt(); 
		
		if(balance < 0 || amount < 0 || amount>= balance) {
			System.out.println("Error: Launch the program again.");
			
		}
		else {
			balance = balance - amount; 
			System.out.println("Inital balance " + balance + "after withdrawing" + amount);
			System.out.println("has the resulting blaance " + balance);
		}
		
		
	input.close();	
	}

}
