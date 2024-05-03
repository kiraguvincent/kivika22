package com.example.Firebasestorage.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.Firebasestorage.ui.theme.screens.about.AboutScreen
import com.example.Firebasestorage.ui.theme.screens.contact.contactscreen
import com.example.Firebasestorage.ui.theme.screens.dashboard.DashBoardScreen
import com.example.Firebasestorage.ui.theme.screens.home.HomeScreen
import com.example.Firebasestorage.ui.theme.screens.login.LoginScreen
import com.example.Firebasestorage.ui.theme.screens.services.ServicesScreen
import com.example.Firebasestorage.ui.theme.screens.signup.SignupScreen
import com.example.Firebasestorage.ui.theme.screens.upload.UploadScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController:NavHostController = rememberNavController(), startDestination:String = ROUT_SPLASH) {
    NavHost(navController = navController, modifier=modifier, startDestination = startDestination){
        composable(ROUT_HOME){
            HomeScreen(navController)
        }

        composable(ROUT_LOGIN){
            LoginScreen(navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController)
        }

        composable(ROUT_UPLOAD){
            UploadScreen(navController)
        }


        composable(ROUT_DASHBOARD){
            DashBoardScreen(navController)
        }


        composable(ROUT_CONTACT){
            contactscreen(navController)
        }


        composable(ROUT_SPLASH){
            ServicesScreen(navController)
        }



        composable(ROUT_ABOUT){
            AboutScreen(navController)
        }

    }
}