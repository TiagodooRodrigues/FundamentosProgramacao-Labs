package FT7

import java.time.Year
fun anobissexto (ano : Int) = ((ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0))
fun main() {
    println("Introduza o ano (ou enter se quiser o ano atual)")
    val ano = readLine()!!.toIntOrNull() ?: Year.now().value // o valor caso seja null vai ser 2020 devido ao elvis operator
        if (anobissexto(ano)) {
            println("O ano $ano é bissexto")
        } else {
            println("O ano $ano não é bissexto")
        }
}
