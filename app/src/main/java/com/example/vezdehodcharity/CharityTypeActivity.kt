package com.example.vezdehodcharity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CharityTypeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        println("CharityType: onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_charity_type)
    }

    fun back(view: View) {
        println("CharityType: before finish")
        finish()
        println("CharityType: after finish")
    }

    fun toRegular(view: View) {
        val intent = Intent(this, RegularActivity::class.java)
        startActivity(intent)
    }

    fun toGoal(view: View) {
        var intent = Intent(this, AppFrameActivity::class.java)
        startActivity(intent);
    }
}