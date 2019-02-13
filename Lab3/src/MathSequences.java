import java.util.Scanner;

public class MathSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int anotha1 = 0;

		while (anotha1 < 1) {
			System.out.println("What kind of processing task would you like to perform?");
			System.out.println("1: Generate an arithmetic sequence.");
			System.out.println("2: Generate a geometric sequence.");
			System.out.println("3: Determine an arithmetic sequence.");
			int proctask = input.nextInt();
			input.nextLine();

			if (proctask == 1) {
				// ---------------------------------
				System.out.println("Enter the first term in the arithmetic sequence:");
				int firstterm = input.nextInt();
				input.nextLine();

				System.out.println("Enter the common difference in the arithmetic seqence:");
				int commdiff = input.nextInt();
				input.nextLine();

				System.out.println("Enter the number of terms in the arithmetic sequence:");
				int numbterms = input.nextInt();
				input.nextLine();

				// ---------------------------------
				int[] ia = new int [numbterms];

				// ---------------------------------
				int j = 0;
				for (int i = 0; i < ia.length; i++) {
					ia[j] = firstterm + (i * commdiff);
					j++;
				}

				System.out.print("<");
				for (int i = 0; i <= (ia.length - 2); i++) {
					System.out.print(ia[i] + ", ");	
				}
				System.out.print(ia[ia.length - 1]);
				System.out.print(">");
				System.out.println(""); // Space

				// ---------------------------------
				int sum = 0;
				for (int i = 0; i < ia.length; i++) {
					sum += ia[i];
				}
				System.out.println("Sum of the arithmetic sequence: " + sum);

				// ---------------------------------
				int bbw = 0;
				while (bbw < 1) {
					// ---------------------------------
					System.out.println("Would you like to process another sequence? (Y/N)");
					String yorn = input.nextLine();
					// ---------------------------------
					if (yorn.equals("Y")) {
						anotha1 = 0;
						bbw += 1;
					}
					else if (yorn.equals("N")) {
						System.out.println("Bye!");
						anotha1 += 1;
						bbw += 1;
					}
					else {
						System.out.println("Invalid indication on continuation: " + yorn);
					}
				}
			}
			else if (proctask == 2) {
				// ---------------------------------
				System.out.println("Enter the first term in the geometric sequence:");
				int firstterm = input.nextInt();
				input.nextLine();

				System.out.println("Enter the common ratio in the geometric seqence:");
				int commrat = input.nextInt();
				input.nextLine();

				System.out.println("Enter the number of terms in the geometric sequence:");
				int numbterms = input.nextInt();
				input.nextLine();

				// ---------------------------------
				int[] ia = new int [numbterms];

				ia[0] = firstterm;

				for (int i = 1; i < ia.length; i++) {
					int temp = ia[i-1];
					ia[i] = temp * commrat;
				}

				System.out.print("<");
				for (int i = 0; i <= (ia.length - 2); i++) {
					System.out.print(ia[i] + ", ");	
				}
				System.out.print(ia[ia.length - 1]);
				System.out.print(">");
				System.out.println(""); // Space

				// ---------------------------------
				int sum = 0;
				for (int i = 0; i < ia.length; i++) {
					sum += ia[i];
				}
				System.out.println("Sum of the geometric sequence: " + sum);

				// ---------------------------------
				int bbw = 0;
				while (bbw < 1) {
					// ---------------------------------
					System.out.println("Would you like to process another sequence? (Y/N)");
					String yorn = input.nextLine();
					// ---------------------------------
					if (yorn.equals("Y")) {
						anotha1 = 0;
						bbw += 1;
					}
					else if (yorn.equals("N")) {
						System.out.println("Bye!");
						anotha1 += 1;
						bbw += 1;
					}
					else {
						System.out.println("Invalid indication on continuation: " + yorn);
					}
				}
			}
			else if (proctask == 3) {
				// ---------------------------------
				int[] ia = new int [10];

				int i = 1;
				int l = 0;
				// ---------------------------------
				for (; i < 11; i++) {
					System.out.println("Enter a new number:");
					ia[l] = input.nextInt();
					input.nextLine();	

					System.out.println("You have entered " + i + " numbers.");
					System.out.println("You may still enter another " + (ia.length-i) + " numbers."); 

					System.out.println("Would you like to enter another new number? (Y/N)");
					String ans = input.nextLine();

					l++;

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
				else {
					System.out.println("We will start processing your sequence right away.");
				}
				boolean checkR = false;
				boolean flsecheckR = true;

				int d = 0;
				int p = 0;
				// ---------------------------------
				if (l == 1) {
					//Nothing happens!
				}
				else {
					// ---------------------------------
					for (int o = 0; o<=9; o++) {
						if (ia[o] != 0) {
						p++;
						}
					}
					
					// ---------------------------------
					int sum = 0;
					for (int c = 0; c < ia.length; c++) {
						sum += ia[c];
					}

					// ---------------------------------
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
						System.out.print(" is an arithmetic sequence with");
						System.out.println("first term " + aritth[0] + ", common difference " + d + ", length " + p + ", and sum " + sum);
					}
					else {
						System.out.println("Dis does work its just not able to read the above two statements!");
					}
				}
				
				// ---------------------------------
				int bbw = 0;
				while (bbw < 1) {
					// ---------------------------------
					System.out.println("Would you like to process another sequence? (Y/N)");
					String yorn = input.nextLine();
					// ---------------------------------
					if (yorn.equals("Y")) {
						anotha1 = 0;
						bbw += 1;
					}
					else if (yorn.equals("N")) {
						System.out.println("Bye!");
						anotha1 += 1;
						bbw += 1;
					}
					else {
						System.out.println("Invalid indication on continuation: " + yorn);
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

