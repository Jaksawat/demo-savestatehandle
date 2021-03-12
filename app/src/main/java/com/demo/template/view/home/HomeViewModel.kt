package com.demo.template.view.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.demo.template.domain.BaseRepository


class HomeViewModel(
    private val savedStateHandle: SavedStateHandle,
    private val baseRepository: BaseRepository
) : ViewModel() {

    companion object {
        const val NAME_KEY = "NAME_KEY"
    }

    fun getName(): LiveData<String> {
        return savedStateHandle.getLiveData(NAME_KEY)
    }

    fun setName(name: String?) {
        savedStateHandle.set(NAME_KEY, name)
    }
}