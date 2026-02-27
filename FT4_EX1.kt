package FT4

fun main () {
    println("Qual é o primeiro número?")
    val x: Int = readLine()!!.toInt()
    println("Qual é o segundo número?")
    val y: Int = readLine()!!.toInt()
    if (x == y) {
        print("Os numeros $x e $y sao iguais")
    } else {
        if (x > y) {
            print("O maior número é o $x ")
        } else {
            print("O maior número é o $y")
        }
    }
}