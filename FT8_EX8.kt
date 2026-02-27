package FT8

import kotlin.system.exitProcess

fun numeroparouimpar(numero: Int) {
    when {
        numero % 2 == 0 -> println("Par")
        else -> println("Impar")
    }
}
fun main () {
    println("Introduza um numero")
    do {
        var numero = readLine()!!.toInt()
        if (numero >= 0) {
            numeroparouimpar(numero)
            println("Introduz um numero")
        } else {
            println("Terminar")
            break
        }
    } while (true)
}
