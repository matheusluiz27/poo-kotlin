package models.animais

import interfaces.Dragao

class ShenLong(nome: String, nivel: Int, letalidade: Double): Animal(nome, nivel, letalidade),
    Dragao {
    override fun voar() {
        println("Voando medio")
    }

    override fun cospirFogo(): Double {
        return letalidade * 0.10
    }
}