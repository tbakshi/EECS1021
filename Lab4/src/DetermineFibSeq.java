import java.util.*;
public class DetermineFibSeq {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		int [] fibSeq =new int[20];
		fibSeq[0]=1;
		fibSeq[1]=1;
		for(int i = 1;i < 20-1; i++){
			fibSeq[i+1]=fibSeq[i]+fibSeq[i-1];
		}
		boolean check = true;


		while (check == true) {

			int [] user=new int[20];
			int sequenceCounter=0;
			boolean verify = true;

			for(int i=0;i<20;i++) {
				System.out.println("Enter a positive integer value, or -1 to stop:");
				int integerValue= input.nextInt();
				if(integerValue==-1) {
					break;
				}
				user[i]=integerValue;
				sequenceCounter++;
			}

			for(int i=0;i<sequenceCounter;i++) {
				if(fibSeq[i]==user[i]) {
					verify=true;
				}
				else {
					verify=false; 
					break;
				}
			}

			System.out.print("The sequence you entered  <");
			for(int i=0;i < sequenceCounter;i++) {

				if (i == sequenceCounter) {
					System.out.print(user[i]);

				}
				else {
					if(i==(sequenceCounter-1) ){ 
						System.out.print(user[i]);
					}
					else {
					System.out.print(user[i]+", ");
					}
				
				}
			}
			System.out.print(">");
			System.out.println();


			if(verify==true) {
				System.out.println("is the first "+sequenceCounter+"  numbers in the Fibonacci sequence.");
			}
			else if(verify==false) {
				System.out.println("is not the first "+sequenceCounter+" numbers in the Fibonacci sequence.");
			}
			System.out.println("Would you like to continue? (Y/N)");
			input.nextLine();
			String choice = input.nextLine();
			if (!(choice.equals("Y")||choice.equals("N"))){

				while (!(choice.equals("Y")||choice.equals("N"))) { 
					System.out.println("Error: "+ choice +" is not valid" );
					System.out.println("Would you like to process another sequence? (Y/N)");
					choice=input.nextLine();  
				}

			}

			if (choice.equals("Y")) {
				check = true;
			}
			else if (choice.equals("N")) {
				check = false;
			}
		}
		System.out.println("Bye!");
		input.close();
	}

}
