package com.example.a5monthhomework7

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a5monthhomework7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        addCase()

        minusCase()

        division()

        multiplication()
    }

    @SuppressLint("SetTextI18n")
    fun addCase()= with(binding){
     btnCalculate.setOnClickListener{
         val num1 = num1.text.toString()
         val num2 = num2.text.toString()
         tvResult.text = (num1.toInt() + num2.toInt()).toString()
     }

    }
    @SuppressLint("SetTextI18n")
    fun minusCase() = with(binding){
        btnMinus.setOnClickListener {
            val num1 = num1.text.toString()
            val num2 = num2.text.toString()
            tvResult.text = (num1.toInt() - num2.toInt()).toString()
        }
    }

    @SuppressLint("SetTextI18n")
    fun division() = with(binding){
        btnDivision.setOnClickListener{
            val num1 = num1.text.toString()
            val num2 = num2.text.toString()
            tvResult.text = (num1.toInt() / num2.toInt()).toString()
        }
    }
    @SuppressLint("SetTextI18n")
    fun multiplication() = with(binding){
        btnMultiplication.setOnClickListener{
            val num1 = num1.text.toString()
            val num2 = num2.text.toString()
            tvResult.text = (num1.toInt() * num2.toInt()).toString()
        }
    }
}