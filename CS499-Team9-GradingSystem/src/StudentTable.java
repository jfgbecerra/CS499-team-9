import java.util.LinkedList;
// TODO: This needs to be edited to be made dynamic based on the check boxes in the UI. Shouldnt be to hard I dont think
public class StudentTable extends javax.swing.table.AbstractTableModel {
    // Variable declarations to make class convertable into table
    protected String[] columnNames = new String[] { "Student ID", "First Name", "Last Name" };
    protected java.lang.Class<?>[] columnClasses = new java.lang.Class<?>[] { String.class, String.class, String.class };

    // List of students for current course
    LinkedList<Student> studentList = new LinkedList<>();

    public void addStudent(Student student) {
        studentList.add(student);
    }
    
    public void removeStudent(Student student)
    {
		if(searchStudent(student) < 0)
		{
			// Student does not exist in class
		}
		else
		{
			int index = searchStudent(student);
			studentList.remove(index);
		}
    }
    
    public LinkedList<Student> getList() {
    	return studentList;
    }
    
    public Student getStudent(int index)
    {
    	Student student = studentList.get(index);
    	
    	return student;
    }
    
    public Student getStudent(String name)
    {
    	Student student = new Student();
    	
    	for(int i = 0; i < studentList.size(); i++)
    	{
			Student currentStudent = studentList.get(i);
			
			if(currentStudent.getFullName().equals(name))
				student = currentStudent;
    	}
    	
    	return student;
    }
    
    public int getSize() {
    	int size = studentList.size();
    	return size;
    }
    
	// Function to search for a student
	public int searchStudent(Student student)
	{
		int index = -1;
		String searchLastName = student.getLastName();
		String searchFirstName = student.getFirstName();
		boolean matchingLast = false;
		boolean matchingFirst = false;
		int size = 0;
		
		if(studentList != null)
			size = studentList.size();
		
		for(int i = 0; i < size; i++)
		{
			Student currentStudent = (Student) studentList.get(i);
			
			//Check last name
			if(currentStudent.getLastName().equals(searchLastName))
			{
				matchingLast = true;
			}
			else
			{
				matchingLast = false;
			}
			
			// Check first name
			if(currentStudent.getFirstName().equals(searchFirstName))
			{
				matchingFirst = true;
			}
			else
			{
				matchingFirst = false;
			}
			
			if(matchingFirst && matchingLast)
			{
				index = i;
			}
		}
		
		return index;
	}


    // Methods for general table info
    public int getColumnCount() { return 3; } 
    public int getRowCount() { return studentList.size(); } 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    // Method for column information
    public String getColumnName(int col) { return columnNames[col]; } 
    public java.lang.Class<?> getColumnClass(int col) { return columnClasses[col]; } 
    
    // Method to return each cell value
    public Object getValueAt(int row, int col) { 
        int rowCount = 0;
        for (Student currentStudent : studentList) {
            if (row == rowCount) {
                switch(col) { 
                    case 0: return currentStudent.getStudentNumber(); 
                    case 1: return currentStudent.getFirstName(); 
                    case 2: return currentStudent.getLastName(); 

                    default:return null;
                }
            } else {rowCount = rowCount + 1;}
        }
        return null;
    }
}