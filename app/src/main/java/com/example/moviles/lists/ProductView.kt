package com.example.moviles.lists

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Preview(showBackground = true)
@Composable
fun ProductView(){
    Card(){
        Column(modifier = Modifier.fillMaxWidth().padding(all = 10.dp)) {
            Row() {
                Image(painter = painterResource(R.drawable.banano),
                    contentDescription = "Imagen de producto",
                    modifier = Modifier.size(size = 120.dp).align(Alignment.CenterVertically)
                )
                Column() {
                    Spacer(modifier = Modifier.size(size = 10.dp))
                    Text("Macbook perrona bien grande", fontSize = 20.sp)
                    Text("2 estrellas", fontSize = 17.sp)
                    Text("$5 peso", fontSize = 14.sp, fontWeight = Bold)
                    Text("Llega el sabado")
                    Spacer(modifier = Modifier.size(size = 10.dp))
                    Button(onClick = {}) {Text(text = "CONSUME") }
                    Spacer(modifier = Modifier.size(size = 10.dp))
                }
            }
        }
    }

}