package com.example.exams

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_basket.*
import kotlinx.android.synthetic.main.activity_first_photo.imageButton
import kotlinx.android.synthetic.main.activity_main.*

class Basket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket)
        init()
    }


    private fun init() {

        checkOutButtonBasket.setOnClickListener {
            val intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        loginin_basket.setOnClickListener {
            val intent = Intent(this, aythentication::class.java)
            startActivity(intent)
        }
        settingButton_basket.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
        checkOutButtonBasket.setOnClickListener {
            val intent = Intent(this, Basket::class.java)
            startActivity(intent)
        }
        imageButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        plusRamen.setOnClickListener(){
            numberRamen.text = (numberRamen.text.toString().toInt() + 1).toString()
            count()
        }
        minusRamen.setOnClickListener() {
            if (numberRamen.text.toString().toInt() > 0) {
                numberRamen.text = (numberRamen.text.toString().toInt() - 1).toString()
                count()
            }
        }

        plusSushi.setOnClickListener(){
            numberSushi.text = (numberSushi.text.toString().toInt() + 1).toString()
            count()
        }
        minusSushi.setOnClickListener() {
            if (numberSushi.text.toString().toInt() > 0) {
                numberSushi.text = (numberSushi.text.toString().toInt() - 1).toString()
                count()
            }
        }

        plusYakitori.setOnClickListener(){
            numberYakitori.text = (numberYakitori.text.toString().toInt() + 1).toString()
            count()
        }
        minusYakitori.setOnClickListener() {
            if (numberYakitori.text.toString().toInt() > 0) {
                numberYakitori.text = (numberYakitori.text.toString().toInt() - 1).toString()
                count()
            }
        }

        plusTofu.setOnClickListener(){
            numberTofu.text = (numberTofu.text.toString().toInt() + 1).toString()
            count()
        }
        minusTofu.setOnClickListener() {
            if (numberTofu.text.toString().toInt() > 0) {
                numberTofu.text = (numberTofu.text.toString().toInt() - 1).toString()
                count()
            }
        }
    }
    private fun count(){
        val numSushi = numberSushi.text.toString().toInt()
        val costSushi = priceSushi.text.toString().toInt()

        val numRamen = numberRamen.text.toString().toInt()
        val costRamen = priceRamen.text.toString().toInt()

        val numYakitori = numberYakitori.text.toString().toInt()
        val costYakitori = priceYakitori.text.toString().toInt()

        val numTofu = numberTofu.text.toString().toInt()
        val costTofu = priceTofu.text.toString().toInt()

        totalCost.text = (numRamen*costRamen + numSushi*costSushi + numYakitori*costYakitori
                + numTofu*costTofu).toString()
    }
}
