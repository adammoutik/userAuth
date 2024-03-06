package com.example.userauth.data

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.userauth.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = android.view.Gravity.CENTER

        val imageView = ImageView(this)
        imageView.setImageResource(R.drawable.ic_launcher_background)
        layout.addView(imageView)

        val username = intent.getStringExtra("username")

        val textViewWelcome = TextView(this)
        textViewWelcome.textSize = 20f
        textViewWelcome.text = "Bonjour $username"
        layout.addView(textViewWelcome)

        setContentView(layout)
    }
}

