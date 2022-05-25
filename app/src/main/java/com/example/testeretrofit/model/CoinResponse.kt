package com.example.testeretrofit.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CoinResponse(
    val coins: List<Coin>

) : Parcelable {
    constructor() : this(mutableListOf())
}
