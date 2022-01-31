// File: Assignment.java
// Author(s): Paul Zorovich
// Date created: 1/31/2022

public class Assignment {

	private String assignmentName;
	private AssignmentCategory assignmentCategory;
	
	// Default constructor
	public Assignment()
	{
		assignmentName = "New assignment";
		assignmentCategory = new AssignmentCategory();
	}
	
	// Parameterized constructor
	public Assignment(String assignmentName, AssignmentCategory assignmentCategory)
	{
		this.assignmentName = assignmentName;
		this.assignmentCategory = assignmentCategory;
	}
	
	// Function to get assignment name
	public String getAssignmentName()
	{
		return assignmentName;
	}
	
	// Function to set assignment name
	public void setAssignmentName(String assignmentName)
	{
		this.assignmentName = assignmentName;
	}
	
	// Function to get assignment category
	public AssignmentCategory getAssignmentCategory()
	{
		return assignmentCategory;
	}
	
	// Function to set assignmentCategory
	public void setAssignmentCategory(AssignmentCategory assignmentCategory)
	{
		this.assignmentCategory = assignmentCategory;
	}
}
