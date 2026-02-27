package MES
fun main () {
    println("Introduza o mes entre 1 a 12: ")
    val mes = readLine()!!.toInt()
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        println("O mes $mes tem 31 dias")
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        println("O mes $mes tem 30 dias")
    } else {
        println("Introduza o ano")
        val ano = readLine()!!.toInt()
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0 ) {
            println("O mes $mes em $ano tem 29 dias")
        } else {
            println("O mes $mes em $ano tem 28 dias")
        }
    }
}
