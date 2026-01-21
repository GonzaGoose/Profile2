package com.example.moviles

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyTextView(){
    Text(text = "Hola mundo",
        color = Color.Blue,
        fontSize = 80.sp,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.Cursive,
        letterSpacing = 20.sp,
        lineHeight = 77.sp,
        textDecoration = TextDecoration.LineThrough,
        textAlign = TextAlign.Justify,
        maxLines = 4,
        overflow = TextOverflow.Ellipsis

    )
}


@Preview(showBackground = true)
@Composable
fun Modificador () {
    Text(text= "Hola Juan", modifier = Modifier.fillMaxSize())
}