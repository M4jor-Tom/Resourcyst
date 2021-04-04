package resourcePackage;

import java.io.File;
import java.net.URL;

public class MusicResource extends AudioResource
{
	public MusicResource(URL url, File file, String name)
	{
		super(url, file, name, null);
	}
}