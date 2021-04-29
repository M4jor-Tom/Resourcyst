package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import com.example.androidmusyst.Versionyst.src.versionystPackage.Versionable;

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
		return 5;
	}

	@Override
	protected String getPackageName()
	{
		return "ResourcystVersionable";
	}
}