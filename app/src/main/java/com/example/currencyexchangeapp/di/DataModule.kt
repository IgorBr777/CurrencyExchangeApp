package com.example.currencyexchangeapp.di

import com.example.currencyexchangeapp.data.ApiServiceCurrency
import com.example.currencyexchangeapp.data.currencies.CurrencyExchangeRepositoryImpl
import com.example.currencyexchangeapp.domain.CurrencyExchangeRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    abstract fun bindCurrencyExchangeRepository(
        currencyExchangeRepositoryImpl: CurrencyExchangeRepositoryImpl
    ): CurrencyExchangeRepository

    companion object {
        private const val BASE_URL = "https://api.nbrb.by"

        @Provides
        fun provideApiService(retrofit: Retrofit): ApiServiceCurrency {
            return retrofit.create(ApiServiceCurrency::class.java)
        }

        @Provides
        fun provideRetrofitInstance(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }
}