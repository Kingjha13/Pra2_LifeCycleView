package com.example.lifecycleview

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class Tryed : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ava{
                finish()
            }
        }
    }
}

@Composable
fun Ava(onBack:()->Unit){
    Column(modifier = Modifier.padding(top = 30.dp)){
        Text(text = "avanish", modifier = Modifier.padding(top = 30.dp))
        Button(onClick = onBack) {
            Text(text = "Back")
        }
    }

}