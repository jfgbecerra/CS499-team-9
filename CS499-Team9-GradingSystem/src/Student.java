// File: Student.java
// Author(s): Paul Zorovich
// Date created: 1/31/2022

public class Student {

	private String firstName;
	private String lastName;
	private String studentNumber;
	private double classGrade;
	
	// Default constructor
	public Student()
	{
		firstName = "New";
		lastName = "Student";
		studentNumber = "123456789";
	}
	
	// Parameterized constructor
	public Student(String firstName, String lastName, String studentNumber)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
	}
	
	// Function to get student first name
	public String getFirstName()
	{
		return firstName;
	}
	
	// Function to get student last name
	public String getLastName()
	{
		return lastName;
	}
	
	// Function set student name
	public void setName(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Function to get student number
	public String getStudentNumber()
	{
		return studentNumber;
	}
	
	// Function to set student number
	public void setStudentNumber(String studentNumber)
	{
		this.studentNumber = studentNumber;
	}
	
	// Function to get student class grade
	public double getClassGrade()
	{
		return classGrade;
	}
	
	// Function to set student class grade
	public void setClassGrade(double classGrade)
	{
		this.classGrade = classGrade;
	}
}
