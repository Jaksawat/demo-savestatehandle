package com.wiwat.template.view.home

import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import com.wiwat.template.R
import com.wiwat.template.databinding.FragmentHomeBinding
import com.wiwat.template.view.base.BindingFragment
import com.wiwat.template.view.base.DataLoaded
import com.wiwat.template.view.base.Failed
import com.wiwat.template.view.base.Loading
import org.koin.androidx.viewmodel.ext.android.getViewModel


class HomeFragment : BindingFragment<FragmentHomeBinding>() {
    override fun getLayoutResId(): Int {
        return R.layout.fragment_home
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.model = getViewModel()
        binding.lifecycleOwner = this
        binding.model!!.states.observe(this, Observer { state ->
            when (state) {
                is Loading -> showLoading()
                is DataLoaded -> showData(state.list)
                is Failed -> showError(state.error)
            }
        })
    }

    private fun showLoading() {

    }

    private fun showData(list: Any) {

    }

    private fun showError(error: Throwable) {

    }


}
