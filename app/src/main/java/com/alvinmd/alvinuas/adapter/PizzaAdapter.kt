package com.alvinmd.alvinuas.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.alvinmd.alvinuas.R
import com.alvinmd.alvinuas.model.BurgerModel
import com.alvinmd.alvinuas.model.PizzaModel
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class PizzaAdapter(private val pizza: ArrayList<PizzaModel>): RecyclerView.Adapter<PizzaAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.rv_pizza, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = pizza[position]
        Glide.with(holder.itemView.context)
            .load(user.image)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = user.name
    }

    override fun getItemCount(): Int = pizza.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.konvensionall)
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgThumb02)

    }
}