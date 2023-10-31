package com.example.glide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)
        val defaultImage=R.drawable.ic_launcher_foreground
        val errorImage= R.drawable.ic_launcher_background
        val url="https://th.bing.com/th/id/R.7b5f920b2e43bc0fe5ac21d9985d77b2?rik=y9Bo4EqQovA%2b7A&riu=http%3a%2f%2fpic.filecast.co.kr%2f7b%2f5f%2f7b5f920b2e43bc0fe5ac21d9985d77b2.jpg&ehk=lAFl8vjfqJkvgDRaVmMxAuQY0VRghdGlgT0CPoxTlDI%3d&risl=&pid=ImgRaw&r=0"
        Glide.with(this)
            .load(url)
            .placeholder(defaultImage)
            .error(errorImage)
            .fallback(defaultImage)
            .circleCrop()
            .into(imageView)
    }
}