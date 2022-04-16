// File: AssignmentCategory.java
// Author(s): Paul Zorovich
// Date created: 1/31/2022

public class AssignmentCategory {

	private String categoryName;
	double gradePercentage;
	
	// Default constructor
	public AssignmentCategory()
	{
		categoryName = "New category";
		gradePercentage = 0.0;
	}
	
	// Parameterized constructor
	public AssignmentCategory(String categoryName, double gradePercentage)
	{
		this.categoryName = categoryName;
		this.gradePercentage = gradePercentage;
	}
	
	public AssignmentCategory(String categoryName, String gradePercentage)
	{
		double weight = Double.valueOf(gradePercentage);
		
		this.categoryName = categoryName;
		this.gradePercentage = weight;
	}
	
	// Function get the category name
	public String getName()
	{
		return categoryName;
	}
	
	// Function set the category name
	public void setName(String categoryName)
	{
		this.categoryName = categoryName;
	}
	
	// Function to get the grade percentage
	public double getPercent()
	{
		return gradePercentage;
	}
	
	// Function to set the grade percentage
	public void setPercent(double gradePercentage)
	{
		this.gradePercentage = gradePercentage;
	}
}
