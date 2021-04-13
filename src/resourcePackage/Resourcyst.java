package resourcePackage;

import java.util.HashMap;

import versionystPackage.Versionable;

public class Resourcyst extends Versionable
{
	@Override
	public Integer _getVersionId()
	{
		return 2;
	}
	
	@Override
	public HashMap<String, Integer> getSubPackageExpectedVersions()
	{
		HashMap<String, Integer> dependencies = new HashMap<>();
		dependencies.put("Versionyst", 3);
		return dependencies;
	}
}