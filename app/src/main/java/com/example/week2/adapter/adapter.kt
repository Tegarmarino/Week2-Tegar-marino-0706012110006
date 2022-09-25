package com.example.week2.adapter

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.example.week2.R
import com.example.week2.`interface`.cardListener
import com.example.week2.model.models
import com.example.week2.databinding.ActivityItemsBinding

class recycleAdapter (val listAnimals : ArrayList<models> , val cardListener: cardListener) :
    RecyclerView.Adapter<recycleAdapter.viewHolder>(){

    class viewHolder(val itemView: View , val cardListener: cardListener) :
        RecyclerView.ViewHolder(itemView){

        val binding = ActivityItemsBinding.bind(itemView)

        fun setData(models: models){
            binding.animalName.text = models.name
//            if(models.imageUri.isNotEmpty()){
//                binding.itemImage.setImageURI(Uri.parse(models.imageUri))
//            }
            itemView.setOnClickListener{
                cardListener.onClickListener(adapterPosition)
            }
        }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.activity_items , parent , false)
        return viewHolder(view , cardListener)
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        holder.setData(listAnimals[position])
    }

    override fun getItemCount(): Int {
        return listAnimals.size
    }
}