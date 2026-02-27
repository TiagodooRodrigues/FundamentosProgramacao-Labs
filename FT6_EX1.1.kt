package FT6

fun main () {
    println("Introduza o mes entre 1 a 12: ")
    val mes = readLine()?.toIntOrNull() // ?. parar com o crash quando digito ^D
    when (mes) {
        null -> println("Mes Invalido")
        !in 1..12 -> println("Mes Invalido")
        1,3,5,7,8,10,12 -> println("O mes $mes tem 31 dias")
        4,6,9,11-> println("O mes $mes tem 30 dias")
        else -> {
            println("Introduza o ano (ou enter caso queira o ano atual)")
            val ano = readLine()!!.toIntOrNull() ?: 2020
            when {
                ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0 -> println("O mes $mes em $ano tem 29 dias")
                else -> println("O mes $mes em $ano tem 28 dias")
            }
        }
    }
}
