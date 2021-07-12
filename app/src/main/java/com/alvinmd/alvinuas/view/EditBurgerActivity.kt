package com.alvinmd.alvinuas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.alvinmd.alvinuas.R
import kotlinx.android.synthetic.main.activity_edit_burger.*

class EditBurgerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_burger)

        btn_edit_burger.setOnClickListener {
            finish()
            Toast.makeText(this, "Berhasil Menambahkan Menu Burger", Toast.LENGTH_SHORT).show()
        }
    }
}