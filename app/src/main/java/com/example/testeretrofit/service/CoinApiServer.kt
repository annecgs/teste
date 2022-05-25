package com.example.testeretrofit.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CoinApiServer {
    companion object {
        private const val BASE_URL = "https://rest.coinapi.io/"
        private var retrofit: Retrofit? = null

        fun getInstance(): Retrofit {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit!!
        }
    }
}
