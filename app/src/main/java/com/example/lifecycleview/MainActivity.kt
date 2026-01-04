package com.example.lifecycleview


import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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
fun FirstScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier.padding(24.dp).fillMaxSize().padding(top = 10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(text = "Android Activity Lifecycle", fontSize = 22.sp, fontWeight = FontWeight.Bold)
        Text(
            text = "Activity Lifecycle Methods",
            fontSize = 16.sp,
            color = androidx.compose.ui.graphics.Color.Gray
        )
        Spacer(modifier = Modifier.height(16.dp))
        LifecycleItem("onCreate()")
        LifecycleItem("onStart()")
        LifecycleItem("onResume()")
        LifecycleItem("onPause")
        LifecycleItem("onStop()")
        LifecycleItem("onRestart()")
        LifecycleItem("onDestroy()")
        Spacer(modifier = Modifier.height(24.dp))
        Button(modifier =
            Modifier.align(Alignment.CenterHorizontally), onClick = {
            val intent = Intent(context, SecondScreenKotlin::class.java)
            context.startActivity(intent)
        }) {
            Text(text = "Open Second Activity")
        }
    }
}

    @Composable
    fun LifecycleItem(text: String) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
        ) {
            Text(
                text = text,
                modifier = Modifier.padding(12.dp),
                fontSize = 16.sp
            )
        }
    }