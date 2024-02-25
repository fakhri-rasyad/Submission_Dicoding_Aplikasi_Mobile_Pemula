package com.d121211017.submissionfakhrirasyad

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BreedListAdapter(private val breedList : ArrayList<Breed>) : RecyclerView.Adapter<BreedListAdapter.ListViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ) : ListViewHolder {
            val view : View = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val breed : Breed = breedList[position]
        holder.breedName.text = breed.name
        holder.breedDesc.text = breed.desc
        println("Contoh: " + breed.photo)
        holder.breedPhoto.setImageResource(breed.photo)
    }

    override fun getItemCount(): Int {
        return breedList.size
    }

    class ListViewHolder(item: View) : RecyclerView.ViewHolder(item){
        val breedPhoto : ImageView = item.findViewById(R.id.breed_photo)
        val breedName: TextView = item.findViewById(R.id.item_breed_name)
        val breedDesc : TextView = item.findViewById(R.id.item_breed_desc)
    }
}