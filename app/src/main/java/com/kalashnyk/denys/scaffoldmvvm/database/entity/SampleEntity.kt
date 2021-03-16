package com.kalashnyk.denys.scaffoldmvvm.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.kalashnyk.denys.scaffoldmvvm.base.BaseEntity
import com.kalashnyk.denys.scaffoldmvvm.utils.Constants
import com.google.gson.annotations.SerializedName

@Entity(tableName = Constants.Db.SAMPLE)
data class SampleEntity(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("id")
    val id: Int,
    @SerializedName("userId")
    val userId: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("completed")
    val completed: Boolean
): BaseEntity()