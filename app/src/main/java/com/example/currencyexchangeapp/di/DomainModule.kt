package com.example.currencyexchangeapp.di

import com.example.currencyexchangeapp.domain.CurrencyExchangeInteractor
import com.example.currencyexchangeapp.domain.CurrencyExchangeRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class DomainModule {
    @Provides
    fun provideCurrencyExchangeInteractor(
        currencyExchangeRepository: CurrencyExchangeRepository
    ):CurrencyExchangeInteractor{
        return CurrencyExchangeInteractor(currencyExchangeRepository)
    }
}