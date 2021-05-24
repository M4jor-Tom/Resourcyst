package com.example.androidmusyst.Resourcyst.src.resourcePackage.roomClasses;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(primaryKeys = {"albumId", "authorId"})
public class AlbumAuthorCrossTable
{
    @ColumnInfo(name = "albumId")
    public long _albumId;

    @ColumnInfo(name = "authorId")
    public long _authorId;
}