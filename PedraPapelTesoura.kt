package Jogos

fun main() {
    println("Bem-vindo ao jogo popular “Pedra, Papel, Tesoura” ")
    println("Jogador 1 faça a sua jogada Pedra, Papel, Tesoura”: ")
    val Jogador1 : String = readLine()!!.toString()
    println("Jogador 2 faça a sua jogada Pedra, Papel, Tesoura”: ")
    val Jogador2 : String = readLine()!!.toString()
    if (Jogador1 == Jogador2) {
        println("Empate")
    } else {
        if ((Jogador1=="Papel" && Jogador2 == "Pedra") || (Jogador1 == "Tesoura" && Jogador2 == "Papel") || (Jogador1 == "Pedra" && Jogador2 == "Tesoura"))
            println("O vencedor é o Jogador 1")
        else {
            println("O vencedor é o Jogador 2")
        }
    }
}
