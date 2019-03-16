package tests;
import model.Faculty;

public class FacultyTester {

	public static void main(String[] args) {
		Faculty f1 =  new Faculty("Jackie", "LAS2043", 70310);
		Faculty f2 =  new Faculty("Jonathan", "LAS2045", 70209);
		System.out.println("f1 and f2 store same address" + (f1==f2));
		System.out.println(f1.getDescription());
		System.out.println(f2.getDescription());



		Faculty f3 =  new Faculty("Jackie", "LAS2043", 70310);
		/* Q1: are f1 and f3 the same object? 
		 *
		 * Q2: Do f1 and f3 have the same contents (attribute values) ?
		 */

		// Q1: FALSE, they are not the same object 
		System.out.println("f1 and f3 are the same object: " +(f1==f3));
		//Q2: TRUE, as they have the same contents within. Such as this.name equals name
		// same applies for address and extension
		System.out.println("f1 and f3 have the same contents " + f1.getDescription().equals(f3.getDescription()));

		Faculty f4 = f1; 
		/* Q1: are f1 and f4 the same object? 
		 *
		 * Q2: Do f1 and f4 have the same contents (attribute values) ? 
		 */

		// Q1: TRUE, since f1 is set to equal f1 they are the same object 
		System.out.println("f1 and f4 are the same object: " +(f1==f4));
		//Q2: TRUE, as they have the same contents within. Such as this.name equals name
		// same applies for address and extension
		System.out.println("f1 and f4 have the same contents " + f1.getDescription().equals(f4.getDescription()));

		
		f1.setName("Heeyeon");
		System.out.println("f1: " + f1.getDescription());
		System.out.println("f4: " + f4.getDescription());
	}

}
