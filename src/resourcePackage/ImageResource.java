package resourcePackage;

import java.io.File;
import java.net.URL;

public class ImageResource extends Resource
{
	public ImageResource(long localId, URL url, File file, String name)
	{
		super(localId, url, file, name);
	}
	
	public ImageResource(URL url, File file, String name)
	{
		super(url, file, name);
	}
}