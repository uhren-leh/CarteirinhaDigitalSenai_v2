package com.example.carteirinhadigitalsenai.feature.unidadecurricular.data.repository

interface UnidadeCurricularRepository {
    suspend fun buscarUnidadesCurriculares(): Result<List<UnidadeCurricular>>
}
