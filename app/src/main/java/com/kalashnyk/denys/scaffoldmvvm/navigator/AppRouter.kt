package com.kalashnyk.denys.scaffoldmvvm.navigator

import com.kalashnyk.denys.scaffoldmvvm.base.BaseActivity

interface AppRouter {
    var source: BaseActivity<*>
    fun openMainScreen()
}