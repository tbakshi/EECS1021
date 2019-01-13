import java.util.*;
public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Enter the 1st string:");
		String string1 = input.nextLine(); 
		
		System.out.println("Enter the 2nd string:");
		String string2 = input.nextLine();
		
		System.out.println("Enter the 3rd string:");
		String string3 = input.nextLine(); 
		
		System.out.println("Enter the 4th string:");
		String string4= input.nextLine(); 
		
	
		
		System.out.println("Enter the 1st integer:");
		int int1 = input.nextInt(); 
		
		System.out.println("Enter the 2nd integer:");
		int int2 = input.nextInt(); 
		
		System.out.println("Enter the 3rd integer:");
		int int3 = input.nextInt(); 
		
		System.out.println("Enter the 4th integer:");
		int int4 = input.nextInt(); 
		
		input.close(); 
		
		
		System.out.println("Here are all 16 possible combinations: \n("
						+ string1 + ", " + int1 + ") \n" + "("
						+ string1 + ", " + int2 + ") \n" + "("
						+ string1 + ", " + int3 + ") \n"+ "("
						+ string1 + ", " + int4 + ") \n" + "("
						+ string2 + ", " + int1 + ") \n" + "("
						+ string2 + ", " + int2 + ") \n" + "("
						+ string2 + ", " + int3 + ") \n" + "("
						+ string2 + ", " + int4 + ") \n" +"("
						+ string3 + ", " + int1 + ") \n" + "("
						+ string3 + ", " + int2 + ") \n" + "("
						+ string3 + ", " + int3 + ") \n" + "("
						+ string3 + ", " + int4 + ") \n" + "("
						+ string4 + ", " + int1 + ") \n" +"("
						+ string4 + ", " + int2 + ") \n" + "("
						+ string4 + ", " + int3 + ") \n" + "("
						+ string4 + ", " + int4 + ") \n"); 
		
	}

}
