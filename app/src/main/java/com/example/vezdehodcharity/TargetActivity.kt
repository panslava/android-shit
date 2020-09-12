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


class TargetActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

    }

    companion object {
        //image pick code
        private val IMAGE_PICK_CODE = 1000;

        //Permission code
        private val PERMISSION_CODE = 1001;
    }

    private fun launchImagePicker() {
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(
            Intent.createChooser(intent, "Select an image"),
            IMAGE_PICK_CODE
        )
    }

    private fun onImageSelectorClick() {
        if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) ==
            PackageManager.PERMISSION_DENIED
        ) {
            //permission denied
            val permissions = arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE);
            //show popup to request runtime permission
            requestPermissions(permissions, PERMISSION_CODE);
        } else {
            //permission already granted
            launchImagePicker();
        }
    }

    fun onRemoveImageClick(view: View) {
        imageView10.setImageDrawable(null)
        textView7.visibility = View.VISIBLE
        imageView8.visibility = View.VISIBLE
        imageView11.visibility = View.INVISIBLE

        val img = findViewById<ImageView>(R.id.imageView10);
        imageView10.setBackgroundResource(R.drawable.dotted_image_upload)
        imageView10.setOnClickListener{onImageSelectorClick()}
    }

    fun onSubmitClick(view: View) {
        if (editTextTextPersonName.text.isNotEmpty() && editTextMoney.text.isNotEmpty() && editTextTextPersonName6.text.isNotEmpty() &&
            editTextDescription.text.isNotEmpty()) {
            val intent = Intent(this, RegularPreviewActivity::class.java)
            startActivity(intent)
        }
    }

    fun getRoundedCornerImage(bitmap: Bitmap): Bitmap? {
        val output = Bitmap.createBitmap(
            bitmap.width,
            bitmap.height, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(output)
        val color = -0xbdbdbe
        val paint = Paint()
        val rect = Rect(0, 0, bitmap.width, bitmap.height)
        val rectF = RectF(rect)
        val roundPx = 100f
        paint.setAntiAlias(true)
        canvas.drawARGB(0, 0, 0, 0)
        paint.setColor(color)
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint)
        paint.setXfermode(PorterDuffXfermode(PorterDuff.Mode.SRC_IN))
        canvas.drawBitmap(bitmap, rect, rect, paint)
        return output
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (resultCode == Activity.RESULT_OK && requestCode == IMAGE_PICK_CODE) {
            imageView10.setImageURI(data?.data)
            textView7.visibility = View.INVISIBLE
            imageView8.visibility = View.INVISIBLE
            imageView11.visibility = View.VISIBLE

            val img = findViewById<ImageView>(R.id.imageView10);
            imageView10.setBackgroundResource(R.drawable.corner_image)
            imageView10.setOnClickListener{}
        }
    }


    fun back(view: View) {
        finish()
    }
}