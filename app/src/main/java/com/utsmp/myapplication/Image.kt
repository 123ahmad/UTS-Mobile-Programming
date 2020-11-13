package com.utsmp.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Image (
    val imageSrc : Int,
    val imageTitle: String,
    val imageDesc : String
) : Parcelable
