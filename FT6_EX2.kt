package FT6

fun main() {
    println("Introduza um valor em euros")
    val euros = readLine()?.toIntOrNull()
    when (euros){
        null -> println("Valor Invalido")
        else -> {
            println("Introduza uma moeda para fazer a conversão")
            val moeda = readLine().toString()
            var conversao = 0
            when {
                moeda == null || moeda.length != 3 -> println("Moeda Invalida")
                moeda != "GBP" && moeda !="USD" && moeda!="ARS"-> println("Conversao para essa moeda indisponivel")
                else -> {
                    when (moeda) {
                        "GBP" -> {
                            conversao = (euros * 0.89).toInt()
                            println("$euros EUR sao $conversao GBP")
                        }
                        "USD" -> {
                            conversao = (euros * 1.19).toInt()
                            println("$euros EUR sao $conversao USD")
                        }
                        "ARS" -> {
                            conversao = (euros * 94.9618).toInt()
                            println("$euros EUR sao $conversao AR")
                        }
                    }
                }
            }
        }
    }
}