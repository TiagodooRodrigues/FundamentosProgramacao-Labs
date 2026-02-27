fun MenuIncial(): String {  // String Inicio do  -> escreve o menu inicial do jogo
    return """Bem vindo ao Jogo do Galo!
1-> Começar umm jogo;
2-> Sair do jogo.
"""
}

fun designTabuleiro(): String {
    var tabuleiro = ""
    var count = 0
    while (count < 9) {
        tabuleiro+="  |  "
        tabuleiro+= tabuleiroinicial[count]
        tabuleiro+="  |  "
        if (count == 2 || count == 5) {
            tabuleiro+= "\n"
        }
        count++
    }
    return tabuleiro
}
var tabuleiroinicial: Array<String> = arrayOf("*","*","*","*","*","*","*","*","*")

fun nomeJogador(param: String): String {
    println(param)
    var jogador = readLine()!!.toString()
    return jogador
}
fun game(jogador1: String , jogador2: String) {
    var isExit = false
    do {
        print("\n")
        println("$jogador1 faca a sua jogada , Escolha uma posicao de [0] a [8]")
        var jogada1 = readLine()!!.toInt()
        tabuleiroinicial[jogada1] = "X"
        println(designTabuleiro())
        if ( tabuleiroinicial.contains("*")) {
            if (vitoria(tabuleiroinicial)) {
                print("\n")
                println("$jogador1 Ganhou!")
                isExit = true
            } else {
                print("\n")
                println("$jogador2 faca a sua jogada , Escolha uma posicao de [0] a [8]")
                var jogada2 = readLine()!!.toInt()
                tabuleiroinicial[jogada2] = "O"
                println(designTabuleiro())
                if (vitoria(tabuleiroinicial)) {
                    print("\n")
                    println("$jogador2 Ganhou!")
                    isExit = true
                }
            }
        } else {
            println("Empate")
            isExit = true
        }
    } while (!isExit)

}
fun vitoria (tabuleiro:Array<String>) : Boolean {
     return when {
        //************* Vitorias Horizontais *************//
        tabuleiro[0] == tabuleiro[1] && tabuleiro[1] == tabuleiro[2] && tabuleiro[0] != "*" && tabuleiro[1]!= "*" && tabuleiro[2]!= "*"-> true
        tabuleiro[3] == tabuleiro[4] && tabuleiro[4] == tabuleiro[5] && tabuleiro[3] != "*" && tabuleiro[4]!= "*" && tabuleiro[5]!= "*"-> true
        tabuleiro[6] == tabuleiro[7] && tabuleiro[7] == tabuleiro[8] && tabuleiro[6] != "*" && tabuleiro[7]!= "*" && tabuleiro[8]!= "*"-> true
        //************* Vitorias Verticais *************//
        tabuleiro[0] == tabuleiro[3] && tabuleiro[3] == tabuleiro[6] && tabuleiro[0] != "*" && tabuleiro[3]!= "*" && tabuleiro[6]!= "*" -> true
        tabuleiro[1] == tabuleiro[4] && tabuleiro[4] == tabuleiro[7] && tabuleiro[1] != "*" && tabuleiro[4]!= "*" && tabuleiro[7]!= "*"-> true
        tabuleiro[2] == tabuleiro[5] && tabuleiro[5] == tabuleiro[8] && tabuleiro[2] != "*" && tabuleiro[5]!= "*" && tabuleiro[8]!= "*"-> true
        //************* Vitorias Diagonais *************//
        tabuleiro[0] == tabuleiro[4] && tabuleiro[4] == tabuleiro[8] && tabuleiro[0] != "*" && tabuleiro[4]!= "*" && tabuleiro[8]!= "*"-> true
        tabuleiro[2] == tabuleiro[4] && tabuleiro[4] == tabuleiro[6] && tabuleiro[2] != "*" && tabuleiro[4]!= "*" && tabuleiro[6]!= "*"-> true
        else -> false
    }
}
fun main () {
    var ciclo = false
    do {
        println(MenuIncial())
        var opcaoEscolhida = readLine()!!.toString()
        if (opcaoEscolhida == "1") {
            var jogador1 = nomeJogador("Digite o nome do primeiro jogador")
            var jogador2 = nomeJogador("Digite o nome do segundo jogador")
            print("\n")
            println(designTabuleiro())
            game(jogador1,jogador2)
            print("\n")
        } else {
            if (opcaoEscolhida == "2") {
                ciclo = true
            }
        }
    } while (!ciclo)
}