package com.example.carteirinhadigitalsenai.feature.auth.presentation.screen

import com.example.carteirinhadigitalsenai.feature.auth.domain.UsuarioLogado

data class LoginUiState(
    val login: String = "",
    val senha: String = "",
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val usuarioLogado: UsuarioLogado? = null
) {
    val loginRealizado: Boolean
        get() = usuarioLogado != null
}