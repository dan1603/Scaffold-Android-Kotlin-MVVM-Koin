package com.kalashnyk.denys.scaffoldmvvm.di.modules

import androidx.annotation.Keep
import com.kalashnyk.denys.scaffoldmvvm.di.builders.UtilitiesBuilder
import org.koin.dsl.module

@Keep
val utilitiesModule = module {
    single { UtilitiesBuilder() }
    single { get<UtilitiesBuilder>().initRxTransformers() }
}