package com.example.currencyexchangeapp.domain

import com.example.currencyexchangeapp.model.CurrencyModel
import javax.inject.Inject

class CurrencyExchangeInteractor @Inject constructor
    (private  val currencyExchangeRepository: CurrencyExchangeRepository) {

       suspend fun getCurrencies():List<CurrencyModel>{
           return currencyExchangeRepository.getCurrencies()
       }


}