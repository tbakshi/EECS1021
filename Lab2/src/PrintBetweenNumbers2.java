import java.util.Scanner;

public class PrintBetweenNumbers2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice = 'Y'; 
			
		
		while(choice =='Y') {
			System.out.println("Enter a lower bound:");
			int lowerBound = input.nextInt(); 
			
			System.out.println("Enter a upper bound:");
			int upperBound = input.nextInt();
		if(lowerBound>=upperBound) {
			System.out.println("Error: lower bound " + lowerBound + " is not less than or equal to the upper bound " + upperBound +".");
			
		}
		else {
			for(int i = lowerBound; i <(upperBound+1);i++) {
				System.out.println(i);
			}	
		}
		System.out.println("Would you like to contineue printing(Y/N)");
		choice = input.next().toUpperCase().charAt(0);
		
	}
		
			
		
		System.out.println("Bye!");

		input.close();
	}

}
