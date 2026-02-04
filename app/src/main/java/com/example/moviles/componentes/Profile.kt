package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.moviles.R

@Preview (showBackground = true)
@Composable

fun Perfil(){
    Column(modifier = Modifier.background(Color(color = 0xFF252728)).height(500.dp)) {
        Row (modifier = Modifier.background(Color(color = 0xFFDF793F)).width(500.dp))  {
            Text("Electricidad residencial y comercial                      Reparaciones del hogar en general",
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
                color = WhiteColor,
                modifier = Modifier.fillMaxWidth()
            )

        }
        Row (modifier = Modifier.background(Color(color = 0xFF294C69)).width(500.dp))  {
            Text("Atencion las 24 horas llamando al (833)312-3062",

                color = WhiteColor,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(10.dp)
            )
        }
        Row (modifier = Modifier.background(Color(color = 0xFF294C69)).width(500.dp))  {
            Text("Soluciones integrales para el manejo algo algo algo algo en Tampico, Madero y Altamira.",
                color = WhiteColor,
                fontSize = 10.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(2.dp)
            )

        }
        Image(painter = painterResource(R.drawable.f5d1069e69fa4a658e25bcbe263e5c35bef9092f88c31927f4cc3805c7df0c3c),
            contentDescription = "Logo",
            modifier = Modifier.size(size = 150.dp).
                offset(x = 122.dp,y = -35.dp).
                clip(CircleShape),
            contentScale = ContentScale.Crop,
        )

        Row (modifier = Modifier.width(500.dp).offset(y = -20.dp))  {
            Text("Multiservicios Castan: Soluciones para tu hogar en tampico",
                color = WhiteColor,
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(2.dp)
            )

        }

        Row (modifier = Modifier.width(500.dp).offset(y = -20.dp))  {
            Text("128 seguidores * 1 seguidos",
                color = WhiteColor,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(2.dp)
            )

        }

        Row (modifier = Modifier.width(500.dp).offset(y = -10.dp),horizontalArrangement = Arrangement.Center )  {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .height(50.dp)
                    .width(100.dp)
                    .background(Color(0xFF0F66FD))
                    .padding(horizontal = 8.dp)
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_message_24),
                        contentDescription = null,
                        tint = Color.White
                    )

                    Text(
                        text = "Mensaje",
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .height(50.dp)
                    .width(100.dp)
                    .background(Color(0xFF3B3D3E))
                    .padding(horizontal = 8.dp)
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_follow_the_signs_24),
                        contentDescription = null,
                        tint = Color.White
                    )

                    Text(
                        text = "Seguir",
                        color = Color.White
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .height(50.dp)
                    .width(100.dp)
                    .background(Color(0xFF3B3D3E))
                    .padding(horizontal = 8.dp)
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_search_24),
                        contentDescription = null,
                        tint = Color.White
                    )

                    Text(
                        text = "Buscar",
                        color = Color.White
                    )
                }
            }






        }

        Row (modifier = Modifier.width(500.dp))  {
            Text("BlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBlaBla",
                color = WhiteColor,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(2.dp)
            )

        }

    }
}