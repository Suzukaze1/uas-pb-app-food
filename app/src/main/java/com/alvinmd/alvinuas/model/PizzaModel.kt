package com.alvinmd.alvinuas.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PizzaModel (
    val image: Int?,
    val name: String?,
): Parcelable