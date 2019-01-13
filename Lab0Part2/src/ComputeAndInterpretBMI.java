import java.util.*;
public class ComputeAndInterpretBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter your name: " );
		String name = input.nextLine();

		System.out.println(name + ", enter your height in inches:");
		int height = input.nextInt();
		System.out.println(name + ", enter your weight in pounds:");
		int weight = input.nextInt();

		double heightInMeters = height *0.0254;
		double weightInKilograms = weight*0.45359237; 
		
		double bmi = weightInKilograms/(heightInMeters*heightInMeters);
		
		System.out.println(name+", you BMI is "+ bmi );
		if(bmi < 18.5) {
			System.out.println("You are underweight");
		}
		else if (bmi>= 18.5 && bmi < 25 ) { 
			System.out.println("You are normal");
		}
		else if(bmi>= 25 && bmi <30) {
			System.out.println("You are overweight");
		} 
		else if(bmi >= 30) { 
			System.out.println("You are obese");
		}
		
			input.close();	
			
		}

	}

