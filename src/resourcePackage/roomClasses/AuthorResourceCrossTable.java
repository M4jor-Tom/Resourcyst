package com.example.androidmusyst.Resourcyst.src.resourcePackage.roomClasses;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(primaryKeys = {"authorId", "resourceId"})
public class AuthorResourceCrossTable
{
    @ColumnInfo(name = "authorId")
    public long _authorId;

    @ColumnInfo(name = "resourceId")
    public long _resourceId;
}