package com.example.currencyexchangeapp.data.model

import com.google.gson.annotations.SerializedName
import java.util.Currency

data class CurrencyResponse(
    @SerializedName("currency")
    val currencyList: List<com.example.currencyexchangeapp.data.model.Currency>

)

data class Currency (
    @SerializedName("Cur_ID")
    val id:Int,
    @SerializedName("Date" )
    val date:String,
    @SerializedName("Cur_Name")
    val name: String,
    @SerializedName("Cur_OfficialRate")
    val officialRate:Double

)
