package com.example.vezdehodcharity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Main: onCreate")
    }

    fun startCharity(view: View) {
        println("Main: before startCharity")
        val intent = Intent(this, CharityTypeActivity::class.java)
        startActivity(intent)
        println("Main: after startCharity")
    }


}