import java.util.Scanner; 
public class LogicalOperationApp1b {

	public static void main(String[] args) {
		// Develop a console applicaiton that determines if the user's entered ingeger is postive
		
		Scanner input = new Scanner(System.in); 
		System.out.println("Enter an ineger: " );
		int i = input.nextInt(); 
		boolean isLessThanOrEqualToZero = i<=0; 
		System.out.println("The number you entered was postive" + isLessThanOrEqualToZero);

		
		input.close(); 
	}

}
