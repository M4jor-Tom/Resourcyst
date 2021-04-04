package resourcePackage;

import java.io.File;
import java.net.URL;

public class MusicResource extends AudioResource
{
	private Album _album;

	public MusicResource(URL url, File file, String name, Album album)
	{
		super(url, file, name, null);
		
		//Case of a multi-artists Album
		setAlbum(album);
	}
	
	public MusicResource(URL url, File file, String name, Author author)
	{
		super(url, file, name, author);
		
		//Case of a single
		setAlbum(new Album(author, name));
	}

	public Album getAlbum()
	{
		return _album;
	}

	public void setAlbum(Album album)
	{
		_album = album;
	}
}