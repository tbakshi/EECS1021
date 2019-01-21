import java.util.*;
public class ComputeTax {

	public static void main(String[] args) {
		
		final double RATE1 = 0.10; 
		final double RATE2 = 0.15; 
		final double RATE3 = 0.25;
		
		final double SINGLE_LIMIT1 = 8350;
		final double SINGLE_LIMIT2 = 33950;
		final double MARRIED_LIMIT1=16700;
		final double MARRIED_LIMIT2=67900;
		
		
		double tax1 =0; 
		double tax2 =0;
		double tax3 =0; 
		double taxfinal =0; 
		
		double income = 0;
		Scanner input = new Scanner(System.in); 
			
			System.out.println("Enter your name:");
			String name = input.nextLine();
			
			System.out.println(name + ", enter your filing status(1 - Single Filing; 2 - arried Filing): ");
			int status = input.nextInt();
			
			if (status == 1) {
				System.out.println(name + ", enter your taxable income: ");
				income = input.nextDouble(); 
				if (income <= SINGLE_LIMIT1) {
					tax1  = RATE1*income; 
					}
				else if(income > SINGLE_LIMIT1 && income < SINGLE_LIMIT2) { 
					tax1 = RATE1 * SINGLE_LIMIT1; 
					tax2 = RATE2 *(income - SINGLE_LIMIT1);
				}
				else if ( income >= SINGLE_LIMIT2 ) {
					tax1 = RATE1 * SINGLE_LIMIT1; 
					tax2 = RATE2 *(income - SINGLE_LIMIT1);
					tax3 = RATE3*(income - SINGLE_LIMIT1 - SINGLE_LIMIT2);
					
				}
				taxfinal = tax1+tax2+tax3; 
				System.out.println(name + ", you should pay $"  + taxfinal);
				System.out.println("Calculation is based on the scheme of Single Filing: "); 
				System.out.println("Part I: $" +tax1)
						
			}
			else if (status==2) { 
				if (income<= MARRIED_LIMIT1) {
					tax1= RATE1*income; 
				}
				else { 
					tax1 = RATE1 * MARRIED_LIMIT1; 
					tax2 = RATE2 *(income - MARRIED_LIMIT1);
				}
		
			}
			else { 
				System.out.println("Illegal status: " + status);
			}
	
	}

}
