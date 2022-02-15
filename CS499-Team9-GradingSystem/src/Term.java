// File: Term.java
// Author(s): Paul Zorovich
// Date created: 1/31/2022

import java.util.*;

public class Term {

	private String termName;
	private ArrayList<Class> termClassList;	
	
	// Default constructor
	public Term()
	{
		termName = "New term";
		termClassList = new ArrayList<Class>();
	}
	
	// Parameterized constructor
	public Term(String termName)
	{
		this.termName = termName;
		termClassList = new ArrayList<Class>();
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
	public boolean addClass(Class newClass)
	{
		if(search(newClass) >= 0)
		{
			// Class already exists in term
			return false;
		}
		else
		{
			termClassList.add(newClass);
		}
		
		return true;
	}
	
	// Function to remove class from term
	public boolean removeClass(Class removeClass)
	{
		if(search(removeClass) < 0)
		{
			// Class does not exist in term
			return false;
		}
		else
		{
			int index = search(removeClass);
			termClassList.remove(index);
		}
		
		return true;
	}
	
	public int search(Class searchClass)
	{
		
		int index = -1;
		
		String searchCode = searchClass.getClassCode();
		boolean matching;
		int size = 0;
		
		if(termClassList != null)
		{
			size = termClassList.size();
		}
		
		for(int i = 0; i < size; i++)
		{
			Class currentClass = termClassList.get(i);
			
			// Check for matching assignment
			if(currentClass.getClassCode().equals(searchCode))
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
