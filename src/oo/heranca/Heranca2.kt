package oo.heranca

open class Animal(val nome: String)

class Cachorro : Animal {
    private val altura: Double

    constructor(nome: String, altura: Double) : super(nome) {
        this.altura = altura
    }
    constructor(nome: String) : this(nome, 0.0)
    override fun toString(): String = "$nome tem $altura cm da altura"
}

fun main() {
    val dogAlmeao = Cachorro("Spkye", 84.3)
    val yorkshire = Cachorro("Lady Di")

    println(dogAlmeao)
    println(yorkshire)
}