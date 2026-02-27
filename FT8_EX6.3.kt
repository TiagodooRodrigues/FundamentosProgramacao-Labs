package FT8
fun escrevenumerocrescente(numeroinicial: Int) {
    var numero = 0
    var contador = 0
    while (contador < 3) {
        numero = numeroinicial + contador
        contador ++
        println(numero)
    }
}
fun main () {
    println("Digite um numero")
    var numeroinicial = readLine()!!.toInt()
    escrevenumerocrescente(numeroinicial)
}
