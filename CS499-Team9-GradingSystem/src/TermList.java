import java.util.LinkedList;

public class TermList {
	
	LinkedList<Term> termList = new LinkedList<Term>();
	
	public TermList()
	{
		
	}
	
	public void addTerm(Term term)
	{
		termList.add(term);
	}
	
	public int getSize()
	{
		int size = termList.size();
		
		return size;
	}
	
	public Term getTerm(int index)
	{
		Term term = termList.get(index);
		
		return term;
	}
	
	public Term getTerm(String name)
	{
		Term term = new Term();
		
		for(int i = 0; i < termList.size(); i++)
		{
			Term currentTerm = termList.get(i);
			
			if(currentTerm.getTermName().equals(name))
				term = currentTerm;
		}
		
		return term;
	}
	
	public void removeTerm(Term term)
	{
		if(searchTerm(term) < 0)
		{
			// Assignment does not exist in class
		}
		else
		{
			int index = searchTerm(term);
			termList.remove(index);
		}
	}
	
	public int searchTerm(Term term)
	{
		int index = -1;
		
		String searchName = term.getTermName();
		boolean matching;
		int size = 0;
		
		if(termList != null)
			size = termList.size();
			
		for(int i = 0; i < size; i++)
		{
			Term currentTerm = termList.get(i);
			
			// Check for matching assignment
			if(currentTerm.getTermName().equals(searchName))
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
