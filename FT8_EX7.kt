package FT8

fun escrevePalavraNVezes(palavra: String, Nvezes: Int) {
    var count = 0
    while (count != Nvezes) {
        println(palavra)
        count ++
    }
}
fun main() {
    println("Digite a palavra")
    var palavra = readLine()!!.toString()
    println("Digite o numero de vezes")
    var Nvezes = readLine()!!.toInt()
    escrevePalavraNVezes(palavra,Nvezes)
}