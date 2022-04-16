// Dynamic list for assignments
import java.util.LinkedList;

public class AssignmentTable extends javax.swing.table.AbstractTableModel {
    // Variable declarations to make class convertable into table
    protected String[] columnNames = new String[] { "Assignment" };
    protected java.lang.Class<?>[] columnClasses = new java.lang.Class<?>[] { String.class };

    // List of assignments for current course
    LinkedList<Assignment> AssignmentTableD = new LinkedList<>();

    public void addAssignment(Assignment Assign) {
        AssignmentTableD.add(Assign);
    }

    public void removeAssignment(Assignment Assign)
    {
		if(searchAssignment(Assign) < 0)
		{
			// Assignment does not exist in class
		}
		else
		{
			int index = searchAssignment(Assign);
			AssignmentTableD.remove(index);
		}
    }
    
    public int searchAssignment(Assignment Assign)
    {
		int index = -1;
		
		String searchName = Assign.getAssignmentName();
		boolean matching;
		int size = 0;
		
		if(AssignmentTableD != null)
			size = AssignmentTableD.size();
			
		for(int i = 0; i < size; i++)
		{
			Assignment currentAssignment = AssignmentTableD.get(i);
			
			// Check for matching assignment
			if(currentAssignment.getAssignmentName().equals(searchName))
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

    // Methods for general table info
    public int getColumnCount() { return 1; } 
    public int getRowCount() { return AssignmentTableD.size(); } 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    // Method for column information
    public String getColumnName(int col) { return columnNames[col]; } 
    public java.lang.Class<?> getColumnClass(int col) { return columnClasses[col]; } 
    
    // Method to return each cell value
    public Object getValueAt(int row, int col) { 
        int rowCount = 0;
        for (Assignment currentAssign : AssignmentTableD) {
            if (row == rowCount) {
                switch(col) { 
                    case 0: return currentAssign.getAssignmentName(); 

                    default:return null;
                }
            } else {rowCount = rowCount + 1;}
        }
        return null;
    }
}