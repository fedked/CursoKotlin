package exemples

fun main() {
    var first = 12.0f
    var second = 24.5f

    println("--before swap--")
    println("First number = $first") // 12.0f
    println("Second number = $second") // 24.5f

    first -= second // 12.0 - 24.5 = -12.5
    second += first // 12,0
    first = second - first // 24,5

    println("--After swap--")
    println("First number $first") // 24.5
    println("Second number $second") // 12.0
}