package com.alan.jetpackcomposeinstagram

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.alan.jetpackcomposeinstagram.login.presentation.LoginScreen
import com.alan.jetpackcomposeinstagram.login.presentation.LoginViewModel
import com.alan.jetpackcomposeinstagram.ui.theme.JetpackComposeInstagramTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeInstagramTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginScreen(LoginViewModel())
                }
            }
        }
    }
}
