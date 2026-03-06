package com.example.carteirinhadigitalsenai


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigitalsenai.ui.theme.CartirinhaDigitalSenaiTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CartirinhaDigitalSenaiTheme {
                Scaffold { innerPadding ->

                    CartirinhaView(
                      modifier = Modifier.padding( innerPadding)
                    )

                }
            }
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewCarteirinhaClara(){
    CartirinhaDigitalSenaiTheme(darkTheme = false){
        CartirinhaView(
            modifier = Modifier.padding(16.dp)
        )
    }
}
@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewCarteirinhaEscuro(){
    CartirinhaDigitalSenaiTheme(darkTheme = true) {
        CartirinhaView(
            modifier = Modifier.padding(16.dp)
        )
    }
}


