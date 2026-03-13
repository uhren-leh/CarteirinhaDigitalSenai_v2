package com.example.carteirinhadigitalsenai.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carteirinhadigitalsenai.feature.auth.presentation.LoginScreen
import com.example.carteirinhadigitalsenai.feature.carteirinha.presentation.CartirinhaScreen

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ){
        composable(Routes.Login.route){
            LoginScreen()
        }
        composable(Routes.Home.route){
            CartirinhaScreen()
        }
    }
}
