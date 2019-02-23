import java.util.*;
public class GenerateFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice = 'Y'; 

		while (choice == 'Y') {
			System.out.println("Enter the size of a Fibonacci Sequence:");
			int size = input.nextInt();

			if(size<= 0) { 
				System.out.println("Error: Fibonacci Sequence must have size >= 1.");
			}
			else {
				
				for(int i =0; i<(size+1); i++) {
					
				}

			}

			System.out.println("Would you like to continue? (Y/N)");
			choice = input.next().toUpperCase().charAt(0);
		}

		input.close();
	}


}
