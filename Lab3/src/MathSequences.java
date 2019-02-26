import java.util.*;
public class MathSequences {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int counterOne = 0;

		while (counterOne < 1) {
			System.out.println("What kind of processing task would you like to perform?");
			System.out.println("1: Generate an arithmetic sequence.");
			System.out.println("2: Generate a geometric sequence.");
			System.out.println("3: Determine an arithmetic sequence.");
			int choice = input.nextInt();
			input.nextLine();

			if (choice == 1) {
				// ---------------------------------
				System.out.println("Enter the first term in the arithmetic sequence:");
				int firstTerm = input.nextInt();
				input.nextLine();

				System.out.println("Enter the common difference in the arithmetic seqence:");
				int commonDifference = input.nextInt();
				input.nextLine();

				System.out.println("Enter the number of terms in the arithmetic sequence:");
				int numberTerms = input.nextInt();
				input.nextLine();

				// ---------------------------------
				int[] sequence = new int [numberTerms];

				// ---------------------------------
				int j = 0;
				for (int i = 0; i < sequence.length; i++) {
					sequence[j] = firstTerm + (i * commonDifference);
					j++;
				}

				System.out.print("<");
				for (int i = 0; i <= (sequence.length - 2); i++) {
					System.out.print(sequence[i] + ", ");	
				}
				System.out.print(sequence[sequence.length - 1]);
				System.out.print(">");
				System.out.println(""); // Space

				// ---------------------------------
				int sum = 0;
				for (int i = 0; i < sequence.length; i++) {
					sum += sequence[i];
				}
				System.out.println("Sum of the arithmetic sequence: " + sum);

				// ---------------------------------
				int counterTwo = 0;
				while (counterTwo < 1) {
					// ---------------------------------
					System.out.println("Would you like to process another sequence? (Y/N)");
					String yorn = input.nextLine();
					// ---------------------------------
					if (yorn.equals("Y")) {
						counterOne = 0;
						counterTwo += 1;
					}
					else if (yorn.equals("N")) {
						System.out.println("Bye!");
						counterOne += 1;
						counterTwo += 1;
					}
					else {
						System.out.println("Invalid indication on continuation: " + yorn);
					}
				}
			}
			else if (choice == 2) {
				// ---------------------------------
				System.out.println("Enter the first term in the geometric sequence:");
				int firstTerm = input.nextInt();
				input.nextLine();

				System.out.println("Enter the common ratio in the geometric seqence:");
				int commonRatio = input.nextInt();
				input.nextLine();

				System.out.println("Enter the number of terms in the geometric sequence:");
				int numberTerms = input.nextInt();
				input.nextLine();

				// ---------------------------------
				int[] geoSequence = new int [numberTerms];

				geoSequence[0] = firstTerm;

				for (int i = 1; i < geoSequence.length; i++) {
					int temp = geoSequence[i-1];
					geoSequence[i] = temp * commonRatio;
				}

				System.out.print("<");
				for (int i = 0; i <= (geoSequence.length - 2); i++) {
					System.out.print(geoSequence[i] + ", ");	
				}
				System.out.print(geoSequence[geoSequence.length - 1]);
				System.out.print(">");
				System.out.println(""); 

				// ---------------------------------
				int sum = 0;
				for (int i = 0; i < geoSequence.length; i++) {
					sum += geoSequence[i];
				}
				System.out.println("Sum of the geometric sequence: " + sum);

				// ---------------------------------
				int bbw = 0;
				while (bbw < 1) {
					// ---------------------------------
					System.out.println("Would you like to process another sequence? (Y/N)");
					String anotherSequence = input.nextLine();
					// ---------------------------------
					if (anotherSequence.equals("Y")) {
						counterOne = 0;
						bbw += 1;
					}
					else if (anotherSequence.equals("N")) {
						System.out.println("Bye!");
						counterOne += 1;
						bbw += 1;
					}
					else {
						System.out.println("Invalid indication on continuation: " + anotherSequence);
					}
				}
			}
			else if (choice == 3) {
				// ---------------------------------
				int[] ia = new int [10];

				int i = 1;
				int l = 0;
				// ---------------------------------
				for (; i < 11; i++) {				
						System.out.println("Enter a new number:");
						ia[l] = input.nextInt();
						input.nextLine();	
						l++;
						if(l==10) {
							break;
						}
						System.out.println("You have entered " + i + " numbers.");
						System.out.println("You may still enter another " + (ia.length-i) + " numbers."); 

						System.out.println("Would you like to enter another new number? (Y/N)");
						String ans = input.nextLine();

						
					
				
						if (ans.equals("N")) {
							i = 12;
						}					

				}
				// ---------------------------------
				if (l == 1) {
					System.out.println("Error: we cannot infer the common difference from a sequence of size one.");
				}
				else if (l == 10) {
					System.out.println("You have entered the maximum number of numbers!");
					System.out.println("We will start processing your sequence right away.");
				}

				boolean checkR = false;
				boolean flsecheckR = true;

				int d = 0;
				int p = 0;
				if (l != 1) {
				
					for (int o = 0; o<=9; o++) {
						if (ia[o] != 0) {
						p++;
						}
					}
					
					int sum = 0;
					for (int c = 0; c < ia.length; c++) {
						sum += ia[c];
					}

					int[] aritth = new int [p];

					for (int o = 0; o <= 9; o++) {
						if (ia[o] != 0) {
							aritth[o] = ia[o];	
						}
					}

					// ---------------------------------
					d = aritth[1] - aritth[0];
					if (p == 2) {
						checkR = true;
					}
					else {
						for (int z = 0; z <=(p-4); z++) {
							if ((aritth[(z+1)] - aritth[z]) == d){
								if(aritth[z+2] - aritth[z+1] == d) {
									if (aritth[z+3] - aritth[z+2] == d) {
										checkR = true;
									}
									else {
										flsecheckR = false;
									}
								}
								else {
									flsecheckR = false;
								}
							}
							else {
								flsecheckR = false;
							}
						}
					}

					// ---------------------------------
					if (flsecheckR == false) {
						// ---------------------------------
						System.out.print("<");
						for (int j = 0; j <= (aritth.length - 2); j++) {
							System.out.print(aritth[j] + ", ");	
						}
						System.out.print(aritth[aritth.length - 1]);
						System.out.print(">");
						System.out.print(" is not an arithmetic sequence.");
						System.out.println("");
					}
					else if (checkR == true) {
						// ---------------------------------
						System.out.print("<");
						for (int j = 0; j <= (aritth.length - 2); j++) {
							System.out.print(aritth[j] + ", ");	
						}
						System.out.print(aritth[aritth.length - 1]);
						System.out.print(">");
						System.out.print(" is an arithmetic sequence \nwith first term " + aritth[0] + ", common difference " + d + ", length " + p + ", and sum " + sum);
					}
					else {

					}
				}
				
				// ---------------------------------
				int bbw = 0;
				while (bbw < 1) {
					// ---------------------------------
					System.out.println("Would you like to process another sequence? (Y/N)");
					String continuationSequence = input.nextLine();
					// ---------------------------------
					if (continuationSequence.equals("Y")) {
						counterOne = 0;
						bbw += 1;
					}
					else if (continuationSequence.equals("N")) {
						System.out.println("Bye!");
						counterOne += 1;
						bbw += 1;
					}
					else {
						System.out.println("Invalid indication on continuation: " + continuationSequence);
					}
				}
			}
			else {
				System.out.println("Error: task number must be 1, 2, or 3.");
			}
		}
		input.close();

	}

}
