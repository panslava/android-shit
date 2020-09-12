package com.example.vezdehodcharity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AppFrameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        println("AppFrameType: onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app_frame)
    }
}