package com.kalashnyk.denys.scaffoldmvvm.domain

import com.kalashnyk.denys.scaffoldmvvm.base.BaseViewModel
import com.kalashnyk.denys.scaffoldmvvm.database.entity.SampleEntity
import com.kalashnyk.denys.scaffoldmvvm.usecases.sample.SampleFlow
import com.kalashnyk.denys.scaffoldmvvm.utils.RxTransformers
import com.kalashnyk.denys.scaffoldmvvm.utils.SingleLiveEvent
import io.reactivex.rxkotlin.subscribeBy

class DefaultViewModel(
    private val flow: SampleFlow,
    private val rx: RxTransformers
): BaseViewModel() {

    val data = SingleLiveEvent<List<SampleEntity>>()

    init {
        add(
            flow.getSampleData()
                .compose(rx.presentationFlowableTransformer())
                .subscribeBy { data.postValue(it) }
        )
    }

    fun fetchData() {
        onLoadStarted()
        add(
            flow.fetchSampleData()
                .compose(rx.fetchingCompletableTransformer())
                .subscribe(::onLoadFinished, ::onError)
        )
    }
}