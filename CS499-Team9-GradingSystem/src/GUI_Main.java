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
        Gradebook gb = new Gradebook(gt, we);
        TermList tl = new TermList();
        ClassList cl = new ClassList();
		GUI_Login l = new GUI_Login(students, ass, we, gt, gb, tl, cl);
        //GUI_compiled hmm = new GUI_compiled(students, ass, we, gt, gb, tl, cl);
		//GUI_EditGrade j = new GUI_EditGrade();
        //GUI_User_Settings userSettings = new GUI_User_Settings(tl, cl);
	}
}