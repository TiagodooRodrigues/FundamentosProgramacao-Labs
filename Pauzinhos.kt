fun MenuIncialNim(): String {  // String Inicio do  -> escreve o menu inicial do jogo
    return """Bem vindo ao Expose do AMS , vamos jogar ao jogo Real dos Real!
1-> Começar umm jogo;
2-> Sair do jogo.
"""
}
var tabuleiroNimInicial: Array<String> = arrayOf("|","|","|","|","|","|","|","|","|","|","|","|","|","|","|","|")

fun tabuleiroNim(): String {
    var tabuleiro = ""
    var count = 0
    while (count <= 15) {
        tabuleiro += tabuleiroNimInicial[count]
        if (count == 0 || count == 3 || count == 8) {
            tabuleiro += "\n"
        }
        count++
    }
    return tabuleiro
}
fun perder(tabuleiro:Array<String>): Boolean {
    return when {
        tabuleiroNimInicial.contains("|") -> false
        else -> true
    }
}
fun retirarFilas(jogada: String){
    var isExit = false
    do {
        when {
            jogada == "Fila1" -> {
                tabuleiroNimInicial[0] = ""
                isExit = true
            }
            jogada == "Fila2" -> {
                for (i in 1..3) {
                    tabuleiroNimInicial[i] = ""
                }
                isExit = true
            }
            jogada == "Fila3" -> {
                for (i in 4..8) {
                    tabuleiroNimInicial[i] = ""
                }
                isExit = true
            }
            jogada == "Fila4" -> {
                for (i in 9..15) {
                    tabuleiroNimInicial[i] = ""
                }
                isExit = true
            }
            else -> isExit = false
        }
    } while (!isExit)
}
fun retirarPausmaioresque10 (jogada: String,count: Int) {
        when {
            jogada[count + 1] == '0' -> tabuleiroNimInicial[10] = ""
            jogada[count + 1] == '1' -> tabuleiroNimInicial[11] = ""
            jogada[count + 1] == '2' -> tabuleiroNimInicial[12] = ""
            jogada[count + 1] == '3' -> tabuleiroNimInicial[13] = ""
            jogada[count + 1] == '4' -> tabuleiroNimInicial[14] = ""
            jogada[count + 1] == '5' -> tabuleiroNimInicial[15] = ""
        }
    }

fun retirarPaus(jogada: String){
    var count = 0
    do {
        if (jogada[count] == '1'&& count != jogada.length -1) {
            retirarPausmaioresque10(jogada,count)
            count++ // Para saltar para proximo numero , exemplo: 1011 , apos fazer o 10 salta para ver o 11
        } else {
            tabuleiroNimInicial[transversao(jogada,count)] = ""
        }
        count++
    } while (count != jogada.length)
}
fun jogo(jogador1: String , jogador2: String) {
    var isExit = false
    do {
        print("\n")
        println("$jogador1 faca a sua jogada , Escolha o/os paus que deseja retirar")
        println("$jogador1 ,caso queria retirar todos os pauzinhos de uma fila deve Escrever : FilaNumero")
        var jogada1 = readLine()!!.toString()
        if (jogada1 == "Fila1" || jogada1 == "Fila2" || jogada1 == "Fila3" || jogada1 == "Fila4") {
            retirarFilas(jogada1)
            println(tabuleiroNim())
        } else {
            retirarPaus(jogada1)
            println(tabuleiroNim())
        }
        if (perder(tabuleiroNimInicial)) {
            println("$jogador2 ganhou um certificado da cisco")
            isExit = true
        } else {
            print("\n")
            println("$jogador2 faca a sua jogada , Escolha o/os paus que deseja retirar")
            println("$jogador2 ,caso queria retirar todos os pauzinhos de uma fila deve Escrever : FilaNumero")
            var jogada2 = readLine()!!.toString()
            if (jogada2 == "Fila1" || jogada2 == "Fila2" || jogada2 == "Fila3" || jogada2 == "Fila4") {
                retirarFilas(jogada2)
                println(tabuleiroNim())
            } else {
                retirarPaus(jogada2)
                println(tabuleiroNim())
            }
            if (perder(tabuleiroNimInicial)) {
                println("$jogador1 ganhou um certificado  da cisco")
                isExit = true
            }
        }
    } while (!isExit)
}

fun nomePlayer(param: String): String {
    println(param)
    var jogador = readLine()!!.toString()
    return jogador
}
fun main () {
    var ciclo = false
    do {
        println(MenuIncialNim())
        var option = readLine()!!.toString()
        if (option == "1") {
            var jogador1 = nomePlayer("Digite o nome do primeiro jogador")
            var jogador2 = nomePlayer("Digite o nome do segundo jogador")
            print("\n")
            println(tabuleiroNim())
            jogo(jogador1,jogador2)
            print("\n")
        } else {
            if(option == "2") {
                ciclo = true
            }
        }
    } while (!ciclo)
}
fun transversao (a: String,posicao: Int): Int {
    var b : Int = a[posicao].toInt()
    return when (b) {
        48 -> 0
        49 -> 1
        50 -> 2
        51 -> 3
        52 -> 4
        53 -> 5
        54 -> 6
        55 -> 7
        56 -> 8
        else -> 9

    }
}