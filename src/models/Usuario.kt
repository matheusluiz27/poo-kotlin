package models

class Usuario (
    val login: String,
    val senha: String
) {
    lateinit var personagem: Personagem
}

