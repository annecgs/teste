package com.example.testeretrofit

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testeretrofit.model.Coin
import kotlinx.android.synthetic.main.coin_item.view.*

class CoinAdapter(
    private val coins: List<Coin>
) : RecyclerView.Adapter<CoinAdapter.CoinViewHolder>() {
    class CoinViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bindCoin(coin: Coin) {
            itemView.id_moeda.text = coin.asset_id
            itemView.nome_moeda.text = coin.name
            itemView.preco_moeda.text = coin.price_usd.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        TODO("Not yet implemented")
        return CoinViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.coin_item, parent, false)
        )
    }

    override fun getItemCount(): Int = coins.size

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        TODO("Not yet implemented")
        holder.bindCoin(coins.get(position))
    }
}
