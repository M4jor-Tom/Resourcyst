package com.example.androidmusyst.Resourcyst.src.resourcystTestPackage;

import java.util.HashMap;

import com.example.androidmusyst.Resourcyst.src.resourcePackage.ResourcystVersionable;
import com.example.androidmusyst.Versionyst.src.versionystPackage.Versionable;
import com.example.androidmusyst.Versionyst.src.versionystPackage.Versionyst;

public class TestClass
{
	public static void versionsCheck()
	{
		//Variables initialization
		HashMap<String, Integer> existingDependencies = new HashMap<>();
		Versionable[] versionables =
		{
			new ResourcystVersionable(),
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
		
		System.out.println("That's good.");
	}
}
