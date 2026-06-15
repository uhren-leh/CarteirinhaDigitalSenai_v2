package com.example.carteirinhadigitalsenai.feature.auth.data.repository

interface AuthRepository {
    suspend fun login(login: String, senha: String): Result<UsuarioLogado>
}