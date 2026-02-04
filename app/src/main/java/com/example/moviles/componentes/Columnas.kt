package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/*@Preview (showBackground = true)*/
@Composable
fun Columnas(){
    Column(verticalArrangement = Arrangement.Bottom,
        modifier = Modifier.fillMaxSize().background(Color.Red).padding(50.dp),
        horizontalAlignment = Alignment.End) {
        Text(text="Uno")
        Spacer(modifier = Modifier.height(height = 20.dp))
        Text(text="Dos")
        Spacer(modifier = Modifier.height(height = 15.dp))
        Text(text="Tres")
        Spacer(modifier = Modifier.height(height = 10.dp))

    }

}
@Preview (showBackground = true)
@Composable
fun Separadores(){
    Column(verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text="Noa", modifier = Modifier.fillMaxSize().weight(weight = 1f))
        HorizontalDivider(thickness = 20.dp, color = Color.Red)
        Text(text="Vamos", modifier = Modifier.fillMaxSize().weight(weight = 3f))
        Text(text="A", modifier = Modifier.fillMaxSize().weight(weight = 5f))
        Text(text="Bailar", modifier = Modifier.fillMaxSize().weight(weight = 8f))
        Columnas()
    }
}