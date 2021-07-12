package com.alvinmd.alvinuas.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvinmd.alvinuas.R
import com.alvinmd.alvinuas.adapter.BurgerAdapter
import com.alvinmd.alvinuas.listdata.ListDataBurger
import kotlinx.android.synthetic.main.activity_burger.*
import kotlinx.android.synthetic.main.rv_burger.*

class BurgerActivity : AppCompatActivity() {
    private lateinit var burgerAdapter: BurgerAdapter
    private lateinit var listDataBurger: ListDataBurger

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burger)

        listDataBurger = ListDataBurger()

        burgerAdapter = BurgerAdapter(listDataBurger.generateBurger)
        with(rv_burger){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = burgerAdapter
        }

        fav_tambah_burger.setOnClickListener {
            val intent = Intent(this, BurgerAddActivity::class.java)
            startActivity(intent)
        }

        rv_burger.setOnClickListener {
            val intent = Intent(this, EditBurgerActivity::class.java)
            startActivity(intent)
        }
    }
}