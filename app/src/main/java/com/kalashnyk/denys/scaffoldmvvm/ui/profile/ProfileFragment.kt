package com.kalashnyk.denys.scaffoldmvvm.ui.profile

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kalashnyk.denys.scaffoldmvvm.base.BaseFragment
import com.kalashnyk.denys.scaffoldmvvm.base.BaseViewModel
import com.kalashnyk.denys.scaffoldmvvm.databinding.FragmentProfileBinding

class ProfileFragment : BaseFragment<FragmentProfileBinding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentProfileBinding
        get() = FragmentProfileBinding::inflate

    override fun getVM(): BaseViewModel? {
        return null
    }

    override fun setupView(binder: FragmentProfileBinding) {
        with(binder) {
            btnTest.setOnClickListener {

            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ProfileFragment()
    }

}