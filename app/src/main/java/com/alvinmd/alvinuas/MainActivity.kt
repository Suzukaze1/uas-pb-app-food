package com.alvinmd.alvinuas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alvinmd.alvinuas.view.BurgerActivity
import com.alvinmd.alvinuas.view.PizzaActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linear_layout_01.setOnClickListener{
            val intent = Intent(this, BurgerActivity::class.java)
            startActivity(intent)
        }

        linear_layout_02.setOnClickListener{
            val intent = Intent(this, PizzaActivity::class.java)
            startActivity(intent)
        }
    }
}