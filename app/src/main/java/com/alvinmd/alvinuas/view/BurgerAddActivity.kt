package com.alvinmd.alvinuas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.alvinmd.alvinuas.R
import kotlinx.android.synthetic.main.activity_burger_add.*

class BurgerAddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger_add)

        btn_save_burger.setOnClickListener {
            finish()
            Toast.makeText(this, "Berhasil Menambahkan Menu Burger", Toast.LENGTH_SHORT).show()
        }
    }
}