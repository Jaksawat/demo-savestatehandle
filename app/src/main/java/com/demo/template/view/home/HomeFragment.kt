package com.demo.template.view.home

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.lifecycle.Observer
import com.demo.template.R
import com.demo.template.databinding.FragmentHomeBinding
import com.demo.template.view.base.BindingFragment
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.androidx.viewmodel.scope.emptyState


class HomeFragment : BindingFragment<FragmentHomeBinding>() {
    override fun getLayoutResId() = R.layout.fragment_home
    companion object {
        fun newInstance() = HomeFragment()
    }

    private val viewModel: HomeViewModel by viewModel(state = emptyState())

    @SuppressLint("SetTextI18n")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding.model = viewModel
        binding.lifecycleOwner = this
        binding.model!!.getName().observe(viewLifecycleOwner, Observer { name ->
            binding.savedVmTv.text = "Output Text : $name"
        })
        initSaveBtn()
    }

    private fun initSaveBtn() {
        binding.saveBt.setOnClickListener {
            binding.model!!.setName(binding.nameEt.text.toString())
        }
    }

}
