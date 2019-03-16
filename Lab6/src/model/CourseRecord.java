package model;

public class CourseRecord {
	public String title; 
	public int marks; 
	
	public Faculty instructor; 
	
	
	public CourseRecord(){ 
		
	}
	
	
	
	public CourseRecord(String title) { 
		this.title = title; 
	}
	
	public CourseRecord(String title, int marks) { 
		this.title = title; 
		this.marks = marks; 
	}
	
	public String getTitle() {
		return title;
	}



	public int getMarks() {
		return marks;
	}



	public Faculty getInstructor() {
		return instructor;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public void setInstructor(Faculty instructor) {
		this.instructor = instructor;
	}



	public String getDescription() { 
	//Version 1 
		//return "Course " + this.title + " (raw marks: " + this.marks + " )" + this.instructor; 
		
	// Version 2
		String desc = ""; 
		if (this.instructor == null) { 
			desc =  "Course " + this.title + " (raw marks: " + this.marks + " )" + "has no instructor"; 
		}
		else { 
			desc =  "Course " + this.title + " (raw marks: " + this.marks + " )" + "has instructor " + this.instructor; 

		}
		return desc; 
		
	}




}
