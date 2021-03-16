package com.kalashnyk.denys.scaffoldmvvm.di.modules

import androidx.annotation.Keep
import com.kalashnyk.denys.scaffoldmvvm.di.builders.UseCasesBuilder
import org.koin.dsl.module

@Keep
val useCasesModule = module {
    single { UseCasesBuilder() }
    single { get<UseCasesBuilder>().initSampleUseCases(get()) }
}