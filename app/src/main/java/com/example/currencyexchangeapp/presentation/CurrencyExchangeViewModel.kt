package com.example.currencyexchangeapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.currencyexchangeapp.domain.CurrencyExchangeInteractor
import com.example.currencyexchangeapp.model.CurrencyModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CurrencyExchangeViewModel @Inject constructor(
    private  val currencyExchangeInteractor: CurrencyExchangeInteractor
):ViewModel() {

    private val _currencies = MutableLiveData<List<CurrencyModel>>()
    val currencies: LiveData<List<CurrencyModel>> = _currencies

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> = _error
    fun getCurrencies(){
        viewModelScope.launch {
            try {
          val currencies= currencyExchangeInteractor.getCurrencies()
                _currencies.value=currencies
            }
            catch (e: Exception) {
                _error.value = e.message.toString()
            }
        }

    }

}