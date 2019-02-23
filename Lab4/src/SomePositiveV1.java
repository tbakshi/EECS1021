
public class SomePositiveV1 {

	public static void main(String[] args) {

		int[] ns = {2,3,-1,4,5};
		boolean somePos = true; 
		for(int i =0; i<ns.length; i++) {
			somePos = somePos && ns[i] >0; 
		}
		System.out.println("Some (at least one) element in array is positive: " + somePos);
		 
	}

}
