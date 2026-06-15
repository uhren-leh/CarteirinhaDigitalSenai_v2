package com.example.carteirinhadigitalsenai.feature.carteirinha.data.repository

import com.example.carteirinhadigitalsenai.core.designsystem.navigation.Routes
import kotlinx.coroutines.delay

class FakeCarteirinhaRepository : CarteirinhaRepository {
    override suspend fun buscarCarteirinha(): Result<Routes.Carteirinha> {
        delay(1500)

        return Result.success(
            Routes.Carteirinha(
                nome = "Leticia Uhren",
                curso = "Técnico em Desenvolvimento de Sistemas",
                turma = "4DEVM-T1",
                matricula = "20260001",
                unidade = "SENAI Anchieta",
                status = "Ativo",
                qrCodeContent = "MATRICULA:20260001;ALUNO:Leticia Uhren;TURMA:4DEVM-T1"
            )
        )
    }
}
