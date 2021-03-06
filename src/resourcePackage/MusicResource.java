package resourcePackage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

import java.util.List;

public class MusicResource extends AudioResource
{
	private List<Album> _albums;
	
	public MusicResource(URL url, File file, String name, Album album)
	{
		this(url, file, name, new ArrayList<Album>());
		getAlbums().add(album);
	}
	
	public MusicResource(URL url, File file, String name, List<Album> albums)
	{
		super(url, file, name, new ArrayList<>());
		
		setAlbums(new ArrayList<>());
		setAlbums(albums);
		
		//Getting Authors from Albums
		List<Author> authors = new ArrayList<>();
		for(Album album: getAlbums())
			authors.addAll(album.getAuthors());
		
		setAuthors(authors);
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