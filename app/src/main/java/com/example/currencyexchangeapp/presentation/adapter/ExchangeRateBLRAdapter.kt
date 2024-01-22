package com.example.currencyexchangeapp.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.currencyexchangeapp.databinding.ItemExchangeRateBinding
import com.example.currencyexchangeapp.model.CurrencyModel
import com.example.currencyexchangeapp.presentation.adapter.listener.ExchangeRateBLRListener

class ExchangeRateBLRAdapter (
    private  val exchangeRateBLRListener: ExchangeRateBLRListener):RecyclerView.Adapter<ExchangeRateBLRViewHolder>() {
        private var listCurrency = mutableListOf<CurrencyModel>()

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<CurrencyModel>) {
        this.listCurrency.clear()
        this.listCurrency = list.toMutableList()
        this.notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExchangeRateBLRViewHolder {
        val viewBinding = ItemExchangeRateBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false)
        return ExchangeRateBLRViewHolder(viewBinding, exchangeRateBLRListener)
    }

    override fun getItemCount(): Int {
      return  listCurrency.size
    }

    override fun onBindViewHolder(holder: ExchangeRateBLRViewHolder, position: Int) {
        holder.bind(listCurrency[position])
    }

}