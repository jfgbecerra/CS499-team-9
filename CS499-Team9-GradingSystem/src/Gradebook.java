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
	
 	public LinkedList<Grade> sort(LinkedList<Grade> list)
	{
	    boolean swapped = true;
	    int j = 0;
	    Grade temp;
	    
	    while (swapped) {
	        swapped = false;
	        j++;
	        for (int i = 0; i < list.size() - j; i++) 
	        {
	            if (list.get(i).getAssignmentGrade() > list.get(i + 1).getAssignmentGrade()) 
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
	
	public double getAssignmentAverage(LinkedList<Grade> assignmentList)
	{
		double average = 0;
		double sum = 0;
		double entries = 0;
		
		for(int i = 0; i < assignmentList.size(); i++)
		{
			Grade currentGrade = assignmentList.get(i);
			double grade = currentGrade.getAssignmentGrade();
			sum = sum + grade;
			entries++;
		}
		
		average = sum / entries;
		
		return average;
	}
	
	public double getAssignmentMedian(LinkedList<Grade> assignmentList)
	{
		double median = 0;
		boolean isEven = false;
		
		LinkedList<Grade> sortedList = sort(assignmentList);
		
		if((sortedList.size() % 2) == 0)
			isEven = true;
		else
			isEven = false;
		
		
		if(isEven)
		{
			int middleIndex1 = sortedList.size() / 2;
			int middleIndex2 = middleIndex1++;
			
			Grade median1 = sortedList.get(middleIndex1);
			Grade median2 = sortedList.get(middleIndex2);
			
			median = (median1.getAssignmentGrade() + median2.getAssignmentGrade()) / 2;
		}
		else
		{
			double middle = sortedList.size() / 2;
			int medianIndex = (int) Math.ceil(middle);
			
			median = sortedList.get(medianIndex).getAssignmentGrade();
		}

		return median;
	}
	
	public double getAssignmentMode(LinkedList<Grade> assignmentList)
	{
	    double mode = 0;
	    int modeCount = 0;
	    
	    LinkedList<Grade> sortedList = sort(assignmentList);
		
	    for (int i = 0; i < sortedList.size(); i++) 
	    {
	        double value = sortedList.get(i).getAssignmentGrade();
	        int count = 1;
	        
	        for (int j = 0; j < sortedList.size(); j++) 
	        {
	            if (sortedList.get(j).getAssignmentGrade() == value) 
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
	
	public double getAssignmentStandardDeviation(LinkedList<Grade> assignmentList)
	{
		double standardDeviation = 0;
				
		double mean = getAssignmentAverage(assignmentList);
		double squaredStandardDeviation = 0;
		
		for(int i = 0; i < assignmentList.size(); i++)
		{
			double grade = assignmentList.get(i).getAssignmentGrade();
			squaredStandardDeviation = squaredStandardDeviation + Math.pow(grade - mean, 2);
		}
		
		standardDeviation = Math.sqrt(squaredStandardDeviation / assignmentList.size());
		
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
	
	public double getFinalGradeMedian(LinkedList<Grade> assignmentList)
	{
		double finalGradeMedian = 0;
		boolean isEven = false;
		
		ArrayList<Double> finalGradeList = getFinalGradeList();
		LinkedList<Grade> sortedList = sort(assignmentList);
		
		if((sortedList.size() % 2) == 0)
			isEven = true;
		else
			isEven = false;
		
		
		if(isEven)
		{
			int middleIndex1 = sortedList.size() / 2;
			int middleIndex2 = middleIndex1++;
			
			double median1 = sortedList.get(middleIndex1).getAssignmentGrade();
			double median2 = sortedList.get(middleIndex2).getAssignmentGrade();
			
			finalGradeMedian = (median1 + median2) / 2;
		}
		else
		{
			double middle = sortedList.size() / 2;
			int medianIndex = (int) Math.ceil(middle);
			
			finalGradeMedian = sortedList.get(medianIndex).getAssignmentGrade();
		}

		return finalGradeMedian;
	}
	
	public double getFinalGradeMode(LinkedList<Grade> assignmentList)
	{
		double finalGradeMode = 0;
	    int modeCount = 0;
	    
		ArrayList<Double> finalGradeList = getFinalGradeList();
	    LinkedList<Grade> sortedList = sort(assignmentList);
		
	    for (int i = 0; i < sortedList.size(); i++) 
	    {
	        double value = sortedList.get(i).getAssignmentGrade();
	        int count = 1;
	        
	        for (int j = 0; j < sortedList.size(); j++) 
	        {
	            if (sortedList.get(j).getAssignmentGrade() == value) 
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