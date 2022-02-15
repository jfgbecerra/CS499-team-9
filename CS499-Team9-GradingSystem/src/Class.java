// File: Class.java
// Author(s): Paul Zorovich
// Date created: 1/31/2022

import java.util.*;

public class Class {

	private String className;
	private String classCode;
	private ArrayList<Student> classRoster;
	private ArrayList<Assignment> classAssignments;
	
	// Default constructor
	public Class()
	{
		className = "New class";
		classCode = "NEW 100";
		classRoster = new ArrayList<Student>();
		classAssignments = new ArrayList<Assignment>();
	}
	
	// Parameterized constructor
	public Class(String className, String classCode)
	{
		this.className = className;
		this.classCode = classCode;
		classRoster = new ArrayList<Student>();
		classAssignments = new ArrayList<Assignment>();
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
	public boolean addStudent(Student student)
	{
		// Search to see if Student has already been added
		if(searchStudent(student) >= 0)
		{
			// Student already exists in class
			return false;
		}
		else
		{
			classRoster.add(student);
		}
		
		return true;
	}
	
	// Function to remove student from class
	public boolean removeStudent(Student student)
	{
		if(searchStudent(student) < 0)
		{
			// Student does not exist in class
			return false;
		}
		else
		{
			int index = searchStudent(student);
			classRoster.remove(index);
		}
		
		return true;		
	}
	
	// Function to add new assignment to class
	public boolean addAssignment(Assignment assignment)
	{
		if(searchAssignment(assignment) >= 0)
		{
			// Assignment already exists in class
			return false;
		}
		else
		{
			classAssignments.add(assignment);
		}
		
		return true;
	}
	
	// Function to remove new assignment to class
	public boolean removeAssignment(Assignment assignment)
	{
		if(searchAssignment(assignment) < 0)
		{
			// Assignment does not exist in class
			return false;
		}
		else
		{
			int index = searchAssignment(assignment);
			classAssignments.remove(index);
		}
		
		return true;
	}
	
	// Function to search for a student
	public int searchStudent(Student student)
	{
		int index = -1;
		String searchLastName = student.getLastName();
		String searchFirstName = student.getFirstName();
		boolean matchingLast = false;
		boolean matchingFirst = false;
		int size = 0;
		
		if(classRoster != null)
			size = classRoster.size();
		
		for(int i = 0; i < size; i++)
		{
			Student currentStudent = (Student) classRoster.get(i);
			
			//Check last name
			if(currentStudent.getLastName().equals(searchLastName))
			{
				matchingLast = true;
			}
			else
			{
				matchingLast = false;
			}
			
			// Check first name
			if(currentStudent.getFirstName().equals(searchFirstName))
			{
				matchingFirst = true;
			}
			else
			{
				matchingFirst = false;
			}
			
			if(matchingFirst && matchingLast)
			{
				index = i;
			}
		}
		
		return index;
	}

	// Function to search for an assignment
	public int searchAssignment(Assignment assignment)
	{
		int index = -1;
		
		String searchName = assignment.getAssignmentName();
		boolean matching;
		int size = 0;
		
		if(classAssignments != null)
			size = classAssignments.size();
			
		for(int i = 0; i < size; i++)
		{
			Assignment currentAssignment = classAssignments.get(i);
			
			// Check for matching assignment
			if(currentAssignment.getAssignmentName().equals(searchName))
			{
				matching = true;
			}
			else
			{
				matching = false;
			}
						
			if(matching)
			{
				index = i;
			}
		}
		
		return index;
	}
}
