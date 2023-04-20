package com.example.utspember

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(private val Dataml: ArrayList<DataML>, private val context: Context
): RecyclerView.Adapter<Adapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.layout,
            parent, false
        )
        return CourseViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: Adapter.CourseViewHolder, position: Int) {
        holder.nama.text = Dataml.get(position).nama
        holder.nim.text = Dataml.get(position).nim
        holder.umur.text = Dataml.get(position).umur
        holder.foto.setImageResource(Dataml.get(position).gambar)
    }
    override fun getItemCount(): Int {
        return Dataml.size
    }
    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.idfoto)
        val nama: TextView = itemView.findViewById(R.id.idnama)
        val nim: TextView = itemView.findViewById(R.id.idnim)
        val umur: TextView = itemView.findViewById(R.id.idumur)
    }
}