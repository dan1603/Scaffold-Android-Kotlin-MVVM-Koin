package com.kalashnyk.denys.scaffoldmvvm.network.communicator

import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import com.kalashnyk.denys.scaffoldmvvm.network.api.ApiService
import io.reactivex.Single

class ServerCommunicator(
    private val api: ApiService
): Communicator {

    override fun getSampleData(): Single<List<SampleEntity>> = api.getSampleData()

}