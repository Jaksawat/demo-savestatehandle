package com.demo.template.view.main

import android.os.Bundle
import com.demo.template.R
import com.demo.template.databinding.ActivityMainBinding
import com.demo.template.view.base.BindingActivity
import com.demo.template.view.home.HomeFragment

class MainActivity : BindingActivity<ActivityMainBinding>() {
    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addFragment(R.id.activity_container, HomeFragment.newInstance())
    }
}
