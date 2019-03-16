package model;

public class Student {
	public String name; 
	public final int MAX_NUM_COURSES = 5; 
	public CourseRecord [] courses; 
	public int noc; 
	
	public Student (String name) { 
		this.name = name; 
		this.courses = new CourseRecord[MAX_NUM_COURSES];
		this.noc = 0; 
	}
	
	public void addCourse(CourseRecord c) {
		this.courses[this.noc] = c; 
		this.noc++;
		
	}
	
	public String getDescription() { 
		String result = ""; 
		result += "Student" + this.name + " has registered " + this.noc + " courses:";
		for(int i =0; i< this.courses.length; i++) {
			result += this.courses[i] + "\n";
		}
		
		return result; 
	}
}
