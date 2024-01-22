package com.example.currencyexchangeapp.data.currencies

import com.example.currencyexchangeapp.data.ApiServiceCurrency
import com.example.currencyexchangeapp.domain.CurrencyExchangeRepository
import com.example.currencyexchangeapp.model.CurrencyModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class CurrencyExchangeRepositoryImpl @Inject constructor(
    private val apiServiceCurrency:ApiServiceCurrency
):CurrencyExchangeRepository {
    override suspend fun getCurrencies():List<CurrencyModel> {
        return withContext(Dispatchers.IO){
            val currencyResponse =apiServiceCurrency.getCurrency(1)
            currencyResponse.body()?.currencyList?.let {
                it.map {
                    CurrencyModel(
                        it.id,
                        it.date,
                        it.name,
                        it.officialRate
                    )
                }
            }
        } ?:kotlin.run {
            emptyList()
        }

    }
}