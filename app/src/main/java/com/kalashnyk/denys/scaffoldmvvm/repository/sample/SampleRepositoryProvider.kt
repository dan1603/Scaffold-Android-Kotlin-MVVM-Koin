package com.kalashnyk.denys.scaffoldmvvm.repository.sample

import com.kalashnyk.denys.scaffoldmvvm.database.AppDatabase
import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import com.kalashnyk.denys.scaffoldmvvm.network.communicator.Communicator
import io.reactivex.Completable
import io.reactivex.Flowable

class SampleRepositoryProvider(
    private val communicator: Communicator,
    private val database: AppDatabase
): SampleRepository {

    override fun getSampleData(): Flowable<List<SampleEntity>> {
        return database.sampleDao().queryFlow()
    }

    override fun fetchSampleData(): Completable {
        return communicator.getSampleData().flatMapCompletable {
            Completable.fromAction {
                database.sampleDao().deleteAll()
                database.sampleDao().insertList(it)
            }
        }
    }

}