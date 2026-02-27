package FT8

fun escrevepalavra3Vezes(palavra: String) {
    var count = 0
    while (count < 3) {
        println(palavra)
        count = count + 1
    }
}

fun main() {
    println("Digite a palavra")
    var palavra = readLine()!!.toString()
    escrevepalavra3Vezes(palavra)
}