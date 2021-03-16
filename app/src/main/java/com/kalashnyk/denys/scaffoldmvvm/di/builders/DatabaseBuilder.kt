package com.kalashnyk.denys.scaffoldmvvm.di.builders

import android.content.Context
import androidx.room.Room
import com.kalashnyk.denys.scaffoldmvvm.database.AppDatabase
import com.kalashnyk.denys.scaffoldmvvm.utils.Constants

class DatabaseBuilder(private val context: Context) {

    fun initDatabase(): AppDatabase = Room.databaseBuilder(
        context,
        AppDatabase::class.java,
        Constants.Db.NAME
    )
        .fallbackToDestructiveMigration()
        .build()
}