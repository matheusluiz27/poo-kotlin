package models.animais

open class Animal (
    val nome: String,
    var nivel: Int,
    var letalidade: Double
){
    fun subirNivel() {
        nivel += 1
        letalidade *= 0.15
    }
}