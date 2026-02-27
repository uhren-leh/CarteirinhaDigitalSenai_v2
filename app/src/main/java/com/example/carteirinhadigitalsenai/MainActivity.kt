package com.example.carteirinhadigitalsenai


import android.R.attr.start
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.carteirinhadigitalsenai.ui.theme.CartirinhaDigitalSenaiTheme
import com.rafaelcosta.myapplication.QrCode


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CartirinhaDigitalSenaiTheme {
                Scaffold { innerPadding ->

                    CartirinhaDeEstudante(
                      modifier = Modifier.padding( innerPadding)
                    )

                }
            }
        }
    }
}

@Composable
fun CartirinhaDeEstudante (modifier: Modifier = Modifier) {
    Box() {
        Image(
            painter = painterResource(R.drawable.d9003ca94a2692db7bf8e88d09f52616),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(.7f)

        )

        Column(
            modifier = modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(R.drawable.senai_s_o_paulo_logo),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(.6f)
                    .weight(.6f)

            )
            Spacer(
                modifier = Modifier
                    .weight(.1f)
            )
            Image(
                painter = painterResource(R.drawable._4194216_icone_de_avatar_humano_distintivo_de_uma_pessoa_simbolo_de_perfil_de_midia_social_o_simbolo_de_uma_pessoa_vetor),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
                    .aspectRatio(1f)
                    .clip(CircleShape)
            )
            Row(
                modifier = Modifier
                    .weight(.2f)
                    .fillMaxWidth(.9f),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Nome:",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Right,
                    modifier = Modifier
                        .weight(1f)
                )

                Text(
                    text = "Leticia Uhren",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(start = 8.dp)
                        .weight(3f),

                    )
            }


            Row {
                Text(
                    text = "Curso:",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Right,
                    modifier = Modifier
                        .weight(1f)
                )

                Text(
                    text = "DEV - Desenvolvimento de Sistemas",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Left,
                    modifier = Modifier.padding(start = 8.dp)
                        .weight(3f)
                )
            }
            QrCode(
                "90000000001417130546",
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
            )
        }
    }
}


