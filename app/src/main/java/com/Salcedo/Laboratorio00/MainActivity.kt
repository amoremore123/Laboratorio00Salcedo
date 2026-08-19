package com.Salcedo.Laboratorio00

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.Salcedo.Laboratorio00.ui.theme.Laboratorio00Theme
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Laboratorio00Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text(text = "Hola soy $name!",fontSize = 24.sp )
        Text(text = "Conociendo Programacion en moviles")
    }
}

@Composable
fun FilledButtonExample(onClick: () -> Unit) {
    Spacer(modifier = Modifier.height(50.dp))
    Button(onClick = { onClick() }) {
        Text("Presioname")
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Laboratorio00Theme {
        Greeting("Amore Salcedo")
        Spacer(modifier = Modifier.height(50.dp))
        FilledButtonExample(onClick = {})
    }
}