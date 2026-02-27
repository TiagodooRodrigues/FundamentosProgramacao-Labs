package FT5
fun main () {
    println("Introduza a sua frase: ")
    val frase : String = readLine()!!.toString()
    if (frase[0].toInt() >= 65 && frase[0].toInt() <= 90) {
        if (frase[frase.length -1] == '.' || frase[frase.length -1] == '!' || frase[frase.length -1] == '?') {
            println("Frase correta")
        } else {
            println("Frase incorreta")
        }
    } else {
        println("Frase Incorreta")
    }
}


