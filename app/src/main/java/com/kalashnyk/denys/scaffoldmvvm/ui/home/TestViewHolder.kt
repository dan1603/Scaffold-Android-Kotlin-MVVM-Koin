package com.kalashnyk.denys.scaffoldmvvm.ui.home

import com.kalashnyk.denys.scaffoldmvvm.databinding.ItemSampleBinding

class TestViewHolder(binding: ItemSampleBinding): HomeViewHolder(binding) {

    override fun bind(item: Any) {
        with(binding as ItemSampleBinding) {
            tvStr.text = item.toString()
        }
    }

}