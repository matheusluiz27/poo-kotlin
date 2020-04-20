package models.animais

import interfaces.Dragao

class Wyvern(nome: String, nivel: Int, letalidade: Double): Animal(nome, nivel, letalidade),
    Dragao {
    override fun voar() {
        println("Voando muito rapido")
    }

    override fun cospirFogo(): Double {
        return letalidade * 0.17
    }
}