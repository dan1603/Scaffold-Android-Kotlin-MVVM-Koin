package com.kalashnyk.denys.scaffoldmvvm.database.dao

import androidx.room.*
import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import com.kalashnyk.denys.scaffoldmvvm.utils.Constants
import io.reactivex.Flowable

@Dao
interface SampleDao {

    @Query("SELECT * FROM ${Constants.Db.SAMPLE}")
    fun queryFlow(): Flowable<List<SampleEntity>>

    @Query("SELECT * FROM ${Constants.Db.SAMPLE}")
    fun queryAll(): List<SampleEntity>

    @Query("SELECT * FROM ${Constants.Db.SAMPLE} WHERE id = :key")
    fun queryById(key: Int): SampleEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertList(list: List<SampleEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertItem(item: SampleEntity)

    @Delete
    fun deleteList(list: List<SampleEntity>)

    @Delete
    fun deleteItem(item: SampleEntity)

    @Query("DELETE FROM ${Constants.Db.SAMPLE}")
    fun deleteAll()
}