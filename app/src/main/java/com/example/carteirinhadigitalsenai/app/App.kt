package com.example.carteirinhadigitalsenai.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.carteirinhadigitalsenai.core.desingsystem.theme.CartirinhaDigitalSenaiTheme
import com.example.carteirinhadigitalsenai.core.navigation.AppNavHost

@Composable
fun App(){
    CartirinhaDigitalSenaiTheme {

        val navController = rememberNavController()

        AppNavHost(
            navController = navController
        )
    }
}