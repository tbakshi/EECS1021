import java.util.Scanner;

public class PrintBetweenNumbers4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice = "Y"; 
		int i;
			
		
		while(choice.equals("Y")) {
			System.out.println("Enter a lower bound:");
			int lowerBound = input.nextInt(); 
			
			System.out.println("Enter a upper bound:");
			int upperBound = input.nextInt();
			System.out.println("Enter a middle number:");
			int middle = input.nextInt();
			
			if(lowerBound>=upperBound) {
				System.out.println("Error: lower bound is not less than or equal to the upper bound.");
			}
			
			else if (!(middle >= lowerBound) || !(middle <= upperBound) ) { 
				System.out.println("Error: middle number " + middle + " is not in-between the lower bound "+lowerBound + " and the upper bound " + upperBound);
			}
			
			else {
				System.out.println("Odd numbers between "+lowerBound + " and " + middle);
				for(i = lowerBound; i <(middle+1);i++) {
					if (i%2 !=0) {
						System.out.println(i);
					}
				}
				System.out.println("Even numbers between "+ middle + " and " + upperBound);
				for(i = middle; i <(upperBound+1);i++) {
					if (i%2 ==0) {
						System.out.println(i);
					}	
				}
			}
		
				while(!choice.equals("N")) {
					System.out.println("Would you like to contineue printing(Enter Y for yes; N for no)");
					choice = input.next();
					if(choice.equals("Y")){
						break;
					}
					else if (!choice.equals("Y") && !choice.equals("N")) {
						System.out.println("Error: "+ choice + " is not valid" );
					}
				}
		
		}
		System.out.println("Bye!");
		input.close();
	}

}
