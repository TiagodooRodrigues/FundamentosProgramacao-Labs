package FT6

import java.time.Year

fun main() {
    println("Introduza o mês (1-12)")
    val mes = readLine()?.toIntOrNull() // ?. parar com o crash quando digito ^D
    if (mes == null || !(mes in 1..12)) { // limitar os mes para 1-12
        println("Mês inválido")
    } else {
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            println("O mês $mes tem 31 dias")
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            println("O mês $mes tem 30 dias")
        } else {
            println("Introduza o ano (ou enter se quiser o ano atual)")
            val ano = readLine()!!.toIntOrNull() ?: Year.now().value // o valor caso seja null vai ser 2020 devido ao elvis operator
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                println("O mês $mes em $ano tem 29 dias")
            } else {
                println("O mês $mes em $ano tem 28 dias")
            }
        }
    }
}
