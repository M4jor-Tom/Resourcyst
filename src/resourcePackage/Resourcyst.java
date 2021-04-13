package resourcePackage;

import versionystPackage.Versionable;

public class Resourcyst extends Versionable
{
	public Resourcyst()
	{
		super();
		getDependencies().put("Versionyst", 4);
	}
	
	@Override
	public Integer getVersionId()
	{
		return 3;
	}
}