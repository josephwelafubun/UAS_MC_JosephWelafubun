package com.example.wisatamalukuproject18411052

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wisatamalukuproject18411052.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intss = intent
        val imageTitle = intss.getStringExtra("IMAGETITLE")
        val imageSrc = intss.getStringExtra("IMAGESRC")
        val imageDesc = intss.getStringExtra("IMAGEDESC")

        binding.imageTitle.text = imageTitle
        binding.imageDetail.loadImage(imageSrc)
        binding.imageDesc.text = imageDesc

    }
}