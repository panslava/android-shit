package com.example.vezdehodcharity

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.*
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_regular.*


class TargetActivityMore : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target_more)

        val moneyText = findViewById<EditText>(R.id.editTextMoney)
    }

    fun onSubmitClick(view: View) {
        val intent = Intent(this, RegularPreviewActivity::class.java)
        startActivity(intent)
    }

    fun back(view: View) {
        finish()
    }
}