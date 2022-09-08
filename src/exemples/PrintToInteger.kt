package exemples

import java.util.Scanner

fun main() {
    /*val reader = Scanner(System.`in`)
    print("Enter a number: ")

    var integer:Int = reader.nextInt()
    println("You entered $integer")*/

    // ******************************

    val lerNome = Scanner(System.`in`)
    print("Write your name: ")

    var chamarNome = lerNome.nextLine().uppercase()
    println("Seu nome é ${chamarNome.first()}")
}