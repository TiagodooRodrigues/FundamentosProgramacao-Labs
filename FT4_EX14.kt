package FT4

fun main() {
    println("Qual o número de horas de trabalho? ")
    val horas = readLine()!!.toInt()
    println("Qual a avaliação? ")
    val avaliacao = readLine()!!.toInt()
    val salarioBase = horas * 30
    val bonus = avaliacao * 3
    val salario = salarioBase + bonus
    println("Salário Base = $salarioBase")
    println("Bónus = $bonus")
    println("Salário = $salario")
}