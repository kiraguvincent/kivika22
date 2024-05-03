package com.example.Firebasestorage.ui.theme.screens.clothing

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Firebasestorage.R
import com.example.Firebasestorage.ui.theme.lBlue

@Composable
fun ClothingScreen(navController: NavHostController) {
    Column (modifier = Modifier.fillMaxSize()) {


        //TopAppBar
        TopAppBar(
            title = {
                Text(text = "Clothes")
            },
            backgroundColor = lBlue
        )

        //End of TopAppBar

        Box(
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.BottomStart
        ) {


            Image(
                painter = painterResource(id = R.drawable.clothing),
                contentDescription = "Clothes",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

        }

        Column {
            Text(
                text = "WINTER COLLECTION",
                fontSize = 35.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold, textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "PURCHASE YOUR CLOTHES",
                fontSize = 20.sp,
                color = Color.White

            )
            Spacer(modifier = Modifier.height(10.dp))
        }
    }

   // End of Box

    Spacer(modifier = Modifier.height(10.dp))

    Column(modifier = Modifier
        .verticalScroll(rememberScrollState())
        .padding(20.dp)) {

        //Row1
        Row() {



            val mContext = LocalContext.current

            //Column1


            Column {
                Image(
                    painter = painterResource(id = R.drawable.clothing),
                    contentDescription = "Amazon",
                    modifier = Modifier.size(width = 180.dp, height = 200.dp)
                )
                Text(text = "shirt1", fontSize = 20.sp)
                Text(text = "KSH.1300", fontSize = 20.sp)



                OutlinedButton(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 30.dp),
                    shape = RoundedCornerShape(5.dp),
                    border = BorderStroke(2.dp, Color.Red)

                ) {
                    Text(text = "PAY HERE", color = Color.Yellow)

                }

            }
            //End of Column1

            Spacer(modifier = Modifier.height(10.dp))
            //Column2
            Column {
                Image(
                    painter = painterResource(id = R.drawable.clothing),
                    contentDescription = "Amazon",
                    modifier = Modifier.size(width = 180.dp, height = 200.dp)
                )
                Text(text = "shirt1", fontSize = 20.sp)
                Text(text = "KSH.1300", fontSize = 20.sp)



                OutlinedButton(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 30.dp, end = 30.dp),
                    shape = RoundedCornerShape(5.dp),
                    border = BorderStroke(2.dp, Color.Red)

                ) {
                    Text(text = "PAY HERE", color = Color.Yellow)

                }

            }

            //End of Column2


        }

        //End of Row1

        Spacer(modifier = Modifier.height(10.dp))

    }}

@Preview
@Composable
fun ClothingScreenPreview() {
    ClothingScreen(rememberNavController())
}

