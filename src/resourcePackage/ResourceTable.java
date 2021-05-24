package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.File;
import java.net.URL;
import java.util.List;

@Entity
public class ResourceTable
{
    @PrimaryKey
    @ColumnInfo(name = "resourceId")
    public long _localId;

    @ColumnInfo(name = "resourceTypeId")
    public int _typeId;

    @ColumnInfo(name = "url")
    public String _stringUrl;

    @ColumnInfo(name = "file")
    public String _stringPath;

    @ColumnInfo(name = "name")
    public String _name;

    public long getLocalId()
    {
        return _localId;
    }

    public void setLocalId(long localId)
    {
        _localId = localId;
    }

    public String getStringUrl()
    {
        return _stringUrl;
    }

    public void setStringUrl(String stringUrl)
    {
        _stringUrl = stringUrl;
    }

    public String getStringPath()
    {
        return _stringPath;
    }

    public void setStringPath(String stringPath)
    {
        _stringPath = stringPath;
    }

    public String getName()
    {
        return _name;
    }

    public void setName(String name)
    {
        _name = name;
    }
}