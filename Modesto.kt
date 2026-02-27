fun main () {
    //Inicio
    var contador = 1
    var n = readLine()!!.toInt()
    while ( n != contador) {
        if ( n % contador == 0) {
            println(contador)
        }
        contador++
    }
    println(n)
}