package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import java.util.ArrayList;
import java.util.List;

public class Author
{
	private long _id;
	private String _name;
	private List<Resource> _resources;
	private List<Album> _albums;

	public Author(long id, String name, List<Resource> resources, List<Album> albums)
	{
		setId(id);
		setName(name);
		setResources(new ArrayList<>());
		setResources(resources);
		setAlbums(new ArrayList<>());
		setAlbums(albums);
	}

	public Author(long id, String name)
	{
		this(id, name, new ArrayList<>(), new ArrayList<>());
	}
	
	public Author(String name)
	{
		this(Resource.UNDEFINED_ID, name, new ArrayList<>(), new ArrayList<>());
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

	public List<Album> getAlbums()
	{
		return _albums;
	}

	public void setAlbums(List<Album> albums)
	{
		_albums = albums;
	}
}