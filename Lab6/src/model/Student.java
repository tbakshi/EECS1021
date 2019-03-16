package model;

public class Student {
	public String name; 
	public final int MAX_NUM_COURSES = 5; 
	public CourseRecord [] courses; 
	public int noc; 
	
	
	public int getMarks(String title) {
		int marks = 0;
		
		int index = this.indexOf(title);
		if(index > 0) { 
			marks = this.courses[index].getMarks();
		}
		else { 
			marks = -1;
		}
		boolean found = false; 
		for (int i =0; i<this.noc; i ++) { 
			if (this.courses[i].getTitle().equals(title)){
				found = true; 
				marks = this.courses[i].getMarks();
			}
		}
		if (!found) {
			marks = -1; 
		}
		return marks; 
	}
	
	public void SetMarks(String title, int marks ) {
		boolean found = false; 
		for (int i =0; i<this.noc && !found; i++) {
			if(this.courses[i].getTitle().equals(title)) {
				found = true; 
				this.courses[i].setMarks(marks);
			}
		}
	}
	
	
	int indexOf(String title) {
		int index = -1;
		
		boolean found = false; 
		for (int i =0; i<this.noc && !found) { 
			if (this.courses[i].getTitle().equals(title)) {
				found = true; 
				index = i; 
			}
		}
		return index;
	}
	
	public Student (String name) { 
		this.name = name; 
		this.courses = new CourseRecord[MAX_NUM_COURSES];
		this.noc = 0; 
	}
	
	public void addCourse(CourseRecord c) {
		this.courses[this.noc] = c; 
		this.noc++;
		
	}
	public void addCourse(String title) {
		CourseRecord c = new CourseRecord(title);
		this.courses[this.noc]=c; 
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
