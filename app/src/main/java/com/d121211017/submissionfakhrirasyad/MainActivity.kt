package com.d121211017.submissionfakhrirasyad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
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
    }

    private fun getCatBreedData() : ArrayList<Breed>{
        val breedName = resources.getStringArray(R.array.cat_breed_name)
        val breedSize = resources.getStringArray(R.array.cat_breed_size)
        val breedCoat = resources.getStringArray(R.array.cat_breed_coat)
        val breedColor = resources.getStringArray(R.array.cat_breed_color)
        val breedWeight = resources.getStringArray(R.array.cat_breed_weight)
        val breedPhoto = resources.getIntArray(R.array.cat_breed_photo)

        val catBreed = ArrayList<Breed>()

        for(i in breedName.indices){
            val breed = Breed(breedName[i], breedColor[i], breedWeight[i], breedSize[i], breedCoat[i], breedPhoto[i])
            catBreed.add(breed)
        }

        return catBreed
    }
}