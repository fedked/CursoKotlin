package main

/**
 * Pessoa é uma Super Classe
 */
open class Pessoa(var cargo: String = "Pessoa", var nome: String = "Fernando") {
    fun comer() {
        println(nome + " está comendo.")
    }

    open fun dormir() {
        println(nome + " está dormindo.")
    }
}

/**
 * a classe Aluno herda a classe Pessoa
 */
class Aluno(nome: String) : Pessoa("Aluno", nome) {
    // o método atividade pertence apenas a classe Aluno
    fun atividade() {
        println("$nome é um $cargo. $nome está estudando na escola.")
    }

    // overrides (mesma coisa que sobreescrever) o método dormir da classe Pessoa
    override fun dormir() {
        println("$nome é um $cargo. $nome vai dormir cedo.")
    }

    fun fazerTudo() {
        comer()
        dormir()
        atividade()
    }
}

fun main(args: Array<String>) {
    var alunoUm = Aluno("Kendi")
    println("\nSobre " + alunoUm.nome + "\n---------------")
    alunoUm.fazerTudo()
}