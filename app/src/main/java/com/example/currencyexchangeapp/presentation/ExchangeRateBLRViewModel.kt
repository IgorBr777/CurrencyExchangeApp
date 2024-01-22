package com.example.currencyexchangeapp.presentation

import androidx.lifecycle.ViewModel
import com.example.currencyexchangeapp.domain.CurrencyExchangeInteractor
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ExchangeRateBLRViewModel @Inject constructor
    ( private  val currencyExchangeInteractor: CurrencyExchangeInteractor
): ViewModel() {
}