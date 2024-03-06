// MainActivity.kt
package com.example.userauth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.userauth.ui.theme.UserAuthTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserAuthTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    LoginForm()
                }
            }
        }
    }
}

@Composable
fun LoginForm() {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(modifier = Modifier.fillMaxSize()) {
        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Username") },
            modifier = Modifier.padding(16.dp)
        )
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Password") },
            modifier = Modifier.padding(16.dp)
        )
        Button(
            onClick = { HandleLogin(username, password) },
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Login")
        }
    }
}

fun HandleLogin(username: String, password: String) {
    val predefinedUsername = "admin"
    val predefinedPassword = "password"

    if (username == predefinedUsername && password == predefinedPassword) {
        println("Login successful!")
    } else {
        println("Invalid credentials. Please try again.")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginForm() {
    UserAuthTheme {
        LoginForm()
    }
}
