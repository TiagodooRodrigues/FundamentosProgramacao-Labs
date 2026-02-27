package FT4

fun main() {
    println("Introduza o mês (1-12): ")
    val mes: Int = readLine()!!.toInt()
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
        println("O mês $mes tem 31 dias")
    } else {
        println("O mês $mes tem 30 dias") }
}
