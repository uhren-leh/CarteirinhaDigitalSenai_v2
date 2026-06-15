package com.example.carteirinhadigitalsenai.feature.home.presentation.screen

sealed interface HomeEvent {
    data object OnCarteirinhaClick : HomeEvent
    data object OnUnidadesCurricularesClick : HomeEvent
}