package exemples

fun main() {
    val str = "This website is awsome."
    val ch = 'i'
    var frequency = 0

    for (i in 0..str.length - 1) {
        if (ch == str[i]) {
            ++frequency
        }
    }
    println("Frequency of $ch = $frequency")
}