package collections

fun main() {
    var map = HashMap<Long, String>()
    map[10020030040] = "João"
    map[30040050060] = "Maria"
    map[60070080090] = "Pedro"

    map[60070080090] = "Pedro Filho"
    for(par in map) {
        println(par)
    }
    println("--------------------")

    for (nome in map.values) {
        nome.print()
    }
    println("--------------------")
    for (cpf in map.keys) {
        cpf.print()
    }
    println("--------------------")

    for ((cpf, nome) in map) {
        println("$nome (CPF: $cpf)")
    }
    println("--------------------")

    map.size.print()
    map.get(30040050060)?.print()
    map[30040050060]?.print()
    map.contains(30040050060).print()
    map.remove(60070080090)?.print()
//    map.get(60070080090)?.print()
    map.clear()
    map.isEmpty().print()
}