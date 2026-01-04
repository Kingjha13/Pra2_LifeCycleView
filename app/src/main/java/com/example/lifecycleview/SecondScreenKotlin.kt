package com.example.lifecycleview

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

class SecondScreenKotlin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContent {
            SecondScreen{
                finish()
            }
        }
    }
}

@Composable
fun SecondScreen(onBack:()->Unit){
    Button(onClick = onBack) {
        Text(text = "Back Button")
    }

}