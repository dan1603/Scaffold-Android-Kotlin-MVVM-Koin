package com.kalashnyk.denys.scaffoldmvvm.usecases.sample

import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import io.reactivex.Completable
import io.reactivex.Flowable

interface SampleFlow {
    fun getSampleData(): Flowable<List<SampleEntity>>
    fun fetchSampleData(): Completable
}