package com.demo.template.view.home

import android.annotation.SuppressLint
import android.os.Bundle
import com.demo.template.R
import com.demo.template.databinding.FragmentHomeBinding
import com.demo.template.view.base.BindingFragment


class HomeFragment2 : BindingFragment<FragmentHomeBinding>() {
    override fun getLayoutResId() = R.layout.fragment_home

    @SuppressLint("SetTextI18n")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (savedInstanceState != null){
            val txt = savedInstanceState.getString("KEY")
            binding.savedVmTv.text = "Output Text : $txt"
        }
        initSaveBtn()
    }

    @SuppressLint("SetTextI18n")
    private fun initSaveBtn() {
        binding.saveBt.setOnClickListener {
            val txt = binding.nameEt.text.toString()
            binding.savedVmTv.text = "Output Text : $txt"
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("KEY",binding.nameEt.text.toString())
    }

}
