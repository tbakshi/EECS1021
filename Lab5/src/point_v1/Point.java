package point_v1;

public class Point {
	double x; 
	double y; 
	
	Point(double newX, double newY){
		x = newX; 
		y = newY; 
	}
	
	Point(char axis, double distance){ 
		if( axis =='x') {
			x = distance; 
			y=0; 
		}
		
		else { 
		x=0; 
		y = distance; 
		}
	}
	
	/*Point (double distanceFromXAxis){ 
		
	}
	
	Point(double distanceFromYAxis){ 
		
	}*/
	
	
}
