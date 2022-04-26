// File: Gradebook.java
// Author(s): Paul Zorovich
// Date created: 2/23/2022
import java.util.*;

public class Gradebook {

	private GradesTable gradesTable;
	private AssignmentWeightTable weightTable;
	
	public Gradebook(GradesTable gradesTable, AssignmentWeightTable weightTable)
	{
		this.gradesTable = gradesTable;
		this.weightTable = weightTable;
	}
	
	public void addEntry(Student student, Assignment assignment, double grade)
	{
		Grade newGrade = new Grade(student.getFullName(), assignment.getAssignmentName(), assignment.getAssignmentCategory().getName(), grade);
		
		if(!gradesTable.assignmentExists(newGrade))
			gradesTable.addAssignment(newGrade);
		
		gradesTable.fireTableDataChanged();	
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
		Grade newGrade = new Grade(student.getFullName(), assignment.getAssignmentName(), assignment.getAssignmentCategory().getName(), grade);
		gradesTable.removeAssignment(newGrade);
		
		gradesTable.fireTableDataChanged();
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
	
 	public LinkedList<Double> sortDoubles(LinkedList<Double> list)
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
		
		LinkedList<Grade> studentGrades = new LinkedList<Grade>();
		
		for(int i = 0; i < gradesTable.getSize(); i++)
		{
			Grade currentGrade = gradesTable.getGrade(i);
			
			if(currentGrade.getName().equals(student.getFullName()))
			{
				studentGrades.add(currentGrade);
			}
		}
		
		for(int i = 0; i < weightTable.getSize(); i++)
		{
			AssignmentCategory currentCat = weightTable.getCategory(i);
			double weightTotal = 0;
			int weightGrades = 0;
			
			for(int j = 0; j < studentGrades.size(); j++)
			{
				if(studentGrades.get(j).getCategory().equals(currentCat.getName()))
				{
					weightTotal += studentGrades.get(j).getAssignmentGrade();
					weightGrades++;
				}
			}
			
			double weightGrade = weightTotal / weightGrades;
			double weighted = weightGrade * (currentCat.getPercent() / 100);
			
			average += weighted;
		}
		
		return average;
	}
	
	public double getFinalGradeAverage(LinkedList<Student> studentList)
	{
		double finalGradeAverage = 0;
		
		LinkedList<Double> finalGrades = new LinkedList<Double>();
		
		for(int i = 0; i < studentList.size(); i++)
		{
			Student currentStudent = studentList.get(i);
			
			finalGrades.add(getStudentClassAverage(currentStudent));
		}
		
		int size = finalGrades.size();
		double sum = 0;
		
		for(int i = 0; i < size; i++)
		{
			sum += finalGrades.get(i);
		}
		
		finalGradeAverage = sum / size;
		
		return finalGradeAverage;
	}
	
	public double getFinalGradeMedian(LinkedList<Student> studentList)
	{
		double finalGradeMedian = 0;
		boolean isEven = false;
		
		LinkedList<Double> finalGrades = new LinkedList<Double>();
		
		for(int i = 0; i < studentList.size(); i++)
		{
			Student currentStudent = studentList.get(i);
			
			finalGrades.add(getStudentClassAverage(currentStudent));
		}
		
		LinkedList<Double> sortedList = sortDoubles(finalGrades);
		
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
	
	public double getFinalGradeMode(LinkedList<Student> studentList)
	{
		double finalGradeMode = 0;
	    int modeCount = 0;
	    
		LinkedList<Double> finalGrades = new LinkedList<Double>();
		
		for(int i = 0; i < studentList.size(); i++)
		{
			Student currentStudent = studentList.get(i);
			
			finalGrades.add(getStudentClassAverage(currentStudent));
		}
		
	    LinkedList<Double> sortedList = sortDoubles(finalGrades);
		
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
	
	public double getFinalGradeStandardDeviation(LinkedList<Student> studentList)
	{
		double finalGradeStandardDeviation = 0;
		
		LinkedList<Double> finalGrades = new LinkedList<Double>();
		
		for(int i = 0; i < studentList.size(); i++)
		{
			Student currentStudent = studentList.get(i);
			
			finalGrades.add(getStudentClassAverage(currentStudent));
		}
		
		double mean = getFinalGradeAverage(studentList);
		double squaredStandardDeviation = 0;
		
		for(int i = 0; i < finalGrades.size(); i++)
		{
			double grade = finalGrades.get(i);
			squaredStandardDeviation = squaredStandardDeviation + Math.pow(grade - mean, 2);
		}
		
		finalGradeStandardDeviation = Math.sqrt(squaredStandardDeviation / finalGrades.size());
		
		return finalGradeStandardDeviation;
	}	
	
}