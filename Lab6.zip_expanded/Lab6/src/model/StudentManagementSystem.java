package model;

public class StudentManagementSystem {

	public int noS = 0;
	public static int MAX_NUM_OF_STUDENTS = 100;
	public Student[] students;
	public Student[] student = new Student[MAX_NUM_OF_STUDENTS];

	public StudentManagementSystem() {
		//Nothing happens in this
		//All the attributes are default when this is called
		this.students = new Student[this.noS];
	}

	public String getDescription() {
		String result = "";
		if (this.noS == 0) {
			result += "Student management system currenlty stores no students.";
		}
		else {
			result += "Student management system currently stores " + noS + " students.";
		}
		return result;
	}

	public Student[] getStudents() {
		return this.students;
	}

	public void addStudent(Student c) { //object
		this.student[this.noS] = c;
		this.noS ++;
		this.students = new Student[noS];
		for (int i = 0; i < students.length; i++) {
			this.students[i] = student[i];
		}
	}

	public void addStudent(String string) { //string
		Student c = new Student(string);
		this.student[this.noS] = c;
		this.noS ++;
		this.students = new Student[noS];
		for (int i = 0; i < students.length; i++) {
			this.students[i] = student[i];
		}
	}

	public int getMarks(String string, String string2) {
		int marks = -1;
		boolean found = false;
		for (int i = 0; i < this.noS && !found; i++) {
			if (this.students[i].getName().equals(string)) {
				found = true;
				marks = this.students[i].getMarks(string2);
			}
		}
		return marks;
	}

	public void setMarks(String string, String string2, int mark) {
		boolean found = false;
		for (int i = 0; i < this.noS && !found; i++) {
			if (this.student[i].getName().equals(string)) {
				found = true;
				this.student[i].setMarks(string2, mark);
			}
		}
	}

	public double getGPA(String string) {
		double gpa = 0;
		boolean found = false;
		for (int i = 0; i < this.noS && !found; i++) {
			if (this.student[i].getName().equals(string)) {
				found = true;
				gpa = this.student[i].getGPA();
			}
		}
		return gpa;
	}

	public void addCourse(String string, CourseRecord course) {
		boolean found = false;
		for (int i = 0; i < this.noS && !found; i++) {
			if (this.students[i].getName().equals(string)) {
				found = true;
				this.students[i].addCourse(course);
			}
		}

	}



}
