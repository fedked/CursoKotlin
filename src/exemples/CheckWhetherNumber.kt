package exemples

import java.util.*

fun main() {
    val reader = Scanner(System.`in`)
    print("Enter a number: ")
    val num = reader.nextInt()

//    if (num % 2 == 0)
//        println("num is even") // no primeiro comeco caso tiver o zero igual 2
//    else
//        println("num is odd")

    val evenOdd = if (num % 2 == 0) "even" else "odd"
    println("num is $evenOdd")
}