package com.example.androidmusyst.Resourcyst.src.resourcePackage.roomClasses;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity(primaryKeys = {"albumId", "musicResourceId"})
public class AlbumMusicResourceCrossTable
{
    @ColumnInfo(name = "albumId")
    public long _albumId;

    @ColumnInfo(name = "musicResourceId")
    public long _musicResourceId;
}