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
        setContentView(R.layout.activity_regular)

        val moneyText = findViewById<EditText>(R.id.editTextMoney)
    }

    fun onSubmitClick(view: View) {
        if (editTextTextPersonName.text.isNotEmpty() && editTextMoney.text.isNotEmpty() && editTextTextPersonName6.text.isNotEmpty() &&
            editTextDescription.text.isNotEmpty()) {
            val intent = Intent(this, RegularPreviewActivity::class.java)
            startActivity(intent)
        }
    }

    fun back(view: View) {
        finish()
    }
}