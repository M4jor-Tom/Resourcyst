package resourcePackage;

import java.util.HashMap;

import versionystPackage.Versionable;

public class Resourcyst extends Versionable
{
	@Override
	public Integer _getVersionId()
	{
		return 1;
	}
	
	@Override
	public void _checkSubPackagesVersions(HashMap<String, Integer> versionsIds)
	{
		//No dependencies required
	}
}