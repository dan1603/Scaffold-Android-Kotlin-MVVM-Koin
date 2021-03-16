package com.kalashnyk.denys.scaffoldmvvm.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.kalashnyk.denys.scaffoldmvvm.database.dao.SampleDao
import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import com.kalashnyk.denys.scaffoldmvvm.utils.Constants

@Database(
    entities = [
        SampleEntity::class
    ],
    version = Constants.Db.VERSION,
    exportSchema = false
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun sampleDao(): SampleDao
}