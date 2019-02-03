import java.util.Scanner;

public class PrintBetweenNumbers3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice = "Y"; 
			
		
		while(choice.equals("Y")) {
			System.out.println("Enter a lower bound:");
			int lowerBound = input.nextInt(); 
			
			System.out.println("Enter a upper bound:");
			int upperBound = input.nextInt();
		if(lowerBound>=upperBound) {
			System.out.println("Error: lower bound is not less than or equal to the upper bound.");
			
		}
		else {
			for(int i = lowerBound; i <(upperBound+1);i++) {
				System.out.println(i);
			}	
		}
		
		while(!choice.equals("N")) {
			System.out.println("Would you like to contineue printing(Enter Y for yes; N for no)");
		choice = input.next();
		
		if(choice.equals("Y")){
			break;
		}
		
		else if (!choice.equals("Y") && !choice.equals("N")) {
			System.out.println("Invalid indication on continuation: " + choice);
		}
		
			}
		
	}
		
			
		
		System.out.println("Bye!");

		input.close();
	}

}
