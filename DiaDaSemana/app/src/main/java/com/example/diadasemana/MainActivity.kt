package com.example.diadasemana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.diadasemana.ui.theme.DiaDaSemanaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DiaDaSemanaTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    DiaDaSemana("Android")
                }
            }
        }
    }
}

@Composable
fun DiaDaSemana(name: String, modifier: Modifier = Modifier) {
    val hoje = Caledario().diaDaSemana();

    Text(
            text = "Dia $hoje!",
            modifier = modifier
    )

    Column {
        text = "Dia" + Caledario().diaDaSemana();
        text = "Dia" + Caledario().diaDaSemana();
    }
    Row{
        Text(
            Color = Color.Blue
            text = "Dia" + Caledario().diaDaSemana();

        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            Color = Color.Blue
                    text = "Dia" + Caledario().diaDaSemana();
        )
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DiaDaSemanaTheme {
        Greeting("Android")
    }
}