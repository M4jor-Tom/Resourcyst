package com.example.androidmusyst.Resourcyst.src.resourcePackage.roomClasses;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class AuthorTable
{
    @PrimaryKey
    @ColumnInfo(name = "authorId")
    public long _id;

    @ColumnInfo(name = "name")
    public String _name;
}