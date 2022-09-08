package collections

fun main() {
    val aprovados = hashSetOf("João", "Maria", "Pedro", "Ana", "Joana")
    // aprovados.add(1)

    println("Sem ordem...")
    for (aprovado in aprovados) {
        aprovado.print()
    }

    val aprovadosNaOrdem1 = linkedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nLinked...")
    for (aprovado in aprovadosNaOrdem1) {
        aprovado.print()
    }

    val aprovadosNaOrdem2 = sortedSetOf("João", "Maria", "Pedro", "Ana", "Joana")

    println("\nSorted...")
    for (aprovado in aprovadosNaOrdem2) {
        aprovado.print()
    }

    /*val listaDeNomesAprovados = arrayListOf("João", "Maria", "Pedro", "Ana", "Joana")
    println(listaDeNomesAprovados.sorted())*/

    // Ordem maluca
    aprovados.sortedBy { it.substring(1,2) }.print()
}