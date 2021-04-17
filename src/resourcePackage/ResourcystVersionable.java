package resourcePackage;

import versionystPackage.Versionable;

public class ResourcystVersionable extends Versionable
{
	public ResourcystVersionable()
	{
		super();
		getDependencies().put("Versionyst", 4);
	}
	
	@Override
	public Integer getVersionId()
	{
		return 4;
	}
}