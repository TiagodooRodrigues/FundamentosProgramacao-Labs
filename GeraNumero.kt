fun geraNumero(intervalo: IntRange) = intervalo.random() // funcao pedida pelo stor para fazer random
fun main () {
    var tentativas = 0 // contagem de tentativas
    var numero = geraNumero(1..1000) // aplicar funcao entre 1 a 1000
    var intervalo = (1..1000) // intervalo 1 a 1000
    println("Estou a pensar num numero entre ${intervalo.first} a ${intervalo.last}, Advinha qual!")
    do {
        var palpite = readLine()?.toIntOrNull()
        if (palpite == null || palpite !in intervalo) {
            println("Palpite invalido")
            tentativas += 1
        } else {
            when {
                palpite < numero -> {
                    println("Para cima")
                    tentativas += 1
                }
                palpite > numero -> {
                    println("Para baixo")
                    tentativas += 1
                }
                else -> {
                    tentativas+= 1
                    println("Parabens!Acertaste ao fim de ${tentativas} tentativas")
                }
            }
        }
    } while (palpite != numero)
}
