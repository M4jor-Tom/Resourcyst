package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.example.androidmusyst.Resourcyst.src.resourcePackage.roomClasses.ResourceTable;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

abstract public class Resource
{
	@Embedded
	public ResourceTable _resourceTable;

	@Relation(
			parentColumn = "authorId",
			entityColumn = "resourceId"
	)
	private List<Author> _authors;

	final public static int UNDEFINED_ID = -1;

	final public static int AUDIO = 1;
	final public static int IMAGE = 2;
	final public static int MUSIC = 3;
	final public static int VIDEO = 4;
	
	public Resource(long localId, URL url, File file, String name, List<Author> authors)
	{
		setlocalId(localId);
		setUrl(url);
		setFile(file);
		setName(name);
		setAuthors(new ArrayList<>());
		setAuthors(authors);
	}

	public Resource(URL url, File file, String name, List<Author> authors)
	{
		this(UNDEFINED_ID, url, file, name, authors);
	}
	
	public Resource(long localId, URL url, File file, String name, Author author)
	{
		this(localId, url, file, name, new ArrayList<Author>());
		getAuthors().add(author);
	}

	public Resource(URL url, File file, String name, Author author)
	{
		this(UNDEFINED_ID, url, file, name, author);
	}
	
	public Resource(long localId, URL url, File file, String name)
	{
		this(localId, url, file, name, new ArrayList<>());
	}
	
	public Resource(URL url, File file, String name)
	{
		this(UNDEFINED_ID, url, file, name);
	}
	
	public String getMime()
	{
		String mime = "Error/Error";
		try
		{
			mime = Files.probeContentType(Paths.get(getFile().toURI()));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return mime;
	}
	
	public String toString()
	{
		return getName();
	}

	public long getlocalId()
	{
		return _resourceTable.getLocalId();
	}

	public void setlocalId(long localId)
	{
		_resourceTable.setLocalId(localId);
	}

	public URL getUrl()
	{
		try
		{
			return new URL(_resourceTable.getStringUrl());
		}
		catch(MalformedURLException e)
		{
			System.out.println("Error: url " + _resourceTable.getStringUrl() + " corresponds to nothing");
		}

		return null;
	}
	
	public void setUrl(URL url)
	{
		_resourceTable.setStringUrl(url.toString());
	}

	public File getFile()
	{
		return new File(_resourceTable.getStringPath());
	}

	public void setFile(File file)
	{
		_resourceTable.setStringPath(file.getPath());
	}

	public String getName()
	{
		return _resourceTable.getName();
	}

	public void setName(String name)
	{
		_resourceTable.setName(name);
	}

	public List<Author> getAuthors()
	{
		return _authors;
	}

	public void setAuthors(List<Author> authors)
	{
		_authors = authors;
	}
}