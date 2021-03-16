package com.kalashnyk.denys.scaffoldmvvm.di.modules

import androidx.annotation.Keep

@Keep
val applicationModules = listOf(
    networkModule,
    databaseModule,
    repositoryModule,
    useCasesModule,
    utilitiesModule,
    viewModelModule
)