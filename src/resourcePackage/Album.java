package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import java.util.ArrayList;
import java.util.List;

public class Album
{
	private long _id;
	private List<Author> _authors;
	private String _name;
	
	public Album(Author author, String name)
	{
		this(new ArrayList<>(), name);
		getAuthors().add(author);
	}

	public Album(long id, Author author, String name)
	{
		this(author, name);
		setId(id);
	}
	
	public Album(List<Author> authors, String name)
	{
		setAuthors(new ArrayList<>());
		setAuthors(authors);
		setName(name);
	}

	public Album(long id, List<Author> authors, String name)
	{
		this(authors, name);
		setId(id);
	}
	
	public String toString()
	{
		return getName();
	}

	public long getId()
	{
		return _id;
	}

	public void setId(long id)
	{
		_id = id;
	}

	public List<Author> getAuthors()
	{
		return _authors;
	}

	public void setAuthors(List<Author> authors)
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