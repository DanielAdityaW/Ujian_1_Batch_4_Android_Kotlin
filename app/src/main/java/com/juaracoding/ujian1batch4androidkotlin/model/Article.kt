package com.juaracoding.ujian1batch4androidkotlin

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Article (
    val imageResourceId: Int,
    val title: String,
    val overview: String,
    val description: String
) : Parcelable;