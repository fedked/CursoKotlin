package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à chefia $chefe."
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("Barbara", "Fernando"))
    println(relacaoDeTrabalho(funcionario = "Zeus", chefe = "Deus" ))
}