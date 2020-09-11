package com.example.vezdehodcharity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegularActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regular)
        println("RegularActivity: onCreate")
    }

    fun back(view: View) {
        println("CharityType: before finish")
        finish()
        println("CharityType: after finish")
    }
}