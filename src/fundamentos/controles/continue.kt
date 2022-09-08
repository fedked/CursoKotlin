package fundamentos.controles

fun main(args: Array<String>) {
    for (i in 1..10) {
        if (i == 6) {
            continue
        }
        println("Atual: $i")
    }
}