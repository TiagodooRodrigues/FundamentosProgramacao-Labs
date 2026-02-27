package FT5
fun main () {
    println("Introduza o mes entre 1 a 12: ")
    val mes = readLine()?.toIntOrNull() // ?. parar com o crash quando digito ^D
    if (mes == null || mes <1 || mes > 12){ // limitar os mes para 1-12
        println("Mes Invalido")
    }
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        println("O mes $mes tem 31 dias")
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
        println("O mes $mes tem 30 dias")
    } else {
        println("Introduza o ano (ou enter caso queira o ano atual)")
        val ano = readLine()!!.toIntOrNull() ?: 2020 // o valor caso seja null vai ser 2020 devido ao elvis operator
            if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
                println("O mes $mes em $ano tem 29 dias")
            } else {
                println("O mes $mes em $ano tem 28 dias")
            }
        }
    }