package com.caugedang.listapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class listBuahAdapter(private val listBuah: ArrayList<buah>) : RecyclerView.Adapter<listBuahAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(
        onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.list_buah, viewGroup, false)
        return ListViewHolder(view)
    }
    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val buah = listBuah[position]

        Glide.with(holder.itemView.context)
            .load(buah.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)

        holder.namaBuah.text = buah.nama_buah
        holder.detailBuah.text = buah.detail_buah

        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, "Kamu memilih " + listBuah[position].nama_buah, Toast.LENGTH_SHORT).show()

            if(::onItemClickCallback.isInitialized) {

                onItemClickCallback
                    .onItemClick(listBuah[position])

            }
        }
    }


    override fun getItemCount(): Int {
        return listBuah.size
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var namaBuah: TextView = itemView.findViewById(R.id.nama_buah)
        var detailBuah: TextView = itemView.findViewById(R.id.detail_buah)
        var imgPhoto: ImageView = itemView.findViewById(R.id.gambar_buah)
    }
    interface OnItemClickCallback {
        fun onItemClick(data: buah)
    }

}


