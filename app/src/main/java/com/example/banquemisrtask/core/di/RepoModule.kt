package com.example.banquemisrtask.core.di

import com.example.banquemisrtask.data.datasource.remotedatasource.NetworkService
import com.example.banquemisrtask.data.repositories.MainRepoImpl
import com.example.banquemisrtask.domain.repositories.MainRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepoModule {
    @Singleton
    @Provides
    fun getMainRepo(networkService: NetworkService) : MainRepo = MainRepoImpl(networkService)
}