
public class GUI_Main {
	
	public GUI_Main()
	{
		int [] color = new int [3];
	    color[0] = 153;
	    color[1] = 153;
	    color[2] = 255;
	    int [] location = new int [2];
	    location[0] = 0;
	    location[1] = 0;
	    
	    // Calling UI
	    StudentTable students = new StudentTable();
        AssignmentTable ass = new AssignmentTable();
        AssignmentWeightTable we = new AssignmentWeightTable();
        GradesTable gt = new GradesTable();
        GUI_compiled hmm = new GUI_compiled(students, ass, we, gt);
		GUI_RemoveAssignment n = new GUI_RemoveAssignment();
	}
}
