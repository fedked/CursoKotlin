package exemples

fun main() {
    var first = 1.20f
    var second = 2.45f
    println("--Before swap--")
    println("First number = $first")
    println("First second = $second")

    val temporary = first
    first = second
    second = temporary

    println("--After swap--")
    println("First number $first")
    println("First second $second")
}
