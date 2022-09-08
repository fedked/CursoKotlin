package fundamentos.praticas

fun calculateIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura)
}

fun main(args: Array<String>) {
    val imc = calculateIMC(6.54, 7.24)
    println(imc)
}
