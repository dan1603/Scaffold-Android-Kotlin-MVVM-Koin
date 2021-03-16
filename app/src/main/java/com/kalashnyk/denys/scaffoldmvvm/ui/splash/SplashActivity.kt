package com.kalashnyk.denys.scaffoldmvvm.ui.splash

import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import com.kalashnyk.denys.scaffoldmvvm.base.BaseActivity
import com.kalashnyk.denys.scaffoldmvvm.databinding.ActivitySplashBinding
import com.kalashnyk.denys.scaffoldmvvm.utils.Constants

class SplashActivity : BaseActivity<ActivitySplashBinding>() {

    override val inflater: (LayoutInflater) -> ActivitySplashBinding
        get() = ActivitySplashBinding::inflate

    override fun setupView(binder: ActivitySplashBinding) {
        Handler(Looper.getMainLooper())
            .postDelayed({ navigator.openMainScreen() }, Constants.UI.SPLASH_DELAY)
    }

}