package com.kalashnyk.denys.scaffoldmvvm.di.modules

import androidx.annotation.Keep
import com.kalashnyk.denys.scaffoldmvvm.di.builders.DatabaseBuilder
import org.koin.dsl.module

@Keep
val databaseModule = module {
    single { DatabaseBuilder(get()) }
    single { get<DatabaseBuilder>().initDatabase() }
}