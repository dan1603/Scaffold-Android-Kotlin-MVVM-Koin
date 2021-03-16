package com.kalashnyk.denys.scaffoldmvvm.di.modules

import androidx.annotation.Keep
import com.kalashnyk.denys.scaffoldmvvm.domain.DefaultViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

@Keep
val viewModelModule = module(override = true) {
    viewModel { DefaultViewModel(get(), get()) }
}