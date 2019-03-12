package point_v2;

public class PointTester {

	public static void main(String[] args) {
	 Point p1 = new Point (3,-4) ;
		Point p2 = new Point (-2, -7); 
		Point p3 = new Point ('y', 8); 
		Point p4 = new Point ('x' , -5);

		System.out.println(p1);
		System.out.println(p2);
		System.out.println("p1 and p2 store different addresses:" + (p1 != p2));
		System.out.println("p1 and p2 store same addresses:" + (p1 == p2));

		System.out.println(p3);
		System.out.println(p4);


		String desc1 = p1.getDescription(); 
		String desc2 = p3.getDescription(); 

		double dist1 = p1.getDistanceFromOrigin(); 
		double dist2 = p3.getDistanceFromOrigin();

		double dist3 = p1.getDistanceFrom(p3);

		System.out.println("Description of p1: " + desc1);
		System.out.println("Description of p3: " + desc2);
		System.out.println("Distance of p1 from (0,0):  " + desc1);
		System.out.println("Distance of p3 from (0,0):  " + desc2);
		System.out.println("Distance of p1 to p3:  " + dist3);




		p1.move('R', 3.2); 
		p3.move('D', 4.7);
		System.out.println("After moving p1 and p3");
		desc1 = p1.getDescription(); 
		desc2 = p3.getDescription(); 

		dist1 = p1.getDistanceFromOrigin(); 
		dist2 = p3.getDistanceFromOrigin();

		dist3 = p1.getDistanceFrom(p3);

		System.out.println("Description of p1: " + desc1);
		System.out.println("Description of p3: " + desc2);
		System.out.println("Distance of p1 from (0,0):  " + desc1);
		System.out.println("Distance of p3 from (0,0):  " + desc2);
		System.out.println("Distant of p1 to p3:  " + dist3);	
		

	}
}
