package models

import enums.TipoArmaEnum

class Arma (
    val nome: String,
    var nivel: Int,
    val tipo: TipoArmaEnum,
    var letalidade: Double
) {

    fun subirNivel() {
        nivel += 1
        letalidade *= 0.20
    }
}