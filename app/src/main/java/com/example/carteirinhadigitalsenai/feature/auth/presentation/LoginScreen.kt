package com.example.carteirinhadigitalsenai.feature.auth.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigitalsenai.core.desingsystem.theme.CartirinhaDigitalSenaiTheme

@Composable
fun LoginScreen(modifier: Modifier = Modifier){
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ){
        TextField(
            value = "",
            onValueChange = {},
            label = {
                Text ("Login")
            },
        )
        OutlinedTextField(
            value = "",
            onValueChange = {},
            label = {
                Text ("Senha")
            },
        )
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxWidth(.5f)
                .size(width = 300.dp, height = 45.dp),
            shape = RoundedCornerShape(size = 9.dp)

        ) {
            Text("Entrar")
        }
        OutlinedButton(
            onClick = {}
        ) {
            Text("Entrar")
        }
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginClara(){
    CartirinhaDigitalSenaiTheme(darkTheme = false){
        LoginScreen(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        )
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginEscuro(){
    CartirinhaDigitalSenaiTheme(darkTheme = true) {
        LoginScreen(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxSize()
        )
    }
}
