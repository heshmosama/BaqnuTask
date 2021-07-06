package com.example.banquemisrtask.core.di

import com.example.banquemisrtask.domain.repositories.MainRepo
import com.example.banquemisrtask.domain.usecases.MainUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object UseCaseModule {
    @Singleton
    @Provides
    fun getMainUseCase(mainRepo: MainRepo) : MainUseCase = MainUseCase(mainRepo)
}