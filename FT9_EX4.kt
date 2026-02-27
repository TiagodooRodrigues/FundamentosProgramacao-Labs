package FT9
fun tabuada (numero: Int) {
    var count = 1
    var multiplicacao = 0
    while (count <= 10) {
        multiplicacao = numero * count
        println("$numero x $count = $multiplicacao ")
        count++
    }
}
fun main () {
    println("Introduza um numero de 1 a 10")
    do{
        var numeropedido = readLine()?.toIntOrNull()
        if ( numeropedido == null || numeropedido !in 1..10) {
            println("Número inválido. Tente novamente")
        } else {
            tabuada(numeropedido)
        }
    } while (true)
}