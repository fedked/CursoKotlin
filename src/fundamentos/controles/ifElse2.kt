package fundamentos.controles

fun main(args: Array<String>) {
    val num1: Int = 6
    val num2: Int = 9
    val maiorValor = if (num1 > num2) {
        println("processando if...")
        num1
    } else {
        println("Processando else...")
        num2
    }

    // val maiorValor = if (num1 > num2) num1 else num2 // OPERADOR TERNÁRIO
    println("O maior valor é $maiorValor.")
}