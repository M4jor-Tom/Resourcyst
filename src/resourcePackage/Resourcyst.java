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
	public HashMap<String, Integer> getSubPackageExpectedVersions()
	{
		HashMap<String, Integer> dependencies = new HashMap<>();
		dependencies.put("Versionyst", 2);
		return dependencies;
	}
}