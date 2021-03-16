package com.kalashnyk.denys.scaffoldmvvm.repository.sample

import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import io.reactivex.Completable
import io.reactivex.Flowable

interface SampleRepository {

    fun getSampleData(): Flowable<List<SampleEntity>>

    fun fetchSampleData(): Completable

}