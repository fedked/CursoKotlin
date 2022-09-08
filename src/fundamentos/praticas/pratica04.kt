package fundamentos.praticas

fun calculate(anoNasc: Int, anoAtual: Int): Int {
    //val personalAge = anoAtual - anoNasc
    return anoAtual - anoNasc
}

fun main(args: Array<String>) {
    val age = calculate(1993, 2022)
    println("A minha idade é: $age")
}