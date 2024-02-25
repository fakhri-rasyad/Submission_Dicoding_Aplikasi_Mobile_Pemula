package com.d121211017.submissionfakhrirasyad

import android.os.Parcelable
import androidx.annotation.DrawableRes
import kotlinx.parcelize.Parcelize

@Parcelize
data class Breed(
    val name: String,
    val color: String,
    val weight: String,
    val size: String,
    val coat: String,
    val desc: String,
    @DrawableRes
    val photo: Int,
) : Parcelable
