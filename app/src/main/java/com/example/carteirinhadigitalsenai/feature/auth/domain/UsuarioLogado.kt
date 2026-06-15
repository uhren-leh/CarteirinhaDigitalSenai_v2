package com.example.carteirinhadigitalsenai.feature.auth.domain

data class UsuarioLogado(
    val id: String,
    val nome: String,
    val token: String
)
