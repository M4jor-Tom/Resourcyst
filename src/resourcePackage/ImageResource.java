package resourcePackage;

import java.io.File;
import java.net.URL;

public class ImageResource extends resourcePackage.Resource
{
	public ImageResource(int localId, URL url, File file, String name)
	{
		super(localId, url, file, name);
	}
	
	public ImageResource(URL url, File file, String name)
	{
		super(url, file, name);
	}
}