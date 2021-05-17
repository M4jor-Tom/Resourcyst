package resourcePackage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class MusicResource extends resourcePackage.AudioResource
{
	private List<resourcePackage.Album> _albums;
	
	public MusicResource(URL url, File file, String name, resourcePackage.Album album)
	{
		this(url, file, name, new ArrayList<resourcePackage.Album>()
			{
				/**
				 * 
				 */
				private static final long serialVersionUID = 7727254019338119056L;
	
				{
					add(album);
				}
			}
		);
	}
	
	public MusicResource(URL url, File file, String name, ArrayList<resourcePackage.Album> albums)
	{
		super(url, file, name, new ArrayList<>());
		
		setAlbums(new ArrayList<>());
		setAlbums(albums);
		
		//Getting Authors from Albums
		ArrayList<resourcePackage.Author> authors = new ArrayList<>();
		for(resourcePackage.Album album: getAlbums())
			authors.addAll(album.getAuthors());
		
		setAuthors(authors);
	}
	
	public List<resourcePackage.Album> getAlbums()
	{
		return _albums;
	}
	
	public void setAlbums(ArrayList<resourcePackage.Album> albums)
	{
		_albums = albums;
	}
}