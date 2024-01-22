package com.example.currencyexchangeapp.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.currencyexchangeapp.databinding.FragmentExchangeRateBLRBinding
import com.example.currencyexchangeapp.presentation.adapter.ExchangeRateBLRAdapter
import com.example.currencyexchangeapp.presentation.adapter.listener.ExchangeRateBLRListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExchangeRateBLRFragment : Fragment(), ExchangeRateBLRListener {
    private var _viewBinding: FragmentExchangeRateBLRBinding? = null
    private val viewBinding get() = _viewBinding!!
    private lateinit var exchangeRateBLRAdapter: ExchangeRateBLRAdapter
    private val viewModel: CurrencyExchangeViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewBinding = FragmentExchangeRateBLRBinding.inflate(inflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        exchangeRateBLRAdapter = ExchangeRateBLRAdapter(this)
        viewBinding.recyclerView.layoutManager = LinearLayoutManager(context)
        viewBinding.recyclerView.adapter = exchangeRateBLRAdapter
        viewModel.currencies.observe(viewLifecycleOwner) { currencyList ->
            exchangeRateBLRAdapter.submitList(currencyList)

        }

    }

//    override fun onButtonUpdateRate(name: String, officialRate: Double) {
//        TODO("Not yet implemented")
//    }
}