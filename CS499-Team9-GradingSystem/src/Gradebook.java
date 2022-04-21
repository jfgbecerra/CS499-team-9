// File: Gradebook.java
// Author(s): Paul Zorovich
// Date created: 2/23/2022
import java.util.*;

public class Gradebook {

	private ArrayList<Student> studentList;
	private ArrayList<Assignment> assignmentList;
	private ArrayList<Double> gradeList;
	private GradesTable gradesTable;
	
	public Gradebook(GradesTable gradesTable)
	{
		studentList = new ArrayList<Student>();
		assignmentList = new ArrayList<Assignment>();
		gradeList = new ArrayList<Double>();
		this.gradesTable = gradesTable;
	}
	
	public void addEntry(Student student, Assignment assignment, double grade)
	{
		// Add new entry
		studentList.add(student);
		assignmentList.add(assignment);
		gradeList.add(grade);
		
		Grade newGrade = new Grade(student.getFullName(), assignment.getAssignmentName(), assignment.getAssignmentCategory().getName(), grade);
		gradesTable.addAssignment(newGrade);
		
		gradesTable.fireTableDataChanged();	
	}
	
	public void modifyEntry(Student student, Assignment assignment, double grade, int index)
	{
		studentList.set(index, student);
		assignmentList.set(index, assignment);
		gradeList.set(index, grade);
	}
	
	public void modifyEntry(String studentName, String assignment, double score)
	{
		Grade grade = new Grade();
		grade = gradesTable.getGrade(studentName, assignment);
		
		int index = gradesTable.getIndex(grade);
		
		grade.setAssignmentGrade(score);
		gradesTable.modifyGrade(grade, index);
	}
	
	public void removeEntry(Student student, Assignment assignment, double grade)
	{
		// Already exists, must remove
		studentList.remove(student);
		assignmentList.remove(assignment);
		gradeList.remove(grade);
		
		Grade newGrade = new Grade(student.getFullName(), assignment.getAssignmentName(), assignment.getAssignmentCategory().getName(), grade);
		gradesTable.removeAssignment(newGrade);
		
		gradesTable.fireTableDataChanged();
	}

	public ArrayList<Double> getAssignmentGradeList(Assignment assignment)
	{
		ArrayList<Double> assignmentGradeList = new ArrayList<Double>();
		
		for(int i = 0; i < assignmentList.size(); i++)
		{
			Assignment testAssignment = assignmentList.get(i);
			
			if(testAssignment.getAssignmentName() == assignment.getAssignmentName())
			{
				assignmentGradeList.add(gradeList.get(i));
			}
		}
		
		return assignmentGradeList;
	}

	public ArrayList<Double> getFinalGradeList()
	{
		ArrayList<Student> uniqueStudentList = getUniqueStudentList();
		ArrayList<Double> finalGradeList = new ArrayList<Double>();		
		
		for(int i = 0; i < uniqueStudentList.size(); i++)
		{
			double studentAverage = getStudentClassAverage(uniqueStudentList.get(i));
			
			finalGradeList.add(studentAverage);
		}
		
		return finalGradeList;
	}
	
	public ArrayList<Student> getUniqueStudentList()
	{
		ArrayList<Student> uniqueStudentList = new ArrayList<Student>();
					  
		uniqueStudentList.add(studentList.get(0));
		
	    for (int i = 1; i < studentList.size(); i++)
	    {
	    	Student testStudent = studentList.get(i);
	    	
	    	 for(int j = 0; j < i; j++)
	    	 {
	    		 if(testStudent.getStudentNumber() == uniqueStudentList.get(j).getStudentNumber())
	    		 {
	    			 break;
	    		 }
	    	 }
	    	 
	    	 uniqueStudentList.add(testStudent);
	    }
		
		return uniqueStudentList;
	}
	
 	public ArrayList<Double> sort(ArrayList<Double> list)
	{
	    boolean swapped = true;
	    int j = 0;
	    double temp;
	    
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < list.size() - j; i++) 
	        {
	            if (list.get(i) > list.get(i + 1)) 
	            {
	                temp = list.get(i);
	                list.set(i, list.get(i+1));
	                list.set(i + 1, temp);
	                
	                swapped = true;
	            }
	        }
	    }
	    
		return list;
	}
	
	public double getAssignmentAverage(Assignment assignment)
	{
		double average = 0;
		
		ArrayList<Double> assignmentGradeList = getAssignmentGradeList(assignment);
		
		int numGrades = assignmentGradeList.size();
		double gradeTotals = 0;
		
		for(int j = 0; j < numGrades; j++)
		{
			gradeTotals = gradeTotals + assignmentGradeList.get(j);
		}
		
		average = gradeTotals / numGrades;
		
		return average;
	}
	
	public double getAssignmentMedian(Assignment assignment)
	{
		double median = 0;
		boolean isEven = false;
		
		ArrayList<Double> assignmentGradeList = getAssignmentGradeList(assignment);	
		ArrayList<Double> sortedList = sort(assignmentGradeList);
		
		if((sortedList.size() % 2) == 0)
			isEven = true;
		else
			isEven = false;
		
		
		if(isEven)
		{
			int middleIndex1 = sortedList.size() / 2;
			int middleIndex2 = middleIndex1++;
			
			double median1 = sortedList.get(middleIndex1);
			double median2 = sortedList.get(middleIndex2);
			
			median = (median1 + median2) / 2;
		}
		else
		{
			double middle = sortedList.size() / 2;
			int medianIndex = (int) Math.ceil(middle);
			
			median = sortedList.get(medianIndex);
		}

		return median;
	}
	
	public double getAssignmentMode(Assignment assignment)
	{
	    double mode = 0;
	    int modeCount = 0;
	    
		ArrayList<Double> assignmentGradeList = getAssignmentGradeList(assignment);
	    ArrayList<Double> sortedList = sort(assignmentGradeList);
		
	    for (int i = 0; i < sortedList.size(); i++) 
	    {
	        double value = sortedList.get(i);
	        int count = 1;
	        
	        for (int j = 0; j < sortedList.size(); j++) 
	        {
	            if (sortedList.get(j) == value) 
	            	count++;
	            
	            if (count > modeCount) 
	            {
	                mode = value;
	                modeCount = count;
	            }
	        }
	    }
		
		return mode;
	}
	
	public double getAssignmentStandardDeviation(Assignment assignment)
	{
		double standardDeviation = 0;
		
		ArrayList<Double> assignmentGradeList = getAssignmentGradeList(assignment);
		
		double mean = getAssignmentAverage(assignment);
		double squaredStandardDeviation = 0;
		
		for(int i = 0; i < assignmentGradeList.size(); i++)
		{
			double grade = assignmentGradeList.get(i);
			squaredStandardDeviation = squaredStandardDeviation + Math.pow(grade - mean, 2);
		}
		
		standardDeviation = Math.sqrt(squaredStandardDeviation / assignmentGradeList.size());
		
		return standardDeviation;
	}
	
	public double getStudentClassAverage(Student student)
	{
		double average = 0;
		
		// Have to account for assignment category percentages
		ArrayList<Double> weightedGradeList = new ArrayList<Double>();
		
		for(int i = 0; i < studentList.size(); i++) 
		{
			Student testStudent = studentList.get(i);
			
			if(testStudent.getStudentNumber() == student.getStudentNumber())
			{
				Assignment currentAssignment = assignmentList.get(i);
				AssignmentCategory assignmentCategory = currentAssignment.getAssignmentCategory();
				
				double gradePercentage = assignmentCategory.getPercent();
				double grade = gradeList.get(i);
				
				double weightedGrade = grade * gradePercentage;
				
				weightedGradeList.add(weightedGrade);
			}
		}
		
		for(int j = 0; j < weightedGradeList.size(); j++)
		{
			average = average + weightedGradeList.get(j);
		}
		
		return average;
	}
	
	public double getFinalGradeAverage()
	{
		double finalGradeAverage = 0;
		
		ArrayList<Double> finalGradeList = getFinalGradeList();
		
		double gradeTotals = 0;
		
		for(int i = 0; i < finalGradeList.size(); i++)
		{
			gradeTotals = gradeTotals + finalGradeList.get(i);
		}
		
		finalGradeAverage = gradeTotals / finalGradeList.size();
		
		return finalGradeAverage;
	}
	
	public double getFinalGradeMedian()
	{
		double finalGradeMedian = 0;
		boolean isEven = false;
		
		ArrayList<Double> finalGradeList = getFinalGradeList();
		ArrayList<Double> sortedList = sort(finalGradeList);
		
		if((sortedList.size() % 2) == 0)
			isEven = true;
		else
			isEven = false;
		
		
		if(isEven)
		{
			int middleIndex1 = sortedList.size() / 2;
			int middleIndex2 = middleIndex1++;
			
			double median1 = sortedList.get(middleIndex1);
			double median2 = sortedList.get(middleIndex2);
			
			finalGradeMedian = (median1 + median2) / 2;
		}
		else
		{
			double middle = sortedList.size() / 2;
			int medianIndex = (int) Math.ceil(middle);
			
			finalGradeMedian = sortedList.get(medianIndex);
		}

		return finalGradeMedian;
	}
	
	public double getFinalGradeMode()
	{
		double finalGradeMode = 0;
	    int modeCount = 0;
	    
		ArrayList<Double> finalGradeList = getFinalGradeList();
	    ArrayList<Double> sortedList = sort(finalGradeList);
		
	    for (int i = 0; i < sortedList.size(); i++) 
	    {
	        double value = sortedList.get(i);
	        int count = 1;
	        
	        for (int j = 0; j < sortedList.size(); j++) 
	        {
	            if (sortedList.get(j) == value) 
	            	count++;
	            
	            if (count > modeCount) 
	            {
	                finalGradeMode = value;
	                modeCount = count;
	            }
	        }
	    }
		
		return finalGradeMode;
	}
	
	public double getFinalGradeStandardDeviation()
	{
		double finalGradeStandardDeviation = 0;
		
		ArrayList<Double> finalGradeList = getFinalGradeList();
		
		double mean = getFinalGradeAverage();
		double squaredStandardDeviation = 0;
		
		for(int i = 0; i < finalGradeList.size(); i++)
		{
			double grade = finalGradeList.get(i);
			squaredStandardDeviation = squaredStandardDeviation + Math.pow(grade - mean, 2);
		}
		
		finalGradeStandardDeviation = Math.sqrt(squaredStandardDeviation / finalGradeList.size());
		
		return finalGradeStandardDeviation;
	}	
	
}