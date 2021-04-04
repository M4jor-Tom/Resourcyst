package resourcePackage;

import java.util.ArrayList;

public class Album
{
	private ArrayList<Author> _authors;
	private ArrayList<MusicResource> _musicResources;
	private String _name;
	
	public Album(Author author, String name)
	{
		setAuthors(new ArrayList<>());
		setMusicResources(new ArrayList<>());
		getAuthors().add(author);
		setName(name);
	}
	
	public Album(ArrayList<Author> authors, String name)
	{
		setAuthors(new ArrayList<>());
		setMusicResources(new ArrayList<>());
		setAuthors(authors);
		setName(name);
	}
	
	public String toString()
	{
		return getName();
	}

	public ArrayList<Author> getAuthors()
	{
		return _authors;
	}

	public void setAuthors(ArrayList<Author> authors)
	{
		_authors = authors;
	}

	public ArrayList<MusicResource> getMusicResources()
	{
		return _musicResources;
	}

	public void setMusicResources(ArrayList<MusicResource> musicResources)
	{
		_musicResources = musicResources;
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