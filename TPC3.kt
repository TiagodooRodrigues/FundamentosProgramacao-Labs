fun main () {
    val palavras = arrayOfNulls<String>(7)
    println("Introduza 7 palavras")
    var posicao = 0
    do {
        palavras[posicao] = readLine()!!.toString()
        posicao++
    } while (posicao < palavras.size)
    println("De tras para a frente")
    var contadorPalavras = 0
    do {
        posicao -= 1
        if (palavras[posicao]!!.length > 3 ) {
            contadorPalavras++
            println(palavras[posicao])
        }
    } while (posicao > 0)
    print("Escreveu $contadorPalavras palavras")
}