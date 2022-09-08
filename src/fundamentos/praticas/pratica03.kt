package fundamentos.praticas

/* Criar a função com apenas uma mensagem */

fun callName() {
    println("Printing from callMe() function.")
    println("This is cool (still printing from inside).")
}

/* Criar outra fun para somar 2 valores */

fun addNumbers(n1: Double, n2: Double): Int {
    val sumInteger = n1 + n2
    // val sumInteger = sum.toInt()
    return sumInteger.toInt() // liga o addNumbers
}

fun getName(firstName: String, lastName: String):String = "$firstName $lastName"

fun main(args: Array<String>) {
    callName();
    println("Printing outside from callMe() function.")
    println("******************************")

    val number1 = 12.2
    val number2 = 3.4
    val result: Int = addNumbers(number1, number2) // outra maneira de atribuir mais melhor

    //result = addNumbers(number1, number2)
    println("O resultado = $result")

    println("******************************")
    println(getName("Fernando", "Kendi"))
}

