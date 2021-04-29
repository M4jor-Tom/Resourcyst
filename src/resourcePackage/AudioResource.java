package resourcePackage;

import java.io.File;
import java.net.URL;
import java.util.List;

public class AudioResource extends Resource
{
	public AudioResource(URL url, File file, String name, List<Author> authors)
	{
		super(url, file, name, authors);
	}

	public AudioResource(URL url, File file, String name, Author author)
	{
		super(url, file, name, author);
	}
}