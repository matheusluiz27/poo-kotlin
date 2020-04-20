package models.animais

import interfaces.Dinossaouro

class Rex(nome: String, nivel: Int, letalidade: Double): Animal(nome, nivel, letalidade),
    Dinossaouro {
    override fun correr() {
        println("Correndo medio")
    }

    override fun morder(): Double {
        return letalidade * 0.30
    }
}