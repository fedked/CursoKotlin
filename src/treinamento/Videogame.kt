package treinamento

import treinamento.pacotes.consoles.Consoles
import treinamento.pacotes.jogos.Jogos

fun main() {
    val console1 = Consoles("Playstation", "PS5", "nono", "branco")
    val game = Jogos("GTA Vice City", "ação", 2002)

    println("Tenho um ${console1.console} é da ${console1.marca} com cor ${console1.color} é da nova geração " +
            "${console1.generation}. Joguei o jogo ${game.nome} é o ${game.genero} e foi lançado em ${game.ano}")
}