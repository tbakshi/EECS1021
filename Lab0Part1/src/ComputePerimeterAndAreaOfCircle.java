import java.util.*;
public class ComputePerimeterAndAreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	COMMMMMNETTTTTTT
		
		Scanner readin = new Scanner(System.in);
		System.out.println("Enter an integer for radius:");
		int radius = Integer.parseInt(readin.nextLine());
		double perimeter = 2*3.14*radius; 
		double area = radius*radius*2*3.14;
		
		System.out.println("What's your name?"); 
		String name = readin.nextLine(); 
		
		System.out.println(name +", your input circle with radius " + radius +" has perimeter " + perimeter + " and area " + area );
		
	}

}
