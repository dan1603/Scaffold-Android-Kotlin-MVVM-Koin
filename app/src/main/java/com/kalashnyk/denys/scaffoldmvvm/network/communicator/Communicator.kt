package com.kalashnyk.denys.scaffoldmvvm.network.communicator

import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import io.reactivex.Single

interface Communicator {
    fun getSampleData(): Single<List<SampleEntity>>
}