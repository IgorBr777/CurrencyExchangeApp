package com.example.currencyexchangeapp.domain

import com.example.currencyexchangeapp.model.CurrencyModel

interface CurrencyExchangeRepository {

    suspend fun getCurrencies(): List<CurrencyModel>


}