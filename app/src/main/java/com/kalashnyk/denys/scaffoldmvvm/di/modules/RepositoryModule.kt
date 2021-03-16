package com.kalashnyk.denys.scaffoldmvvm.di.modules

import androidx.annotation.Keep
import com.kalashnyk.denys.scaffoldmvvm.di.builders.RepositoryBuilder
import org.koin.dsl.module

@Keep
val repositoryModule = module {
    single { RepositoryBuilder(get(), get()) }
    single { get<RepositoryBuilder>().initSampleRepository() }
}