import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

public class ReportGenerator {
	
	private Gradebook gradebook;
	private GradesTable gradesTable;
	private AssignmentTable assignmentTable;
	private StudentTable studentTable;
	
	private boolean assignmentAverage;
	private boolean assignmentMedian;
	private boolean assignmentMode;
	private boolean assignmentStandardDeviation;
	private boolean finalAverage;
	private boolean finalMedian;
	private boolean finalMode;
	private boolean finalStandardDeviation;
	
	private boolean assignmentbased = false;
	private boolean finalbased = false;
	private boolean studentbased = false;
	
	public ReportGenerator(Gradebook gradebook, GradesTable gradesTable, AssignmentTable at, StudentTable st, boolean aa, boolean ame, boolean amo, boolean asd, boolean fa, boolean fme, boolean fmo, boolean fsd, boolean sb) throws IOException
	{
		this.gradebook = gradebook;
		this.gradesTable = gradesTable;
		this.assignmentTable = at;
		this.studentTable = st;
		this.assignmentAverage = aa;
		this.assignmentMedian = ame;
		this.assignmentMode = amo;
		this.assignmentStandardDeviation = asd;
		this.finalAverage = fa;
		this.finalMedian = fme;
		this.finalMode = fmo;
		this.finalStandardDeviation = fsd;
		this.studentbased = sb;
		
		if(assignmentAverage || assignmentMedian || assignmentMode || assignmentStandardDeviation)
			assignmentbased = true;
		
		if(finalAverage || finalMedian || finalMode || finalStandardDeviation)
			finalbased = true;
		
		GenerateReport();
	}
	
	public void GenerateReport() throws IOException
	{	
		PrintWriter outputStream = null;
		outputStream = new PrintWriter(new FileWriter("Report.txt"));
		
		// Handle the assignment-based reports
		if(assignmentbased)
		{
			LinkedList<Assignment> assignmentList = assignmentTable.getTable();
			String output = "";
			
			for(int i = 0; i < assignmentList.size(); i++)
			{
				output = assignmentList.get(i).getAssignmentName();
				
				if(assignmentAverage)
				{
					output += "\tAverage: ";
					
					LinkedList<Grade> assignmentGrades = gradesTable.getAssignment(assignmentList.get(i).getAssignmentName());
					double average = gradebook.getAssignmentAverage(assignmentGrades);
					
					output += average;
				}
				
				if(assignmentMedian)
				{
					output += "\tMedian: ";
					
					LinkedList<Grade> assignmentGrades = gradesTable.getAssignment(assignmentList.get(i).getAssignmentName());
					double median = gradebook.getAssignmentMedian(assignmentGrades);
					
					output += median;
				}
				
				if(assignmentMode)
				{
					output += "\tMode: ";
					
					LinkedList<Grade> assignmentGrades = gradesTable.getAssignment(assignmentList.get(i).getAssignmentName());
					double mode = gradebook.getAssignmentMode(assignmentGrades);
					
					output += mode;
				}
				
				if(assignmentStandardDeviation)
				{
					output += "\tStandard Deviation: ";
					
					LinkedList<Grade> assignmentGrades = gradesTable.getAssignment(assignmentList.get(i).getAssignmentName());
					double standardDeviation = gradebook.getAssignmentMode(assignmentGrades);
					
					output += standardDeviation;
				}
				
				outputStream.println(output);
				outputStream.flush();
			}
		}
		
		// Handle final grade-based reports
		if(finalbased)
		{
			
		}
		
		// Handle student-based reports
		if(studentbased)
		{
			
		}
	}
	
	
}
