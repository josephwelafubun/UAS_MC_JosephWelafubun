package com.example.wisatamalukuproject18411052

import com.google.firebase.datbase.Exclude

data class Image(
    val imageSrc:String? = null,
    val imageTitle:String? = null,
    val imageDesc:String? = null,
    @get:Exclude
    @set:Exclude
    var key:String? = null

)