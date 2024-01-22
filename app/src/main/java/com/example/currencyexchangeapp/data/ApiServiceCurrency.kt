package com.example.currencyexchangeapp.data

import com.example.currencyexchangeapp.data.model.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiServiceCurrency {
    @GET("exrates/rates[/{cur_id}]")
    suspend fun getCurrency(@Path("cur_id") id:Int):Response <CurrencyResponse>
}