package FT5

fun main() {
    println("Digite o primeiro numero: ")
    var num1: Int = readLine()!!.toInt()
    println("Digite o segundo numero ")
    var num2: Int = readLine()!!.toInt()
    if (num1 == num2) {
        println("Digite o terceiro numero ")
        var num2: Int = readLine()!!.toInt()
        if (num2 == num1) {
            println("Sao Iguais")
        }
        if (num2 > num1) {
            println("O maior numero $num2")
        } else {
            println("O maior numero $num1")
        }
    }
    if (num1 > num2) {
        println("Digite o terceiro numero ")
        var num2: Int = readLine()!!.toInt()
        if ( num1 > num2 ) {
            println("O maior numero $num1")
        } else {
            println("O maior numero $num2")
        }
    } else {
        if (num2 > num1) {
            println("Digite o terceiro numero ")
            var num1: Int = readLine()!!.toInt()
            if (num1 > num2) {
                println("O maior numero $num1")
            } else {
                println("O maior numero $num2")
            }
        }
    }
}