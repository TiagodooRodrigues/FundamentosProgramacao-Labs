fun main () {
    var ciclo = true
    do {
        print("Prima enter para lancar o dado (-1 para terminar)")
        var dado = readLine()?.toIntOrNull()
        var intervalo = 1..6
        when {
            dado == null -> println(intervalo.random())
            dado == -1 -> ciclo = false
            else -> ciclo = true
        }
    } while (ciclo)
}