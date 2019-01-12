import java.util.Scanner;

public class LogicalOperationApp1a {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		System.out.println("Enter an ineger: " );
		int i = input.nextInt(); 
		boolean isPositive = i>0; 
		System.out.println("The number you entered was postive " + isPositive);

		
		input.close(); 
	}

}
