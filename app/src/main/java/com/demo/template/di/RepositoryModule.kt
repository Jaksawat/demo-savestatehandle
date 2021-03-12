package com.demo.template.di

import com.demo.template.domain.BaseRepository
import com.demo.template.domain.BaseRepositoryImpl
import org.koin.dsl.module


val repositoryModule = module {
    //Base Repository
    single<BaseRepository>(createdAtStart = true) { BaseRepositoryImpl() }
}