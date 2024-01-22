package com.example.currencyexchangeapp.presentation.adapter

import androidx.recyclerview.widget.RecyclerView
import com.example.currencyexchangeapp.databinding.ItemExchangeRateBinding
import com.example.currencyexchangeapp.model.CurrencyModel
import com.example.currencyexchangeapp.presentation.adapter.listener.ExchangeRateBLRListener

class ExchangeRateBLRViewHolder(
    private val viewBinding: ItemExchangeRateBinding,
    private val exchangeRateBLRListener: ExchangeRateBLRListener

) : RecyclerView.ViewHolder(viewBinding.root) {

    fun bind(currencyModel: CurrencyModel) {
        viewBinding.nameCurrency.text = currencyModel.name
        viewBinding.officialRate.text = currencyModel.officialRate.toString()

//        itemView.setOnClickListener {
//            exchangeRateBLRListener.onButtonUpdateRate(
//              currencyModel.name,
//                currencyModel.officialRate
//            )
//        }
    }


}