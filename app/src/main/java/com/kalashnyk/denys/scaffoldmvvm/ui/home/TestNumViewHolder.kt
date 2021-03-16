package com.kalashnyk.denys.scaffoldmvvm.ui.home

import com.kalashnyk.denys.scaffoldmvvm.databinding.ItemNumberSampleBinding

class TestNumViewHolder(binding: ItemNumberSampleBinding) : HomeViewHolder(binding) {

    override fun bind(item: Any) {
        with(binding as ItemNumberSampleBinding) {
            tvNum.text = item.toString()
        }
    }
}