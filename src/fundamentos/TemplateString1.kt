package fundamentos

fun main(args: Array<String>) {
    val aprovados = listOf("João", "Maria", "Pedro")
    // Primeira maneira de usar ${} sem +
    println("O primeiro colocado foi ${aprovados[0]}")
    // Segunda outra maneira de usar +
    println("O primeiro colocado foi " + aprovados[0])
}