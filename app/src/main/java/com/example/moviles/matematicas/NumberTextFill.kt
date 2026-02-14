package com.example.moviles.matematicas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviles.Modificador


@Composable
fun NumberTextFill (modificador: Modifier, )
{
    var number by remember { mutableStateOf(value = "") }
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "Ingresa un Numero")
        TextField(value = number, onValueChange = { textoEscrito ->
            if(textoEscrito.toIntOrNull() != null){
                number = textoEscrito.toInt().toString()
            }
        })
    }
}

