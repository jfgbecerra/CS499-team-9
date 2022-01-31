// File: Class.java
// Author(s): Paul Zorovich
// Date created: 1/31/2022

public class Class {

	private String className;
	private String classCode;
	private Student[] classRoster;
	private Assignment[] classAssignments;
	
	// Default constructor
	public Class()
	{
		className = "New class";
		classCode = "NEW 100";
	}
	
	// Parameterized constructor
	public Class(String className, String classCode)
	{
		this.className = className;
		this.classCode = classCode;
	}
	
	// Function to get class name
	public String getClassName()
	{
		return className;
	}
	
	// Function to set class name
	public void setClassName(String className)
	{
		this.className = className;
	}
	
	// Function to get class code
	public String getClassCode()
	{
		return classCode;
	}
	
	// Function to set class code
	public void setClassCode(String classCode)
	{
		this.classCode = classCode;
	}
	
	// Function to add new student to class
	public void addStudent(Student student)
	{
		
	}
	
	// Function to remove student from class
	public void removeStudent(Student student)
	{
		
	}
	
	// Function to add new assignment to class
	public void addAssignment(Assignment assignment)
	{
		
	}
	
	// Function to remove new assignment to class
	public void removeAssignment(Assignment assignment)
	{
		
	}
}
