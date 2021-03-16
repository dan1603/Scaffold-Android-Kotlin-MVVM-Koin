package com.kalashnyk.denys.scaffoldmvvm.network.api

import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import io.reactivex.Single
import retrofit2.http.GET

interface ApiService {

    @GET("/todos")
    fun getSampleData(): Single<List<SampleEntity>>

}