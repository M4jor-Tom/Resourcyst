package resourcePackage;

import java.io.File;
import java.net.URL;

public class MusicResource extends AudioResource
{
	private Album _album;
	
	public MusicResource(URL url, File file, String name, Author author)
	{
		super(url, file, name, author);
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