package com.example.lifecycleview

import android.R
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lifecycleview.ui.theme.LifeCycleViewTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FirstScreen()
        }
    }
}

@Composable
fun FirstScreen(){
    val context= LocalContext.current
    Column (modifier = Modifier.padding(top = 20.dp)){
        Text(text = "Android Activity Lifecycle")
        Text(text = "Activity Lifecycle Methods")
        Text(text = "onCreate()")
        Text(text = "onStart()")
        Text(text = "onResume()")
        Text(text="onPause")
        Text(text = "onStop()")
        Text(text = "onRestart()")
        Text(text = "onDestroy()")
        Button(onClick = {val intent= Intent(context, SecondScreenKotlin::class.java)
        context.startActivity(intent)}) {
            Text(text = "move")
        }
    }
}
