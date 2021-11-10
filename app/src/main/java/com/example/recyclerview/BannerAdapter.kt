package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R.layout.kiska_list_card

class BannerAdapter(private  val bannerList: List<Banner>):RecyclerView.Adapter <BannerViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {

       val bannerView = LayoutInflater.from(parent.context)
           .inflate(kiska_list_card, parent,false)
        return BannerViewHolder(bannerView)
    }

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) {
       val banner = bannerList[position]
        holder.bind((banner))

    }

    override fun getItemCount(): Int {
        return bannerList.size


    }
}