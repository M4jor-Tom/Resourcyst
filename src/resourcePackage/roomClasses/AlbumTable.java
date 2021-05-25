package com.example.androidmusyst.Resourcyst.src.resourcePackage.roomClasses;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class AlbumTable
{
    @PrimaryKey
    @ColumnInfo(name = "albumId")
    public long _id;

    @ColumnInfo(name = "name")
    public String _name;
}