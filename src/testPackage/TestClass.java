package testPackage;

import java.util.HashMap;

import resourcePackage.Resourcyst;
import versionystPackage.Versionable;
import versionystPackage.Versionyst;

public class TestClass
{
	public static void versionsCheck()
	{
		//Variables initialization
		HashMap<String, Integer> existingDependencies = new HashMap<>();
		Versionable[] versionables =
		{
			new Resourcyst(),
			new Versionyst()
		};
		
		//Versions setting
		existingDependencies.put("Versionyst", versionables[1].getVersionId());

		//Versions checking
		for(Versionable versionable: versionables)
			versionable.checkSubPackagesVersions(existingDependencies);
	}
	
	public static void main(String[] args)
	{
		//Checking versions
		versionsCheck();
	}
}
