package com.example.moviles.componentes

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable

fun Botones(){
    var activo by remember {
        mutableStateOf(value = false)
    }

    var texto: String by
    remember()
    {
        mutableStateOf("adios")

    }

    fun cambiartexto(){
        if (activo){texto = "adios"}
        else {texto = "ola"}
        activo = !activo
    }

    Column(modifier = Modifier.
        fillMaxSize()) {
        Text(text = texto)
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(
            contentColor = Color(color= 0xFFFFC107),
            containerColor = Color(color = 0xFF03A9F4)
        )) {
            Text(text = "Click me")
        }
    }
}