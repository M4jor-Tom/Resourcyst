package resourcePackage;

import java.io.File;
import java.net.URL;

public class ImageResource extends Resource
{
	public ImageResource(int localId, URL url, File file, String name, Author author)
	{
		super(localId, url, file, name, author);
	}
	
	public ImageResource(URL url, File file, String name, Author author)
	{
		super(url, file, name, author);
	}
}