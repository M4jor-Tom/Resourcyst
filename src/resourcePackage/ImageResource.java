package resourcePackage;

import java.io.File;
import java.net.URL;

public class ImageResource extends Resource
{
	public ImageResource(int localId, URL url, File file, String name, String author)
	{
		super(localId, url, file, name, author);
	}
}