package resourcePackage;

import java.util.ArrayList;

public class Album
{
	private ArrayList<Author> _authors;
	
	public Album(Author author)
	{
		setAuthors(new ArrayList<>());
		getAuthors().add(author);
	}
	
	public Album(ArrayList<Author> authors)
	{
		setAuthors(new ArrayList<>());
		setAuthors(authors);
	}

	public ArrayList<Author> getAuthors()
	{
		return _authors;
	}

	public void setAuthors(ArrayList<Author> authors)
	{
		_authors = authors;
	}
}