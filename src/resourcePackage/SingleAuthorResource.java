package resourcePackage;

import java.io.File;
import java.net.URL;

public class SingleAuthorResource extends Resource
{
	private Author _author;
	
	public SingleAuthorResource(int localId, URL url, File file, String name, Author author)
	{
		super(localId, url, file, name);
		setAuthor(author);
	}
	
	public SingleAuthorResource(URL url, File file, String name, Author author)
	{
		super(url, file, name);
		setAuthor(author);
	}

	public Author getAuthor()
	{
		return _author;
	}

	public void setAuthor(Author author)
	{
		_author = author;
	}
}