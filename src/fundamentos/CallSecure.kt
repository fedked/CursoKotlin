package fundamentos

fun main(args: Array<String>) {
/*
    no kotlin, a gnt pode declarar uma variavel como nula definindo o tipo dela e colocando um ? dps, exemplovar name: String?
    pode ou nao ser nula
    se ela receber um valor, ok, se n receber ok tb
    nao da pau na compilação
*/
    var a: Int? = null
    println(a?.dec())
}