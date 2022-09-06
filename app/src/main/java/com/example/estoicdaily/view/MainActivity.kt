package com.example.estoicdaily.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.estoicdaily.databinding.ActivityMainBinding
import com.example.estoicdaily.viewModel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer { quoteModel ->
            binding.tvQuote.text = quoteModel.quote
            binding.tvAuthor.text = quoteModel.author
        })

        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomQuote()
        }


    }
}