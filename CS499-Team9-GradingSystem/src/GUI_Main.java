
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
		StudentTable students = new StudentTable();
		AssignmentTable ass = new AssignmentTable();
		AssignmentWeightTable we = new AssignmentWeightTable();
		GradesTable gt = new GradesTable();
	    
	    // Calling UI
	    //GUI_Course_Card card = new GUI_Course_Card("Long Name", "Short", "Term1", "link", color, location);
	    //GUI_Dashboard dash = new GUI_Dashboard();
	    //GUI_Login login = new GUI_Login();
	    //GUI_User_Settings userSettings = new GUI_User_Settings();
	    //StudentTable studentTable = new StudentTable();
	    //GUI_People guipeople = new GUI_People(students);
	    //GUI_Home home = new GUI_Home();
		// GUI_Assignments hw = new GUI_Assignments();
		//Assignments_Table tab = new Assignments_Table();
		GUI_compiled hmm = new GUI_compiled(students, ass, we, gt);
	}
}
