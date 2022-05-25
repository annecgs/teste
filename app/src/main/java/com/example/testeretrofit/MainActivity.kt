package com.example.testeretrofit

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.testeretrofit.model.Coin
import com.example.testeretrofit.model.CoinResponse
import com.example.testeretrofit.service.CoinApiInterface
import com.example.testeretrofit.service.CoinApiServer
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_movie_list.layoutManager = LinearLayoutManager(this)
        rv_movie_list.setHasFixedSize(true)
        getCoinData { coin: List<Coin> ->
            rv_movie_list.adapter = CoinAdapter(coin)
        }
    }

    private fun getCoinData(callback: (List<Coin>) -> Unit) {
        val apiServer = CoinApiServer.getInstance().create(CoinApiInterface::class.java)
        apiServer.getCoinList().enqueue(object : Callback<CoinResponse> {
            override fun onResponse(
                call: Call<CoinResponse>,
                response: Response<CoinResponse>,
            ) {
                return callback(response.body()!!.coins)
            }

            override fun onFailure(call: Call<CoinResponse>, t: Throwable) {
            }
        })
    }
}
