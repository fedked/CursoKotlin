package exemples

fun main() {
    print("Escreva qq: ")
    val stringInt = readLine()!!

    val integer:Int = stringInt.toInt()
    println("$integer")
}