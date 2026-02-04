package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ContextualFlowRow
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import com.example.moviles.R

@Preview(showBackground = true)
@Composable

fun imagenes(){

    Column(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(R.drawable.banano),
            contentDescription = "Polemica foto de un platano",
            modifier = Modifier.size(size = 300.dp).clip(CircleShape),
            contentScale = ContentScale.Crop
            )
        Icon(painter = painterResource(R.drawable.baseline_airport_shuttle_24),
            contentDescription = null,
            tint = Color(color = 0xFFDC5050)
            )
    }

}



