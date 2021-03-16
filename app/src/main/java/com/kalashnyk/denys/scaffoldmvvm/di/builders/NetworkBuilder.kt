package com.kalashnyk.denys.scaffoldmvvm.di.builders

import com.kalashnyk.denys.scaffoldmvvm.BuildConfig
import com.kalashnyk.denys.scaffoldmvvm.network.api.ApiService
import com.kalashnyk.denys.scaffoldmvvm.network.communicator.Communicator
import com.kalashnyk.denys.scaffoldmvvm.network.communicator.ServerCommunicator
import okhttp3.ConnectionPool
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class NetworkBuilder {

    fun initOkHttpClient(): OkHttpClient {
        var httpClient= OkHttpClient.Builder()
            .connectionPool(ConnectionPool(5, 30, TimeUnit.SECONDS))
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)

        if (BuildConfig.DEBUG) {
            httpClient=httpClient
                .addInterceptor(
                    HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    }
                )
        }

        return httpClient.build()
    }

    fun initRetrofitBuilder(client: OkHttpClient): Retrofit.Builder = Retrofit.Builder()
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())


    fun initRetrofitApiInterface(builder: Retrofit.Builder): ApiService = builder
        .baseUrl(BuildConfig.API)
        .build()
        .create(ApiService::class.java)

    fun initServerCommunicator(api: ApiService): Communicator = ServerCommunicator(api)

}