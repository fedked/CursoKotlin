package fundamentos

fun soma(a: Int, b: Int = 1): Int { // retorna só o valor inteiro
    return a + b
}
fun main(args: Array<String>) {
    println(soma(2,3))
    println(soma(11))
}