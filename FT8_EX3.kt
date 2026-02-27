package FT8

fun escreveNumeroCrescente(numeroinicial: Int) {
    println(numeroinicial)
    println(numeroinicial + 1)
    println(numeroinicial+ 2)
}
fun main () {
    println("Digite um numero")
    var numeroinicial = readLine()!!.toInt()
    escreveNumeroCrescente(numeroinicial)
}
