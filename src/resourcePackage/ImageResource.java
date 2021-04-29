package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import java.io.File;
import java.net.URL;

public class ImageResource extends Resource
{
	public ImageResource(int localId, URL url, File file, String name)
	{
		super(localId, url, file, name);
	}
	
	public ImageResource(URL url, File file, String name)
	{
		super(url, file, name);
	}
}