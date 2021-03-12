package com.demo.template.view.base

import android.os.Bundle
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

/**
 * @author Leopold
 */
abstract class BindingActivity<T : ViewDataBinding> : AppCompatActivity() {
    @LayoutRes
    abstract fun getLayoutResId(): Int

    lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, getLayoutResId())
    }

    protected fun addFragment(@IdRes containerViewId: Int, fragment: Fragment?) {
        fragment?.let {
            supportFragmentManager.beginTransaction()
                .add(containerViewId, fragment, fragment.javaClass.simpleName)
                .addToBackStack(null)
                .commitAllowingStateLoss()
        }
    }
}