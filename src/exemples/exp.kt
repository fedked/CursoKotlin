package exemples

fun main() {
    var first = 12.0f
    var second = 24.5f
    first -= second
    second += first
    first = second - first

    println(first)
    println(second)
}