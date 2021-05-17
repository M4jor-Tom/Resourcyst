package resourcePackage;

import java.util.ArrayList;
import java.util.List;

public class Album
{
	private List<resourcePackage.Author> _authors;
	private String _name;
	
	public Album(resourcePackage.Author author, String name)
	{
		setAuthors(new ArrayList<>());
		getAuthors().add(author);
		setName(name);
	}
	
	public Album(List<resourcePackage.Author> authors, String name)
	{
		setAuthors(new ArrayList<>());
		setAuthors(authors);
		setName(name);
	}
	
	public String toString()
	{
		return getName();
	}

	public List<resourcePackage.Author> getAuthors()
	{
		return _authors;
	}

	public void setAuthors(List<resourcePackage.Author> authors)
	{
		_authors = authors;
	}

	public String getName()
	{
		return _name;
	}

	public void setName(String name)
	{
		_name = name;
	}
}