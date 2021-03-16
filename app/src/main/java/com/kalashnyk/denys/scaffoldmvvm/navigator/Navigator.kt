package com.kalashnyk.denys.scaffoldmvvm.navigator

import android.content.Intent
import com.kalashnyk.denys.scaffoldmvvm.base.BaseActivity
import com.kalashnyk.denys.scaffoldmvvm.ui.main.MainActivity

class Navigator(override var source: BaseActivity<*>) : AppRouter {

    override fun openMainScreen() {
        source.startActivity(Intent(source, MainActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
        })
    }

}