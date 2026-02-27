package FT8

fun main () {
    println("Introduza um numero")
    var numero1 = readLine()!!.toInt()
    var soma = numero1
    var count = 1
    do {
        println("Introduza um numero")
        var numero2 = readLine()!!.toInt()
        if (numero2 >= 0) {
            count ++
            soma = soma + numero2
            numero1 = numero2
        } else { // Ultimo  numero sera negativo e nao conta para a soma entre positivos
            println("Foram lidos $count numeros com soma = $soma")
            break
        }
    } while (true)
}