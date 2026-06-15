package com.example.carteirinhadigitalsenai.feature.auth.presentation.screen

sealed interface LoginEvent {
    data class OnLoginChange(val value: String) : LoginEvent
    data class OnSenhaChange(val value: String) : LoginEvent
    data object OnEntrarClick : LoginEvent
    data object OnNavegacaoRealizada : LoginEvent
}