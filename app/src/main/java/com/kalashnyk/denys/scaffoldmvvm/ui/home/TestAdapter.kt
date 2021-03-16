package com.kalashnyk.denys.scaffoldmvvm.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.kalashnyk.denys.scaffoldmvvm.base.BaseAdapter
import com.kalashnyk.denys.scaffoldmvvm.databinding.ItemNumberSampleBinding
import com.kalashnyk.denys.scaffoldmvvm.databinding.ItemSampleBinding

class TestAdapter: BaseAdapter<HomeViewHolder, Any>() {

    companion object {
        private const val TYPE_STR = 0
        private const val TYPE_INT = 1
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeViewHolder {
        return when(viewType) {
            TYPE_STR -> {
                TestViewHolder(ItemSampleBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
            else -> {
                TestNumViewHolder(ItemNumberSampleBinding.inflate(LayoutInflater.from(parent.context), parent, false))
            }
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is String -> TYPE_STR
            else -> TYPE_INT
        }
    }
}