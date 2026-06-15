package com.example.carteirinhadigitalsenai.feature.carteirinha.data.repository

import com.example.carteirinhadigitalsenai.core.designsystem.navigation.Routes


interface CarteirinhaRepository {
    suspend fun buscarCarteirinha(): Result<Routes.Carteirinha>
}
