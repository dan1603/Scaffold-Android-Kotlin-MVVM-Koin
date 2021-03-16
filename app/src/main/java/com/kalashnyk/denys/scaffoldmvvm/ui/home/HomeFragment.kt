package com.kalashnyk.denys.scaffoldmvvm.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.kalashnyk.denys.scaffoldmvvm.base.BaseFragment
import com.kalashnyk.denys.scaffoldmvvm.databinding.FragmentHomeBinding
import com.kalashnyk.denys.scaffoldmvvm.domain.DefaultViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>() {

    override val inflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeBinding
        get() = FragmentHomeBinding::inflate

    private val viewModel: DefaultViewModel by viewModel()

    private val testAdapter = TestAdapter()

    override fun getVM(): DefaultViewModel = viewModel

    override fun setupView(binder: FragmentHomeBinding) {
        with(binder) {
            rvHome.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = testAdapter
            }

            swipeRefresh.setOnRefreshListener {
                viewModel.fetchData()
            }
        }

        setupViewModel()
        viewModel.fetchData()
    }

    private fun setupViewModel() = viewModel.apply {
        data.observe(viewLifecycleOwner, Observer {
            testAdapter.updateList(it.map { it.toString() })
        })
    }

    override fun onLoadingChanged(isLoading: Boolean) {
        binding.swipeRefresh.isRefreshing = isLoading
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}