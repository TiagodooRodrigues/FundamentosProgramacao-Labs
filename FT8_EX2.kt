package FT8

fun escrevePalavra3Vezes(palavra: String) {
    println(palavra)
    println(palavra)
    println(palavra)
}
fun main() {
    var palavra = readLine()!!.toString()
    escrevePalavra3Vezes(palavra)
}