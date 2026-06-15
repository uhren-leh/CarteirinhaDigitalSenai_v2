package com.example.carteirinhadigitalsenai.feature.carteirinha.presentation

import com.example.carteirinhadigitalsenai.feature.carteirinha.domain.model.Carteirinha

data class CarteirinhaUiState(
    val isLoading: Boolean = false,
    val carteirinha: Carteirinha? = null,
    val errorMessage: String? = null
)