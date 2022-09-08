package collections

fun main() {
    val numeros = Array(10) { i -> i * 10 }
    for (numero in numeros) {
        println(numero)
    }

    println("--------------------")

    println(numeros.get(1))
    println(numeros.size)

    println("--------------------")

    numeros.set(1, 2022)
    println(numeros[1])

    println("--------------------")

    numeros[1] = 2345
    println(numeros[2])
}