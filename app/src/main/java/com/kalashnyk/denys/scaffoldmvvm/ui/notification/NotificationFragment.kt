package com.kalashnyk.denys.scaffoldmvvm.ui.notification

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kalashnyk.denys.scaffoldmvvm.base.BaseFragment
import com.kalashnyk.denys.scaffoldmvvm.base.BaseViewModel
import com.kalashnyk.denys.scaffoldmvvm.databinding.FragmentNotificationBinding

class NotificationFragment : BaseFragment<FragmentNotificationBinding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentNotificationBinding
        get() = FragmentNotificationBinding::inflate

    override fun getVM(): BaseViewModel? {
        return null
    }

    override fun setupView(binder: FragmentNotificationBinding) {

    }

    companion object {
        @JvmStatic
        fun newInstance() = NotificationFragment()
    }
}