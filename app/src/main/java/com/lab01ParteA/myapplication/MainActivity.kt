package com.lab01ParteA.myapplication

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Variable para la imagen principal
    private lateinit var mainImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Referencia a la imagen principal
        mainImageView = findViewById(R.id.mainImage)

        // Asignar los listeners a las imágenes pequeñas
        setUpImageListeners()
    }

    // Método para configurar los listeners de clic en las imágenes pequeñas
    private fun setUpImageListeners() {
        val imageViews = listOf(
            findViewById<ImageView>(R.id.image1),
            findViewById<ImageView>(R.id.image2),
            findViewById<ImageView>(R.id.image3),
            findViewById<ImageView>(R.id.image4),
            findViewById<ImageView>(R.id.image5),
            findViewById<ImageView>(R.id.image6)
        )

        for (imageView in imageViews) {
            imageView.setOnClickListener {
                // Al hacer clic en una imagen pequeña, cambiar la imagen principal
                mainImageView.setImageDrawable(imageView.drawable)
            }
        }
    }
}
