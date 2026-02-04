package com.example.moviles.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.border
/*import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize*/
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

val WhiteColor = Color(color = 0xFF755E50)
@Preview(showBackground = true)
@Composable
fun Modificador () {
    Text(text= "El joker",
        modifier = Modifier
            .background(Color(0xFF6DA81B))
            .padding(all = 7.dp)
            .background(Color.Magenta)
            .padding(vertical = 14.dp)
            .alpha(alpha = 0.5f)
            .blur(radius = 0.8.dp)
            .border(width = 2.dp, Color.DarkGray)
            .shadow(elevation = 20.dp)
            .rotate(degrees = 180f),
        color = WhiteColor,
        fontSize = 12.sp
        
    )
}