// Dynamic list for assignments
import java.util.LinkedList;

public class AssignmentTable extends javax.swing.table.AbstractTableModel {
    // Variable declarations to make class convertable into table
    protected String[] columnNames = new String[] { "Assignment" };
    protected java.lang.Class<?>[] columnClasses = new java.lang.Class<?>[] { String.class };

    // List of assignments for current course
    LinkedList<Assignment> AssigmentTableD = new LinkedList<>();

    public void addAssignment(Assignment Assign) {
        AssigmentTableD.add(Assign);
    }


    // Methods for general table info
    public int getColumnCount() { return 1; } 
    public int getRowCount() { return AssigmentTableD.size(); } 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    // Method for column information
    public String getColumnName(int col) { return columnNames[col]; } 
    public java.lang.Class<?> getColumnClass(int col) { return columnClasses[col]; } 
    
    // Method to return each cell value
    public Object getValueAt(int row, int col) { 
        int rowCount = 0;
        for (Assignment currentAssign : AssigmentTableD) {
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