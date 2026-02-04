package com.example.moviles.componentes

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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

fun Game(){
    Column(modifier = Modifier.background(Color(color = 0xFFF8F6EE)).height(500.dp)) {

        Row(
            modifier = Modifier.width(500.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(R.drawable.baseline_message_24),
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )

            Text(
                text = "2048",
                color = Color.Black,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )

            Icon(
                painter = painterResource(R.drawable.baseline_search_24),
                contentDescription = null,
                tint = Color.Black,
                modifier = Modifier.size(24.dp)
            )
        }



        Row (modifier = Modifier.width(500.dp), verticalAlignment = Alignment.CenterVertically)  {
            Spacer(modifier = Modifier.width(15.dp))
            Box(
                modifier = Modifier.border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(8.dp) // Opcional: bordes redondeados
                )
                    .clip(CircleShape)
                    .height(40.dp)
                    .width(170.dp)
                    .background(Color(0xFFE8E5D9))
                    .padding(horizontal = 8.dp)
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            )
            {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {

                    Text(
                        text = "Score",
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(50.dp))
                    Text(
                        text = "1692",
                        color = Color.Black
                    )
                }
            }
            Spacer(modifier = Modifier.width(12.dp))
            Box(
                modifier = Modifier.border(
                    width = 1.dp,
                    color = Color.Black,
                    shape = RoundedCornerShape(8.dp) // Opcional: bordes redondeados
                )
                    .clip(CircleShape)
                    .height(40.dp)
                    .width(170.dp)
                    .background(Color(0xFFF8F6EE))
                    .padding(horizontal = 8.dp)
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            )
            {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {

                    Text(
                        text = "Best",
                        color = Color.Black
                    )
                    Spacer(modifier = Modifier.width(50.dp))
                    Text(
                        text = "7000",
                        color = Color.Black
                    )
                }
            }

        }


        Row (modifier = Modifier.width(500.dp).offset(x = 20.dp, y = 10.dp))  {


                Box(
                    modifier = Modifier
                        .size(350.dp)
                        .background(Color(0xFFBBADA0), RoundedCornerShape(10.dp))
                        .padding(12.dp)
                ) {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        verticalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(10.dp)
                    ) {
                        // FILA 1
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(10.dp)
                        ) {

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFEDE0C8), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "4",
                                    color = Color(0xFF776E65),
                                    fontSize = 32.sp,

                                )
                            }


                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFF67C5F), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "32",
                                    color = Color.White,
                                    fontSize = 32.sp,

                                )
                            }


                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFF2B179), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "8",
                                    color = Color.White,
                                    fontSize = 32.sp,

                                )
                            }


                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFF67C5F), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "32",
                                    color = Color.White,
                                    fontSize = 32.sp,

                                )
                            }
                        }

                        // FILA 2
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(10.dp)
                        ) {

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFCDC1B4), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {

                            }

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFF59563), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "16",
                                    color = Color.White,
                                    fontSize = 32.sp,

                                )
                            }


                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFF65E3B), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "64",
                                    color = Color.White,
                                    fontSize = 32.sp,

                                )
                            }


                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFEDE0C8), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "4",
                                    color = Color(0xFF776E65),
                                    fontSize = 32.sp,

                                )
                            }



                        }

                        // FILA 3
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(10.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFCDC1B4), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {

                            }

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFEEE4DA), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "2",
                                    color = Color(0xFF776E65),
                                    fontSize = 32.sp,

                                    )
                            }

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFEDCF72), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "128",
                                    color = Color.White,
                                    fontSize = 28.sp, // Más pequeño por ser número grande

                                )
                            }

                            // Cuadrado 10: 64
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFF65E3B), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "64",
                                    color = Color.White,
                                    fontSize = 32.sp,

                                )
                            }

                        }
                        // FILA 4
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = androidx.compose.foundation.layout.Arrangement.spacedBy(10.dp)
                        ) {
                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFCDC1B4), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {

                            }

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFCDC1B4), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {

                            }

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFEDCF72), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "128",
                                    color = Color.White,
                                    fontSize = 28.sp, // Más pequeño por ser número grande

                                )
                            }

                            Box(
                                modifier = Modifier
                                    .weight(1f)
                                    .aspectRatio(1f)
                                    .background(Color(0xFFCDC1B4), RoundedCornerShape(5.dp)),
                                contentAlignment = Alignment.Center
                            ) {

                            }

                        }
                    }
                }


        }



        Row (modifier = Modifier.width(500.dp).offset(y = 20.dp),horizontalArrangement = Arrangement.Center )  {


            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .height(50.dp)
                    .width(200.dp)
                    .background(Color(0xFFE6E2D5))
                    .padding(horizontal = 8.dp)
                    .padding(vertical = 12.dp),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(4.dp)
                ) {

                    Box(modifier = Modifier.size(40.dp).clip(CircleShape).background(Color(0xFFB9AB99))){
                        Icon(
                            modifier = Modifier.size(40.dp).padding(1.dp),
                            painter = painterResource(R.drawable.baseline_favorite_24),
                            contentDescription = null,
                            tint = Color.Black,

                        )

                    }

                    Text(
                        text = "2",
                        color = Color.Black,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1f).offset(x = -10.dp, y = 10.dp)
                    )



                    Box(modifier = Modifier.size(40.dp).clip(CircleShape).background(Color(0xFFB9AB99))){
                        Icon(
                            modifier = Modifier.size(40.dp).padding(1.dp),
                            painter = painterResource(R.drawable.baseline_favorite_24),
                            contentDescription = null,
                            tint = Color.Black,

                            )

                    }
                    Text(
                        text = "1",
                        color = Color.Black,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1f).offset(x = -10.dp, y = 10.dp)
                    )


                    Box(modifier = Modifier.size(40.dp).clip(CircleShape).background(Color(0xFFB9AB99))){
                        Icon(
                            modifier = Modifier.size(40.dp).padding(1.dp),
                            painter = painterResource(R.drawable.baseline_favorite_24),
                            contentDescription = null,
                            tint = Color.Black,

                            )

                    }
                    Text(
                        text = "0",
                        color = Color.Black,
                        fontSize = 10.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.weight(1f).offset(x = -10.dp, y = 10.dp)
                    )
                }
            }






        }



    }
}