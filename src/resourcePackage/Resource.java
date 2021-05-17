package resourcePackage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

abstract public class Resource
{
	private int _localId;
	private URL _url;
	private File _file;
	private String _name;
	
	private List<resourcePackage.Author> _authors;
	
	final public static int UNDEFINED = -1;
	
	public Resource(int localId, URL url, File file, String name, List<resourcePackage.Author> authors)
	{
		setlocalId(localId);
		setUrl(url);
		setFile(file);
		setName(name);
		setAuthors(new ArrayList<>());
		setAuthors(authors);
	}

	public Resource(URL url, File file, String name, List<resourcePackage.Author> authors)
	{
		this(UNDEFINED, url, file, name, authors);
	}
	
	public Resource(int localId, URL url, File file, String name, resourcePackage.Author author)
	{
		this(localId, url, file, name, new ArrayList<resourcePackage.Author>()
			{
				/**
				 * 
				 */
				private static final long serialVersionUID = -5372749102729506240L;
	
				{
					add(author);
				}
			}
		);
	}

	public Resource(URL url, File file, String name, resourcePackage.Author author)
	{
		this(UNDEFINED, url, file, name, author);
	}
	
	public Resource(int localId, URL url, File file, String name)
	{
		this(localId, url, file, name, new ArrayList<>());
	}
	
	public Resource(URL url, File file, String name)
	{
		this(UNDEFINED, url, file, name);
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
		return getName();
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

	public List<resourcePackage.Author> getAuthors()
	{
		return _authors;
	}

	public void setAuthors(List<resourcePackage.Author> authors)
	{
		_authors = authors;
	}
}