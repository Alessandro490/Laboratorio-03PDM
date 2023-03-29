package com.example.laboratorio03rodriguez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var fiveCentsImageVIew: ImageView
    private lateinit var tenCentsImageView: ImageView
    private lateinit var quarterImageView: ImageView
    private lateinit var oneDollarImageView: ImageView
    private lateinit var cashTextView: TextView
    private var cash = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fiveCentsImageVIew = findViewById(R.id.FiveCentsImageView)
        tenCentsImageView = findViewById(R.id.TenCentsImageView)
        quarterImageView = findViewById(R.id.QuarterImageView)
        oneDollarImageView = findViewById(R.id.OneDollarImageView)

        cashTextView = findViewById(R.id.QuantitytextView)

        fiveCentsImageVIew.setOnClickListener{
            cash +=0.05
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        tenCentsImageView.setOnClickListener{
            cash +=0.10
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        quarterImageView.setOnClickListener{
            cash +=0.25
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }

        oneDollarImageView.setOnClickListener{
            cash +=1.00
            cash = String.format("%.2f", cash).toDouble()
            cashTextView.text = "$${cash}"
        }


    }
}