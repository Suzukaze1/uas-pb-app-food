package com.alvinmd.alvinuas.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.alvinmd.alvinuas.R
import com.alvinmd.alvinuas.adapter.PizzaAdapter
import com.alvinmd.alvinuas.listdata.ListDataPizza
import kotlinx.android.synthetic.main.activity_pizza.*

class PizzaActivity : AppCompatActivity() {
    private lateinit var pizzaAdapter: PizzaAdapter
    private lateinit var listDataPizza: ListDataPizza

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        listDataPizza = ListDataPizza()

        pizzaAdapter = PizzaAdapter(listDataPizza.generatePizza)
        with(rv_pizza){
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = pizzaAdapter
        }
    }
}