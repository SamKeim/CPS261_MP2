package main;

public class Student implements Comparable<Student> {
	
	private int studentID;
	private String name;
	private double gpa;
	static int maxStudentID = 1;
	
	public Student(String name, double gpa) {
		super();
		this.studentID = maxStudentID++; // Assigns Student ID, then increments
		this.name = name;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return String.format("#%d: %s\t%.2f", this.getStudentID(), this.getName(), this.getGpa());
	}
	
	// For Comparing by Student ID
//	@Override
//	public int compareTo(Student o) {	
//		return o.getStudentID() - this.getStudentID();
//	}
	
	// For Comparing by Name
	@Override
	public int compareTo(Student o) {
		return o.getName().compareTo(this.getName());
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public static int getMaxStudentID() {
		return maxStudentID;
	}
	
	public static void setMaxStudentID(int maxStudentID) {
		Student.maxStudentID = maxStudentID;
	}
}
