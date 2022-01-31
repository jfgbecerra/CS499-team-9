// File: Term.java
// Author(s): Paul Zorovich
// Date created: 1/31/2022

public class Term {

	private String termName;
	private Class[] termClassList;	
	
	// Default constructor
	public Term()
	{
		termName = "New term";
	}
	
	// Parameterized constructor
	public Term(String termName)
	{
		this.termName = termName;
	}
	
	// Function to get term name
	public String getTermName()
	{
		return termName;
	}
	
	// Function to set term name
	public void setTermName(String termName)
	{
		this.termName = termName;
	}
	
	// Function to add new class to term
	public void addClass(Class newClass)
	{
		
	}
	
	// Function to remove class from term
	public void removeClass(Class removeClass)
	{
		
	}
	
}
