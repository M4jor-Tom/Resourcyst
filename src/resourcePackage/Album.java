package resourcePackage;

import java.util.ArrayList;
import java.util.List;

public class Album
{
	private long _id;
	private String _name;
	private List<Author> _authors;
	private List<MusicResource> _musicResources;

	public Album(long id, String name, List<Author> authors, List<MusicResource> musicResources)
	{
		setId(id);
		setName(name);
		setAuthors(authors);
		setMusicResources(musicResources);
	}

	public Album(long id, Author author, String name)
	{
		this(id, name, new ArrayList<>(), new ArrayList<>());
		getAuthors().add(author);
	}

	public Album(Author author, String name)
	{
		this(Resource.UNDEFINED_ID, name, new ArrayList<>(), new ArrayList<>());
		getAuthors().add(author);
	}
	
	public Album(List<Author> authors, String name)
	{
		this(Resource.UNDEFINED_ID, name, authors, new ArrayList<>());
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

	public List<Author> getAuthors()
	{
		return _authors;
	}

	public void setAuthors(List<Author> authors)
	{
		_authors = authors;
	}

	public List<MusicResource> getMusicResources()
	{
		return _musicResources;
	}

	public void setMusicResources(List<MusicResource> musicResources)
	{
		_musicResources = musicResources;
	}
}