package FT4

fun main() {
    println ("Introduza o numero")
    val numero = readLine()!!.toInt()
    val tipo = if (numero % 2 == 0) "Par" else "Ímpar"
    println("O numero $numero e $tipo")
}