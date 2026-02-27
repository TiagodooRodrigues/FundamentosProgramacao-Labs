package FT8

import kotlin.math.max


fun maior (numero1: Int,numero2: Int, numero3: Int): Int = when {
    numero1 > numero2 && numero1 > numero3 -> numero1
    numero2 > numero1 && numero2 > numero3 -> numero2
    else -> numero3
}
fun main () {
    var numero1 = readLine()!!.toInt()
    var numero2 = readLine()!!.toInt()
    var numero3 = readLine()!!.toInt()
    println(maior(numero1,numero2,numero3))
}