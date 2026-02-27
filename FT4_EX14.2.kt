package FT4

fun main() {
    println("Qual o número de horas de trabalho? ")
    val horas = readLine()!!.toInt()
    println("Qual a avaliação? ")
    val avaliacao = readLine()!!.toInt()
    val salarioBase = horas * 30
    var bonus = 0
    if (avaliacao >= 3){
         bonus = 2 * avaliacao
    } else {
         bonus = (0.5 * avaliacao).toInt()
    }
    val salario = salarioBase + bonus
    println("Salário Base = $salarioBase")
    println("Bónus = $bonus")
    println("Salário = $salario")
}