import java.util.*;
public class MathSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		char choice = 'Y';
		
		while(choice =='Y') {
				System.out.println("What kind of processing task would you like to perform?"); 
				System.out.println("1: Generate an arithmetic sequence. \n2: Generate a geometric sequence \n3: Determine an arithmetic sequence. " );
				int option = input.nextInt(); 
				
				
				if(option == 1) {
					System.out.println("Enter the first term in the arithmetic sequence:");
					int firstTerm = input.nextInt();
					System.out.println("Enter the common difference in the arithmetic seqence:");
					int difference = input.nextInt();
					System.out.println("Enter the number of terms in the arithmetic sequence:");
					int numberofTerms = input.nextInt();
					
					
					int[] numList = new int [numberofTerms];
					for (int i = 0; i < numList.length; i++) {
						numList[i] = firstTerm + (i * difference);
					}
					
					System.out.print("<");
					for (int i = 0; i <= (numList.length - 2); i++) {
						System.out.print(numList[i] + ", ");	
					}
					System.out.print(numList[numList.length - 1]);
					System.out.print(">\n");

					int sum = 0;
					for (int i = 0; i < numList.length; i++) {
						sum += numList[i];
					}
					System.out.println("Sum of the arithmetic sequence: " + sum);
					System.out.println("Would you like to process another sequence (Y/N)");
					choice = input.next().toUpperCase().charAt(0);			
				}
				
				
				
				
				else if  (option==2 ) {
					System.out.println("Enter the first term in the geometric sequence:");
					int firstTerm = input.nextInt();
					input.nextLine();

					System.out.println("Enter the common ratio in the geometric seqence:");
					int commonRatio = input.nextInt();
					input.nextLine();

					System.out.println("Enter the number of terms in the geometric sequence:");
					int numberofTerms = input.nextInt();
					input.nextLine();
					
					int[] numList = new int [numberofTerms];
					numList[0] = firstTerm;
					for (int i = 1; i < numList.length; i++) {
						numList[i] = numList[i-1] * commonRatio;
					}
					System.out.print("<");
					for (int i = 0; i <= (numList.length - 2); i++) {
						System.out.print(numList[i] + ", ");	
					}
					System.out.print(numList[numList.length - 1]);
					System.out.print(">\n");

					
					int sum = 0;
					for (int i = 0; i < numList.length; i++) {
						sum += numList[i];
					}
					System.out.println("Sum of the geometric sequence: " + sum);		
					System.out.println("Would you like to process another sequence (Y/N)");
					choice = input.next().toUpperCase().charAt(0);
				}
				
				
				
				
				else if (option==3) {
					int[] numList = new int [10];
					int i = 0;
					int j = 0;
					String continueSelection = "Y";
					for (; i < 11; i++) {
						j++;
						System.out.println("Enter a new number:");
						numList[i] = input.nextInt();
						if (j==10) {
							break;
						}
						
						System.out.println("You have entered " + j + " numbers.");
						System.out.println("You may still enter another " + (numList.length-j) + " numbers."); 

						System.out.println("Would you like to enter another new number? (Y/N)");
						 continueSelection = input.next().toUpperCase();
						if (continueSelection.equals("N")) {

							break;
						}
					}
					
					// works till hereee
					
					if (j == 1) {
						System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
					}
					else if (j== 10) {
						System.out.println("You have entered the maximum number of numbers! \nWe will start processing your sequence right away.");

						int[] Arith = new int [i];

						for (int o = 0; o <= 9; o++) {
							if (numList[o] != 0) {
								Arith[o] = numList[o];	
							}
						}
						boolean isArith = false; 
						
						int diff = Arith[1] -Arith[0];
						for(int k = 0; k < Arith.length -1; k++){
							if(Arith[k+1] - Arith[k] != diff)
								isArith = false; 
						}
						isArith = true;
						

						if (isArith == false) {
							System.out.print("<");
							for (int m = 0; m <= (Arith.length - 2); m++) {
								System.out.print(Arith[m] + ", ");	
							}
							System.out.print(Arith[Arith.length - 1]);
							System.out.print(">");
							System.out.print(" is not an arithmetic sequence.");
							System.out.println("");
						}
						else if (isArith == true) {
							System.out.print("<");
							for (int j1 = 0; j1 <= (Arith.length - 2); j1++) {
								System.out.print(Arith[j1] + ", ");	
							}
							int sum = 0;
							for (int c = 0; c < Arith.length; c++) {
								sum += Arith[c];
							}
							System.out.print(Arith[Arith.length - 1]);
							System.out.print(">");
							System.out.print(" is an arithmetic sequence with");
							System.out.println("first term " + Arith[0] + ", common difference " + diff + ", length " + numList.length + ", and sum " + sum);
						}
					}
					else if (j!=10 && j!=1){
						int[] Arith = new int [i];

						for (int o = 0; o <= 9; o++) {
							if (numList[o] != 0) {
								Arith[o] = numList[o];	
							}
						}
						boolean isArith = false; 
						
						int diff = Arith[1] -Arith[0];
						for(int k = 0; k < Arith.length -1; k++){
							if(Arith[k+1] - Arith[k] != diff)
								isArith = false; 
						}
						isArith = true;
						

						if (isArith == false) {
							System.out.print("<");
							for (int m = 0; m <= (Arith.length - 2); m++) {
								System.out.print(Arith[m] + ", ");	
							}
							System.out.print(Arith[Arith.length - 1]);
							System.out.print(">");
							System.out.print(" is not an arithmetic sequence.");
							System.out.println("");
						}
						else if (isArith == true) {
							System.out.print("<");
							for (int j1 = 0; j1 <= (Arith.length - 2); j1++) {
								System.out.print(Arith[j1] + ", ");	
							}
							int sum = 0;
							for (int c = 0; c < Arith.length; c++) {
								sum += Arith[c];
							}
							System.out.print(Arith[Arith.length - 1]);
							System.out.print(">");
							System.out.print(" is an arithmetic sequence with");
							System.out.println("first term " + Arith[0] + ", common difference " + diff + ", length " + numList.length + ", and sum " + sum);
						}
					}

					
					System.out.println("Would you like to process another sequence? (Y/N)");
					choice = input.next().toUpperCase().charAt(0);

				}
				
				
				
				
				else {
					System.out.println("Error task number must be 1, 2, or 3");
				}
					
		}
		
		
		System.out.println("Bye!");
		input.close(); 
	}

}
