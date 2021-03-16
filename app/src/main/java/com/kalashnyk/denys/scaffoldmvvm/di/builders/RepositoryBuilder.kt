package com.kalashnyk.denys.scaffoldmvvm.di.builders

import com.kalashnyk.denys.scaffoldmvvm.database.AppDatabase
import com.kalashnyk.denys.scaffoldmvvm.network.communicator.Communicator
import com.kalashnyk.denys.scaffoldmvvm.repository.sample.SampleRepository
import com.kalashnyk.denys.scaffoldmvvm.repository.sample.SampleRepositoryProvider

class RepositoryBuilder(
    private val communicator: Communicator,
    private val db: AppDatabase
) {

    fun initSampleRepository(): SampleRepository = SampleRepositoryProvider(communicator, db)

}