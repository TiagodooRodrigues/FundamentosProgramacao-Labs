package Formulas
fun geranumero(intervalo: IntRange) = intervalo.random()
fun main () {
    var tentativas = 0
    var intervalo = (1..2)
    var numero = intervalo.random() // random(intervalo)
    println("Estou a pensar num numero de ${intervalo.first} a ${intervalo.last} , Advinha qual!")
    var palpite  = readLine()?.toIntOrNull()
    tentativas += 1
    when {
        palpite == null -> println("Palpite invalido")
        palpite !in intervalo -> println("Palpite invalido")
        palpite < numero -> println("Para cima")
        palpite > numero -> println("Para baixo")
        else -> println("Parabens!Acertaste ao fim de ${tentativas} tentativas")
    }
}