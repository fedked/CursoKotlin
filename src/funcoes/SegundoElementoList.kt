package funcoes
// <E> = tipo genérico - List<E> = funcao recebe esse tipo generico
fun <E> List<E>.seconudOrNull(): E? = if(this.size >= 2) this.get(1) else null

fun main(args: Array<String>) {
    val list = listOf("João", "Maria", "Pedro")
    println(list.seconudOrNull())
}

// List a = ... a lista é capaz de armazenar qualquer cosia inteiro único objetos this o que quiser

// List<String> s = é quando você usa essa notação você está dizendo o seguinte essa lista só pode ter elementos do tipo String

// List<Int> notas = essa lista nota só vai ter elementos no tipo.
// Está amarrando e digamos assim ao conteúdo o tipo de elemento que essa lista pode ter