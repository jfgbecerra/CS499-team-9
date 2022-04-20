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
    
    public void removeWeight(AssignmentCategory cat) {
    	if(searchWeight(cat) < 0)
    	{
    		// Weight doesn't exist
    	}
    	else
    	{
    		int index = searchWeight(cat);
    		weightList.remove(index);
    	}
    }
    
    public int searchWeight(AssignmentCategory cat) {
		int index = -1;
		String searchName = cat.getName();
		double searchWeight = cat.getPercent();
		boolean matchingName = false;
		boolean matchingWeight = false;
		int size = 0;
		
		if(weightList != null)
			size = weightList.size();
		
		for(int i = 0; i < size; i++)
		{
			AssignmentCategory currentCat = weightList.get(i);
			
			if(currentCat.getName().equals(searchName))
			{
				matchingName = true;
			}
			else
			{
				matchingName = false;
			}
			
			if(currentCat.getPercent() == searchWeight)
			{
				matchingWeight = true;
			}
			else
			{
				matchingWeight = false;
			}
			
			if(matchingName && matchingWeight)
			{
				index = i;
			}
		}
		
		return index;
			
    }
    
    public AssignmentCategory getCategory(int index)
    {
    	AssignmentCategory cat = weightList.get(index);
    	
    	return cat;
    }
    
    public AssignmentCategory getCategory(String name)
    {
    	AssignmentCategory cat = new AssignmentCategory();
		
		for(int i = 0; i < weightList.size(); i++)
		{
			AssignmentCategory currentCat = weightList.get(i);
			
			if(currentCat.getName().equals(name))
				cat = currentCat;
		}
		
		return cat;
    }
    
    public int getSize()
    {
    	int size = weightList.size();
    	
    	return size;
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