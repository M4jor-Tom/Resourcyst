package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import java.io.File;
import java.net.URL;

public class VideoResource extends Resource
{
	public VideoResource(long localId, URL url, File file, String name)
	{
		super(localId, url, file, name);
	}
	
	public VideoResource(URL url, File file, String name)
	{
		this(UNDEFINED_ID, url, file, name);
	}
}