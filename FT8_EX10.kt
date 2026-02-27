package FT8

fun main () {
    println("Introduz um numero inteiro positivo")
    var numero1 = readLine()!!.toInt()
    var soma = numero1
    var count = 2
    do {
        println("Introduz um numero inteiro positivo")
        var numero2 = readLine()!!.toInt()
        if (numero2 != numero1 * 2) {
            count ++
            soma += numero2
            numero1 = numero2
        } else {
            soma += numero2
            println("Foram lidos $count numeros cuja a soma é $soma")
            break
        }
    } while (true)
}