package com.example.userauth.data

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.MATCH_PARENT,
            LinearLayout.LayoutParams.MATCH_PARENT
        )
        layout.orientation = LinearLayout.VERTICAL
        layout.setPadding(16, 16, 16, 16)

        val editTextUsername = EditText(this)
        editTextUsername.hint = "Username"
        layout.addView(editTextUsername)

        val editTextPassword = EditText(this)
        editTextPassword.hint = "Password"
        layout.addView(editTextPassword)

        val buttonLogin = Button(this)
        buttonLogin.text = "Login"
        buttonLogin.setOnClickListener {
            val username = editTextUsername.text.toString()
            val password = editTextPassword.text.toString()

            if (username == "admin" && password == "password") {
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("username", username)
                startActivity(intent)
                finish()
            }
        }
        layout.addView(buttonLogin)

        setContentView(layout)
    }
}
