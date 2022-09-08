package funcoes.pratica

fun addNumbers(n1: Double, n2: Double): Int {
    val sum = n1 + n2
    return sum.toInt()
}

fun main() {
    val number1 = 12.2
    val number2 = 3.4

    val result: Int = addNumbers(number1, number2)
    print("result = $result")
}
