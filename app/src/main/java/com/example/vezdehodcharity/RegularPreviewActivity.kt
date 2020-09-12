package com.example.vezdehodcharity

import android.content.Intent
import android.graphics.*
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_regular.*

class RegularPreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regular_preview)
    }

    fun onSubmitClick(view: View) {
        val intent = Intent(this, AppFrameActivity::class.java)
        startActivity(intent)
    }


    fun back(view: View) {
        finish()
    }
}