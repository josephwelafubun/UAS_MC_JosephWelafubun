package com.example.wisatamalukuproject18411052

import android.widget.ImageView

fun ImageView.loadImage(Url: String?) {
    val option = RequestOptions().placeholder(R.mipmap.ic_launcher)
        .error(R.mipmap.ic_launcher)
    Glide.with(context).setDefaultRequestOptions(option)
        .load(Url)
        .into(this)
}