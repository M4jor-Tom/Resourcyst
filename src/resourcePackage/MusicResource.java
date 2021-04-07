package resourcePackage;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;

public class MusicResource extends AudioResource
{
	ArrayList<Album> _albums;
	
	public MusicResource(URL url, File file, String name, Album album)
	{
		this(url, file, name, new ArrayList<Album>() 
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
	
	public MusicResource(URL url, File file, String name, ArrayList<Album> albums)
	{
		super(url, file, name);
		setAlbums(new ArrayList<>());
		setAlbums(albums);
	}
	
	public ArrayList<Album> getAlbums()
	{
		return _albums;
	}
	
	public void setAlbums(ArrayList<Album> albums)
	{
		_albums = albums;
	}
}