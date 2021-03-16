package com.kalashnyk.denys.scaffoldmvvm.di.builders

import com.kalashnyk.denys.scaffoldmvvm.repository.sample.SampleRepository
import com.kalashnyk.denys.scaffoldmvvm.usecases.sample.SampleUseCases
import com.kalashnyk.denys.scaffoldmvvm.usecases.sample.SampleFlow

class UseCasesBuilder {

    fun initSampleUseCases(repository: SampleRepository): SampleFlow =
        SampleUseCases(repository)

}