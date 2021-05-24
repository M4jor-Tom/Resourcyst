package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ResourceDao
{
    @Query("SELECT * FROM ResourceTable WHERE resourceTypeId = " + Resource.MUSIC)
    public List<MusicResource> getMusicResources();

    @Insert
    void insertResources(Resource... resource);

    @Insert
    void insertResources(List<Resource> resources);

    @Delete
    void delete(Resource resource);
}