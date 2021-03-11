package com.wiwat.template.view.main

import android.os.Bundle
import com.wiwat.template.R
import com.wiwat.template.databinding.ActivityMainBinding
import com.wiwat.template.view.base.BindingActivity
import com.wiwat.template.view.home.HomeFragment

class MainActivity : BindingActivity<ActivityMainBinding>() {
    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportFragmentManager.beginTransaction().replace(
            R.id.container,
            HomeFragment()
        ).commit()
    }
}
