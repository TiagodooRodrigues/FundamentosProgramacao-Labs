fun pedeEvalidaSegundaLetra (primeiraLetra: String) {
    var ciclo = true
    do {
        println("Introduza a mesma letra")
        var letra = readLine()
        if (letra == primeiraLetra) {
            println("Parabens , Vou voltar ao incio")
            ciclo = false
        } else {
            println("Errado")
        }
    } while (ciclo)
}

fun main () {
    var ciclo = true
    do{
        println("Introduza uma letra")
        var letra: String?  = readLine()
        if (letra == "") {
            false
            ciclo = false
        } else {
            if (letra != null) {
                pedeEvalidaSegundaLetra(letra)
            }
        }
    } while (ciclo)
}