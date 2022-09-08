package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroque(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 2349.00)
    val p2 = Produto(preco = 3.49, nome = "Borracha")
    println(p1 maisCaroque p2)
    println(p2.maisCaroque(p1))
}