import java.util.*;
public class ComputeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in); 
			
			System.out.println("Enter your name:");
			String name = input.nextLine();
			
			System.out.println(name + ", enter your filing status(1 - Single Filing; 2 - arried Filing): ");
			int status = input.nextInt();
			
			if (status == 1) {
				System.out.println(name + ", enter your taxable income: ");
				int income = input.nextInt(); 
			
			}
			else if (status==2) { 
		
			}
			else { 
				System.out.println("Illegal status: " + status);
			}
	
	}

}
