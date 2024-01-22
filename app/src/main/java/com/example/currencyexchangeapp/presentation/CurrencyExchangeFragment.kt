package com.example.currencyexchangeapp.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.currencyexchangeapp.R
import com.example.currencyexchangeapp.databinding.FragmentCurrencyExchangeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CurrencyExchangeFragment : Fragment() {
    private var _viewBinding: FragmentCurrencyExchangeBinding? = null
    private val viewBinding get() = _viewBinding!!
    private val viewModel: CurrencyExchangeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _viewBinding = FragmentCurrencyExchangeBinding.inflate(inflater)
        return viewBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding.btnRates.setOnClickListener{
            viewModel.getCurrencies()
           findNavController().navigate(R.id.action_currencyExchangeFragment_to_exchangeRateBLRFragment)

        }

    }
}