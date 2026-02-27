package FT8

fun escreveolaNVezes(palavra: String,Nvezes : Int) {
    var count = 0
    while (count < 3) {
        println(palavra)
        count = count + 1
    }
}

fun main() {
    println("Digite a palavra")
    var palavra = readLine()!!.toString()
    escreveolaNVezes(palavra,0)
}