package com.example.testeretrofit.service

import com.example.testeretrofit.model.CoinResponse
import retrofit2.Call
import retrofit2.http.GET

interface CoinApiInterface {
    @GET("v1/exchanges?apikey=DA13ACA5-BA9A-426D-82B1-E359D401F78E")
    fun getCoinList(): Call<CoinResponse>
}
