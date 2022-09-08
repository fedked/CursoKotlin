package fundamentos.controles

fun main(args: Array<String>) {
    externo@for (i in 1..15) {
        for (j in 1..15) { // no primeiro 1 a 15
            if (i == 2 && j == 9) break@externo
            println("$i $j CADA")
        }
        println("TERMINADO")
    }
    println("Fim!")
}