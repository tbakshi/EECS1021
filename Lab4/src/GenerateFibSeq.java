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
				int first = 1;
				int second = 0;
				int nextNumb = 1; 
				System.out.print("<");
				for(int i =0; i<(size); i++) {
					if(i==(size-1)) {
						nextNumb = first + second; 
						first = second; 
						second = nextNumb;
						System.out.print(nextNumb);

					}
					else {
					nextNumb = first + second; 
					first = second; 
					second = nextNumb; 
				System.out.print(nextNumb + ", ");
				
				}
				}
				System.out.println(">");

			}

			System.out.println("Would you like to continue? (Y/N)");
			choice = input.next().toUpperCase().charAt(0);
		}
		System.out.println("Bye!");
		input.close();
	}


}
