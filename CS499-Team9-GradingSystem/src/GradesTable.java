// Dynamic list for assignments
import java.util.LinkedList;

public class GradesTable extends javax.swing.table.AbstractTableModel {
    // Variable declarations to make class convertable into table
    protected String[] columnNames = new String[] { "Name", "Assignment", "Grade" };
    protected java.lang.Class<?>[] columnClasses = new java.lang.Class<?>[] { String.class, String.class, Double.class };

    // List of assignments for current course
    LinkedList<Grade> gradeList = new LinkedList<>();

    public void addAssignment(Grade grade) {
        gradeList.add(grade);
    }


    // Methods for general table info
    public int getColumnCount() { return 3; } 
    public int getRowCount() { return gradeList.size(); } 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    // Method for column information
    public String getColumnName(int col) { return columnNames[col]; } 
    public java.lang.Class<?> getColumnClass(int col) { return columnClasses[col]; } 
    
    // Method to return each cell value
    public Object getValueAt(int row, int col) { 
        int rowCount = 0;
        for (Grade currGrade : gradeList) {
            if (row == rowCount) {
                switch(col) { 
                    case 0: return currGrade.getName(); 
                    case 1: return currGrade.getAssignmentName(); 
                    case 2: return currGrade.getAssignmentGrade(); 

                    default:return null;
                }
            } else {rowCount = rowCount + 1;}
        }
        return null;
    }
}