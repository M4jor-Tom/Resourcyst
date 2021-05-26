package com.example.androidmusyst.Resourcyst.src.resourcePackage.roomClasses;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
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
    private static volatile ApplicationDatabase _instance;

    public static ApplicationDatabase getInstance(Context context)
    {
        if(_instance == null)
            synchronized(ApplicationDatabase.class)
            {
                if (_instance == null)
                    _instance = Room.databaseBuilder(context.getApplicationContext(),
                            ApplicationDatabase.class, "resourcyst_db")
                            .build();
            }

        return _instance;
    }

    public abstract ResourceDao resourceDao();
}