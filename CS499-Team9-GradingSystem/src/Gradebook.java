// File: Gradebook.java
// Author(s): Paul Zorovich
// Date created: 2/23/2022
import java.util.*;

public class Gradebook {

	private ArrayList<Student> studentList;
	private ArrayList<Assignment> assignmentList;
	private ArrayList<Double> gradeList;
	
	public Gradebook()
	{
		studentList = new ArrayList<Student>();
		assignmentList = new ArrayList<Assignment>();
		gradeList = new ArrayList<Double>();
	}
	
	public void addEntry(Student student, Assignment assignment, double grade)
	{
		int index = searchIndex(student, assignment);
		
		// Check if student/assignment grade already exists
		if(index != -1)
		{
			// Already exists, must modify grade instead of add new.
			modifyEntry(student, assignment, grade, index);
			return;
		}
		else
		{
			// Add new entry
			studentList.add(student);
			assignmentList.add(assignment);
			gradeList.add(grade);
		}
		
	}
	
	public void modifyEntry(Student student, Assignment assignment, double grade, int index)
	{
		studentList.set(index, student);
		assignmentList.set(index, assignment);
		gradeList.set(index, grade);
	}
	
	public void removeEntry(Student student, Assignment assignment)
	{
		int index = searchIndex(student, assignment);
		
		// Check if student/assignment grade already exists
		if(index != -1)
		{
			// Already exists, must remove
			studentList.remove(index);
			assignmentList.remove(index);
			gradeList.remove(index);
			return;
		}
		else
		{
			return;
		}
	}
	
	public int searchIndex(Student student, Assignment assignment)
	{
		int index = -1;
		
		for(int i = 0; i < studentList.size(); i++)
		{
			Student testStudent = studentList.get(i);
			
			if(testStudent.getStudentNumber() == student.getStudentNumber())
			{
				for(int j = 0; j < assignmentList.size(); j++)
				{
					Assignment testAssignment = assignmentList.get(j);
					
					if(testAssignment.getAssignmentName() == assignment.getAssignmentName())
					{
						index = j;
					}
				}
			}
		}
		
		return index;
	}

	public double calculateAssignmentAverage(Assignment assignment)
	{
		double average = 0;
		
		ArrayList<Double> assignmentGradeList = new ArrayList<Double>();
		
		for(int i = 0; i < assignmentList.size(); i++)
		{
			Assignment testAssignment = assignmentList.get(i);
			
			if(testAssignment.getAssignmentName() == assignment.getAssignmentName())
			{
				assignmentGradeList.add(gradeList.get(i));
			}
		}
		
		int numGrades = assignmentGradeList.size();
		double gradeTotals = 0;
		
		for(int j = 0; j < numGrades; j++)
		{
			gradeTotals = gradeTotals + assignmentGradeList.get(j);
		}
		
		average = gradeTotals / numGrades;
		
		return average;
	}
	
	public double calculateStudentClassAverage(Student student)
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

	/*
	 * calculateAssignmentMedian
	 * calculateAssignmentMode
	 * calculateAssignmentStandardDeviation
	 * calculateFinalGradeAverage
	 * calculateFinalGradeMedian
	 * calculateFinalGradeMode
	 * calculateFinalGradeStandardDeviation
	 */
	
	
}
