package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import java.util.ArrayList;
import java.util.List;

public class Author
{
	private long _id;
	private String _name;
	private List<Resource> _resources;

	public Author(long id, String name, List<Resource> resources)
	{
		setId(id);
		setName(name);
		setResources(new ArrayList<>());
		setResources(resources);
	}

	public Author(long id, String name)
	{
		this(id, name, new ArrayList<>());
	}
	
	public Author(String name)
	{
		this(Resource.UNDEFINED_ID, name, new ArrayList<>());
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

	public String getName()
	{
		return _name;
	}

	public void setName(String name)
	{
		_name = name;
	}

	public List<Resource> getResources()
	{
		return _resources;
	}

	public void setResources(List<Resource> resources)
	{
		_resources = resources;
	}
}