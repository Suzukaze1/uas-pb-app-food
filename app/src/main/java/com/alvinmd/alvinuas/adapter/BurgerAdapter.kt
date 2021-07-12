package com.alvinmd.alvinuas.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.alvinmd.alvinuas.R
import com.alvinmd.alvinuas.model.BurgerModel
import com.alvinmd.alvinuas.view.EditBurgerActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class BurgerAdapter(private val burger: ArrayList<BurgerModel>): RecyclerView.Adapter<BurgerAdapter.ViewHolder>() {

    private val mContext: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.rv_burger,
            parent,
            false
        )
//        val viewHolder: BurgerAdapter.ViewHolder = ViewHolder(view)
//        viewHolder.editBurger.setOnClickListener {
//            val intent = Intent(mContext, EditBurgerActivity::class.java)
//            mContext?.startActivity(intent)
//        }
//        viewHolder.deleteBurger.setOnClickListener {
//            Toast.makeText(mContext, "Berhasil Menghapus Menu Burger", Toast.LENGTH_SHORT).show()
//        }
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user = burger[position]
        Glide.with(holder.itemView.context)
            .load(user.image)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = user.name
    }

    override fun getItemCount(): Int = burger.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.konvensionall1)
        var imgPhoto: ImageView = itemView.findViewById(R.id.imgThumb021)
        var editBurger: Button = itemView.findViewById(R.id.btnEdit03)
        var deleteBurger: Button = itemView.findViewById(R.id.btnNonAktif03)
    }
}