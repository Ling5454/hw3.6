package com.example.hw36

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw36.databinding.FragmentTextBinding


class TextFragment : Fragment() {


    class TextFragment : Fragment() {
        private lateinit var binding: FragmentTextBinding
        private lateinit var textList: ArrayList<String>
        private lateinit var Tadapter: TextAdapter

        override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View? {
            binding = FragmentTextBinding.inflate(inflater, container, false)
            return binding.root
        }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            loadData()
            Tadapter = TextAdapter(textList)
            binding.rvText.adapter = Tadapter
        }

        private fun loadData() {
            textList = ArrayList()
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
            textList.add("text")
        }
    }
}