package FT5
fun main () {
    println("Escreve o primeiro numero: ")
    val num1 = readLine()?.toIntOrNull() ?: "\u25a1"
    println("Escreve o segundo numero: ")
    val num2 = readLine()?.toIntOrNull() ?: "\u25a1"
    println("$num1$num2")
}
