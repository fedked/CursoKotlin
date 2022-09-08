package fundamentos

fun main(args: Array<String>) {
    val opcional: String? = "Olá"
    val obrigatorio: String = opcional ?: "Valor Padrão"

    println(obrigatorio)

}