package fundamentos.operadores

// pode usar return antes de usar chaves
fun obterResultado(nota: Double) : String =
     if(nota >= 7.0) "Passou" else "Reprovou"


fun main(args: Array<String>) {
    print(obterResultado(8.3))
}