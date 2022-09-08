package funcoes.pratica

data class Cidadao(var nome: String, var idade: Int, var residencia: String)

fun main(args: Array<String>) {
    val cidadao2 = Cidadao("Tom,", 24, "Washington")
    val idade = with(cidadao2) {
        println("$nome - $idade $residencia ")
        idade = this.idade + idade // idade dele (24) + 24 = 48
        residencia = "Florida"
        idade+10
    }
    println("${cidadao2.nome} - ${cidadao2.idade} - $idade - ${cidadao2.residencia} ")
}