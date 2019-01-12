
public class LogicalOperations2 {

	public static void main(String[] args) {
		boolean p = false; 
		boolean q  = false; 
		boolean conjuction = p && q; 
		System.out.println("Conjuction of " + p + " and " + q + " is: " + conjuction);  
		System.out.println("Disjunction of " + p + " and " + q + " is: " + (p || q));  

		
		p = false; 
		q  = true; 
		conjuction = p && q; 
		System.out.println("Conjuction of " + p + " and " + q + " is: " + conjuction);  
		System.out.println("Disjunction of " + p + " and " + q + " is: " + (p || q));  
	
		p = true; 
		q  = false; 
		conjuction = p && q; 
		System.out.println("Conjuction of " + p + " and " + q + " is: " + conjuction);  
		System.out.println("Disjunction of " + p + " and " + q + " is: " + (p || q));  
	
		p = true; 
		q  = true; 
		conjuction = p && q; 
		System.out.println("Conjuction of " + p + " and " + q + " is: " + conjuction);  
		System.out.println("Disjunction of " + p + " and " + q + " is: " + (p || q));  
	}

}
