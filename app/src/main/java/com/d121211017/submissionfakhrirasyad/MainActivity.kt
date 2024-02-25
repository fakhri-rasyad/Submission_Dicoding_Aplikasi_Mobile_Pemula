package com.d121211017.submissionfakhrirasyad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.d121211017.submissionfakhrirasyad.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val catBreedList = ArrayList<Breed>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.recycleViewMain
        recyclerView.setHasFixedSize(true)

        catBreedList.addAll(getCatBreedData())
        showRecyclerView()
    }

    private fun getCatBreedData() : ArrayList<Breed>{
        val breedName = resources.getStringArray(R.array.cat_breed_name)
        val breedSize = resources.getStringArray(R.array.cat_breed_size)
        val breedCoat = resources.getStringArray(R.array.cat_breed_coat)
        val breedColor = resources.getStringArray(R.array.cat_breed_color)
        val breedWeight = resources.getStringArray(R.array.cat_breed_weight)
        val breedDesc = resources.getStringArray(R.array.cat_breed_desc)
        val breedPhoto = resources.obtainTypedArray(R.array.cat_breed_photo)
//        val breedPhoto = resources.getIntArray(R.array.cat_breed_photo)

        val catBreed = ArrayList<Breed>()

        for(i in breedName.indices){
            val breed = Breed(breedName[i], breedColor[i], breedWeight[i], breedSize[i], breedCoat[i], breedDesc[i], breedPhoto.getResourceId(i, 0))
            catBreed.add(breed)
        }
        return catBreed
    }

    private fun showRecyclerView(){
        recyclerView.layoutManager = LinearLayoutManager(this)
        val recyclerViewAdapter = BreedListAdapter(catBreedList)
        recyclerView.adapter = recyclerViewAdapter
    }
}