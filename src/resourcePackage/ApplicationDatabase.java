package com.example.androidmusyst.Resourcyst.src.resourcePackage;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(
        entities =
                {
                        ResourceTable.class
                },
                version = 1
)
public abstract class ApplicationDatabase extends RoomDatabase
{

}