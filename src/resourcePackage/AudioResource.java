package resourcePackage;

import java.io.File;
import java.net.URL;
import java.util.List;

public class AudioResource extends resourcePackage.Resource
{
	public AudioResource(URL url, File file, String name, List<resourcePackage.Author> authors)
	{
		super(url, file, name, authors);
	}

	public AudioResource(URL url, File file, String name, resourcePackage.Author author)
	{
		super(url, file, name, author);
	}
}