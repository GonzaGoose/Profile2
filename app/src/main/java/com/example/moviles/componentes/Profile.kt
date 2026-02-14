package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
    var messageText by remember { mutableStateOf("BLABLABLABLABLABLABLABLABLABLABLABLABLABLABLA")}
    var SeguirStatus by remember { mutableStateOf("Seguir")}
    var IMGPerfil by remember { mutableStateOf(R.drawable.f5d1069e69fa4a658e25bcbe263e5c35bef9092f88c31927f4cc3805c7df0c3c)}
    var Nombre by remember { mutableStateOf("Multiservicios Castan: Soluciones para tu hogar en tampico")}

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
        Image(painter = painterResource(IMGPerfil),
            contentDescription = "Logo",
            modifier = Modifier.size(size = 150.dp).
                offset(x = 122.dp,y = -35.dp).
                clip(CircleShape).
                clickable {
                // Cambia el texto
                    IMGPerfil = if (IMGPerfil == R.drawable.f5d1069e69fa4a658e25bcbe263e5c35bef9092f88c31927f4cc3805c7df0c3c) R.drawable.bd1b1272a9e84bab6053a8c6e970b64697a3286851e0014723cad09726d0cfc2 else R.drawable.f5d1069e69fa4a658e25bcbe263e5c35bef9092f88c31927f4cc3805c7df0c3c
            },
            contentScale = ContentScale.Crop,
        )

        Row (modifier = Modifier.width(500.dp).offset(y = -20.dp))  {
            Text(Nombre,
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
                    .padding(vertical = 12.dp).
                    clickable {
                        // Cambia el texto
                        messageText = if (messageText == "BLABLABLABLABLABLABLABLABLABLABLABLABLABLABLA") "Estamos trabajando en nuestra plataforma digital" else "BLABLABLABLABLABLABLABLABLABLABLABLABLABLABLA"
                    },
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
                        text = "Mensaje",  // Usa la variable de estado
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
                    .padding(vertical = 12.dp).
                    clickable {
                        // Cambia el texto
                        SeguirStatus = if (SeguirStatus == "Seguir") "Siguiendo" else "Seguir"
                    }
                ,
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
                        text = SeguirStatus,
                        color = Color.White,
                        fontSize = 10.sp,

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
            Text(messageText,
                color = WhiteColor,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth().padding(2.dp)
            )

        }

        Row(
            modifier = Modifier.fillMaxWidth().offset(x = 70.dp),
            verticalAlignment = Alignment.CenterVertically,

        ) {
            Text(
                text = "Cambiar nombre de la página",
                color = WhiteColor,
                fontSize = 10.sp
            )

            TextField(
                value = Nombre,
                onValueChange = {Nombre = it},
                placeholder = { Text("Nuevo Nombre") },
                modifier = Modifier.width(150.dp)
            )
        }

    }
}