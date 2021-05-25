package resourcePackage;

public class Author
{
	private long _id;
	private String _name;
	
	public Author(String name)
	{
		setId(Resource.UNDEFINED_ID);
		setName(name);
	}
	
	public String toString()
	{
		return getName();
	}
	
	public Author(long id, String name)
	{
		setId(id);
		setName(name);
	}

	public long getId()
	{
		return _id;
	}

	public void setId(long id)
	{
		_id = id;
	}

	public String getName()
	{
		return _name;
	}

	public void setName(String name)
	{
		_name = name;
	}
	
}