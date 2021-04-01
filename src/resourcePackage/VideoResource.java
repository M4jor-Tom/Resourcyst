package resourcePackage;

import java.io.File;
import java.net.URL;

public class VideoResource extends Resource
{
	public VideoResource(int localId, URL url, File file, String name, Author author)
	{
		super(localId, url, file, name, author);
	}
	
	public VideoResource(URL url, File file, String name, Author author)
	{
		super(url, file, name, author);
	}
}