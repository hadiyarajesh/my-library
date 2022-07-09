package com.hadiyarajesh.sampleproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hadiyarajesh.mylibrary.createToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        createToast(this, "Hello")
    }
}
