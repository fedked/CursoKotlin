package oop

fun main() {
    // Quando person1o objeto é criado, o código dentro do bloco inicializador é executado.
    // O bloco inicializador não apenas inicializa suas propriedades, mas também as imprime.
    val pessoa1 = Person("Fernando", 25)
}

// A Person classe tem duas propriedadesprimeiro nome, eidadesão declarados.
class Person (nomePessoa: String, idadePessoa: Int) {
    val nome: String = nomePessoa.replaceFirstChar { it.uppercase() }
    var idade: Int = idadePessoa

    // Aqui, parâmetros nomePessoa e idadePessoa dentro dos parênteses aceita valores "Fernando" e 25
    // respectivamente quando o 'objeto pessoa1' é criado. No entanto, nomePessoa e idadePessoa são usados
    // sem usar var ou val, e não são propriedades da Person classe.

    init {
//      nome = nomePessoa.replaceFirstChar { it.uppercase() }
//      idade = idadePessoa
        println("Primeiro nome = $nome")
        println("Idade = $idade")
    }
}

