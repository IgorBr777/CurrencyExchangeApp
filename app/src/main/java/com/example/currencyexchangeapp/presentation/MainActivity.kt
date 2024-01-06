package com.example.currencyexchangeapp.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.currencyexchangeapp.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.activity_container, CurrencyExchangeFragment())
        fragmentTransaction.commit()

    }
}