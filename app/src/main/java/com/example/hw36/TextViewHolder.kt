package com.example.hw36

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hw36.databinding.ItemTextBinding

class TextViewHolder(var binding: ItemTextBinding): ViewHolder(binding.root) {

    fun bind(item: String){
        binding.tvText.text = item

    }
}