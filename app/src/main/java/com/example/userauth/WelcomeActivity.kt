// WelcomeActivity.kt
package com.example.userauth.data

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.userauth.R
import com.example.userauth.ui.theme.UserAuthTheme

class WelcomeActivity : AppCompatActivity() {
    companion object {
        var username: String = ""
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UserAuthTheme {
                WelcomeScreen()
            }
        }
    }
}

@Composable
fun WelcomeScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 16.dp),
            contentScale = androidx.compose.ui.layout.ContentScale.FillBounds,
            alignment = Alignment.Center,
        )
        Text("Welcome, ${WelcomeActivity.username}!", modifier = Modifier.padding(16.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    UserAuthTheme {
        WelcomeScreen()
    }
}
