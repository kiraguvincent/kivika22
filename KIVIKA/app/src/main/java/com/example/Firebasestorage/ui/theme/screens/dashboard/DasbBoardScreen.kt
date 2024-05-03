package com.example.Firebasestorage.ui.theme.screens.dashboard

import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.Firebasestorage.InsertActivity
import com.example.Firebasestorage.R
import com.example.Firebasestorage.ui.theme.lBlue

@Composable
fun DashBoardScreen(navHostController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()){

        //TopAppBar
        TopAppBar(
            title = { Text(text = "Amazon Shop")
            },
            backgroundColor = lBlue)
        //End of TopAppBar

        Spacer(modifier = Modifier.height(30.dp))
        //Row
        Row (modifier = Modifier.padding(start = 20.dp)){
            Column {
                Text(
                    text = "Amazon",
                    fontSize = 30.sp,
                    color = lBlue,
                    fontFamily = FontFamily.Serif
                )
                Text(text = "Shop from A to Z", fontSize = 20.sp)
            }
                Spacer(modifier = Modifier.width(80.dp))

                Image(painter = painterResource(id = R.drawable.amazon),
                    contentDescription ="Amazon",
                    modifier = Modifier.size(100.dp))


        }
        //End of Row

        Spacer(modifier = Modifier.height(30.dp))

        Column(modifier = Modifier.padding(start = 20.dp)) {

            //Row1
            val mContext= LocalContext.current
Row {
    Card (modifier = Modifier
        .clickable { mContext.startActivity(Intent(mContext,InsertActivity::class.java)) }
        .size(width = 150.dp, height = 120.dp), elevation = 20.dp){
        Column {
            Box(modifier = Modifier
                .fillMaxWidth(),
                contentAlignment = Alignment.Center) {

                Image(painter = painterResource(id = R.drawable.clothing),
                    contentDescription ="Amazon",
                    modifier = Modifier.size(50.dp))

            }

            Text(text = "Clothing",
                color = lBlue,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

    }

Spacer(modifier = Modifier.width(30.dp))

    Card (modifier = Modifier.size(width = 150.dp, height = 120.dp), elevation = 20.dp){
        Column {
            Box(modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center) {

                Image(painter = painterResource(id = R.drawable.electronics),
                    contentDescription ="Amazon",
                    modifier = Modifier.size(50.dp))

            }

            Text(text = "Electronics",
                color = lBlue,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center)
        }

    }


}
            //End of Row1


            //Row2
            Row {
                Card (modifier = Modifier.size(width = 150.dp, height = 120.dp), elevation = 20.dp){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(painter = painterResource(id = R.drawable.home),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }

                        Text(text = "Home",
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }

                }

                Spacer(modifier = Modifier.width(30.dp))

                Card (modifier = Modifier.size(width = 150.dp, height = 120.dp), elevation = 20.dp){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(painter = painterResource(id = R.drawable.beauty),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }

                        Text(text = "Beauty",
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }

                }


            }
            //End of Row2



            //Row3
            Row {
                Card (modifier = Modifier.size(width = 150.dp, height = 120.dp), elevation = 20.dp){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(painter = painterResource(id = R.drawable.pharmacy),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }

                        Text(text = "Pharmacy",
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }

                }

                Spacer(modifier = Modifier.width(30.dp))

                Card (modifier = Modifier.size(width = 150.dp, height = 120.dp), elevation = 20.dp){
                    Column {
                        Box(modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center) {

                            Image(painter = painterResource(id = R.drawable.groceries),
                                contentDescription ="Amazon",
                                modifier = Modifier.size(50.dp))

                        }

                        Text(text = "Groceries",
                            color = lBlue,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center)
                    }

                }


            }
            //End of Row3



        }

        }

    }




@Preview(showBackground = true)
@Composable
fun DashBoardScreenPreview(){
    DashBoardScreen(rememberNavController())


}
