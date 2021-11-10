package com.example.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BannerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
           fun bind(banner: Banner) {
               val bannerImageView: ImageView = itemView.findViewById(R.id.banner_view)
               val bannerDescriptionTextView: TextView = itemView.findViewById(R.id.description)

              bannerImageView.setImageDrawable(itemView.context.getDrawable(banner.resursImage))
               bannerDescriptionTextView.text = banner.discription
           }

}