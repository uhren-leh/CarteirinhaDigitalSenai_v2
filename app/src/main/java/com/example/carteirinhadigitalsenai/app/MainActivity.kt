package com.example.carteirinhadigitalsenai.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigitalsenai.CartirinhaView
import com.example.carteirinhadigitalsenai.core.desingsystem.theme.CartirinhaDigitalSenaiTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CartirinhaDigitalSenaiTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            colors = topAppBarColors(
                                containerColor = MaterialTheme.colorScheme.primaryContainer,
                                titleContentColor = MaterialTheme.colorScheme.primary,
                            ),
                            title = {
                                Text("Top app bar")
                            }
                        )
                    },
                    bottomBar = {
                        BottomAppBar(
                            containerColor = MaterialTheme.colorScheme.primaryContainer,
                            contentColor = MaterialTheme.colorScheme.primary,
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                textAlign = TextAlign.Center,
                                text = "Bottom app bar",
                            )
                        }
                    },
                    floatingActionButton = {
                        FloatingActionButton(onClick = { }) {
                            Icon(Icons.Default.Add, contentDescription = "Add")
                        }
                    }
                )  { innerPadding ->

                    CartirinhaView(
                        modifier = Modifier.padding(innerPadding)
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


