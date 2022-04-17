import java.util.LinkedList;

public class ClassList {
	
	LinkedList<Class> classList = new LinkedList<Class>();
	
	public ClassList()
	{
		
	}
	
	public void addClass(Class newclass)
	{
		classList.add(newclass);
	}
	
	public int getSize()
	{
		int size = classList.size();
		
		return size;
	}
	
	public Class getClass(int index)
	{
		Class newclass = classList.get(index);
		
		return newclass;
	}
	
	public Class getClass(String name)
	{
		Class newclass = new Class();
		
		for(int i = 0; i < classList.size(); i++)
		{
			Class currentClass = classList.get(i);
			
			if(currentClass.getClassName().equals(name))
				newclass = currentClass;
		}
		
		return newclass;
	}
	
	public void removeClass(Class newclass)
	{
		if(searchClass(newclass) < 0)
		{
			// Assignment does not exist in class
		}
		else
		{
			int index = searchClass(newclass);
			classList.remove(index);
		}
	}
	
	public int searchClass(Class newclass)
	{
		int index = -1;
		
		String searchName = newclass.getClassName();
		boolean matching;
		int size = 0;
		
		if(classList != null)
			size = classList.size();
			
		for(int i = 0; i < size; i++)
		{
			Class currentClass = classList.get(i);
			
			// Check for matching assignment
			if(currentClass.getClassName().equals(searchName))
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
}