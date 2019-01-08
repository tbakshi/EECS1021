import java.util.*;
public class ConvertSecondsIntoMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner readin = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = readin.nextLine(); 
		
		System.out.println("Enter an integer for seconds:");
		int seconds = Integer.parseInt(readin.nextLine());
		int minutes = seconds/60; 
		int secondsModulo = seconds%60;
		
		System.out.print(name + ", your input "+ seconds +" seconds can be divided into "+ minutes + " minutes and " + secondsModulo + " seconds");
		
		readin.close();
	}

}
