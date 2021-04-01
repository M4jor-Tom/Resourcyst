package resourcePackage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

abstract public class Resource
{
	private int _localId;
	private URL _url;
	private File _file;
	private String _name;
	private Author _author;
	final public static int UNDEFINED = -1;
	
	public Resource(int localId, URL url, File file, String name, Author author)
	{
		setlocalId(localId);
		setUrl(url);
		setFile(file);
		setName(name);
		setAuthor(author);
	}
	
	public Resource(URL url, File file, String name, Author author)
	{
		setlocalId(Resource.UNDEFINED);
		setUrl(url);
		setFile(file);
		setName(name);
		setAuthor(author);
	}
	
	public String getMime()
	{
		String mime = "Error/Error";
		try
		{
			mime = Files.probeContentType(Paths.get(getFile().toURI()));
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return mime;
	}
	
	public String toString()
	{
		return getAuthor() + " | " + getName();
	}

	public int getlocalId()
	{
		return _localId;
	}

	public void setlocalId(int localId)
	{
		_localId = localId;
	}

	public URL getUrl()
	{
		return _url;
	}
	
	public void setUrl(URL url)
	{
		_url = url;
	}

	public File getFile()
	{
		return _file;
	}

	public void setFile(File file)
	{
		_file = file;
	}

	public String getName()
	{
		return _name;
	}

	public void setName(String name)
	{
		_name = name;
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