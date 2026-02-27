package FT4

fun main() {
    println("Introduza um número")
    val x = readLine()!!.toInt()
    if (x == 0) {
        print("O número $x é zero")
    } else {
        if (x < 0) {
            print("O número $x é negativo")
        } else {
            print("O número $x é positivo")
        }
    }
}