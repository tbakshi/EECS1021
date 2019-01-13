import java.util.*;
public class SumofCrossProduct {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in); 
		
		System.out.println("Enter the 1st integer in sequence 1:");
		int seq1int1 = input.nextInt(); 
		System.out.println("Enter the 2nd integer in sequence 1:");
		int seq1int2 = input.nextInt(); 
		System.out.println("Enter the 3rd integer in sequence 1:");
		int seq1int3=input.nextInt(); 
		System.out.println("Enter the 4th integer in sequence 1:");
		int seq1int4 = input.nextInt(); 

		System.out.println("Enter the 1st integer in sequence 2:");
		int seq2int1 = input.nextInt(); 
		System.out.println("Enter the 2nd integer in sequence 2:");
		int seq2int2 = input.nextInt(); 
		System.out.println("Enter the 3rd integer in sequence 2:");
		int seq2int3 = input.nextInt(); 
		System.out.println("Enter the 4th integer in sequence 2:");
		int seq2int4 = input.nextInt(); 
		
		int corssProduct = (seq1int1*seq2int1)+ (seq1int2 * seq2int2)+(seq1int3 * seq2int3) + (seq1int4*seq2int4);
		
		System.out.println("sum(["+ seq1int1 +", "+ seq1int2 +", " + seq1int3 +", " + seq1int4 +"] * "+
				"["+ seq2int1 +", "+ seq2int2 +", " + seq2int3 +", " + seq2int4 +"]) = " + corssProduct );	
		input.close();
		
	}

}
