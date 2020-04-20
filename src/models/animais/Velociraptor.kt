package models.animais

import interfaces.Dinossaouro

class Velociraptor(nome: String, nivel: Int, letalidade: Double): Animal(nome, nivel, letalidade),
    Dinossaouro {
    override fun correr() {
        print("Correndo muito rapido")
    }

    override fun morder(): Double {
        return letalidade * 0.15
    }
}