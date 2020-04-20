package models

import models.animais.Animal

class Personagem(
    val nome: String,
    var nivel: Int,
    val usuario: Usuario,
    var armas: List<Arma>,
    var animais: Array<in Animal>,
    var clan: Clan
) {
    lateinit var animal: Animal

    fun subirNivel() {
        nivel += 1
    }
}
