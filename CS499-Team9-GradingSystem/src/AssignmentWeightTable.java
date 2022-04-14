// Dynamic list for the assignment weights
import java.util.LinkedList;

public class AssignmentWeightTable extends javax.swing.table.AbstractTableModel {
    // Variable declarations to make class convertable into table
    protected String[] columnNames = new String[] { "Category", "Weight" };
    protected java.lang.Class<?>[] columnClasses = new java.lang.Class<?>[] { String.class, Double.class };

    // List of weights for current course
    LinkedList<AssignmentCategory> weightList = new LinkedList<>();

    public void addWeight(AssignmentCategory cat) {
        weightList.add(cat);
    }


    // Methods for general table info
    public int getColumnCount() { return 2; } 
    public int getRowCount() { return weightList.size(); } 
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    // Method for column information
    public String getColumnName(int col) { return columnNames[col]; } 
    public java.lang.Class<?> getColumnClass(int col) { return columnClasses[col]; } 
    
    // Method to return each cell value
    public Object getValueAt(int row, int col) { 
        int rowCount = 0;
        for (AssignmentCategory currWeight : weightList) {
            if (row == rowCount) {
                switch(col) { 
                    case 0: return currWeight.getName(); 
                    case 1: return currWeight.getPercent(); 

                    default:return null;
                }
            } else {rowCount = rowCount + 1;}
        }
        return null;
    }
}
