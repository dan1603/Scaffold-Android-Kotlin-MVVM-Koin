package com.kalashnyk.denys.scaffoldmvvm.usecases.sample

import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import com.kalashnyk.denys.scaffoldmvvm.repository.sample.SampleRepository
import io.reactivex.Completable
import io.reactivex.Flowable

class SampleUseCases(
    private val repository: SampleRepository
): SampleFlow {

    override fun getSampleData(): Flowable<List<SampleEntity>> {
        return repository.getSampleData()
    }

    override fun fetchSampleData(): Completable {
        return repository.fetchSampleData()
    }
}