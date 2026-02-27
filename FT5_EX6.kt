package FT5
fun main () {
    println("Escreve o primeiro numero: ")
    var num1 = readLine()?.toIntOrNull()
    println("Escreve o segundo numero: ")
    var num2 = readLine()?.toIntOrNull()
    if (num1 == null && num2 == null) {
        var num1 = "\u25a1"
        var num2 = "\u25a1"
        println(num1 + num2)
    } else {
        if (num1 == null) {
            var num1 = "\u25a1"
            println(num1 + num2)
        } else {
            if (num2 == null) {
                var num2 = "\u25a1"
                println("$num1$num2")
            } else {
                println("$num1$num2")
            }
        }
    }
}

