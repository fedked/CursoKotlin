package fundamentos.controles

fun main() {
    var nota: Double = 7.5

    // Usando operador range
    if (nota in 9.0..10.0) {
        println("Fantástica")
    } else if (nota in 7.0..8.0) {
        println("Parabéns")
    } else if (nota in 4.0..6.0) {
        println("Tem como recuperar")
    } else if (nota in 0.0..3.0) {
        println("Te vejo no próximo semestre")
    } else {
        println("Nota inválida")
    }
    println(7 in 6..9)
    println(5 in 4..7)
}