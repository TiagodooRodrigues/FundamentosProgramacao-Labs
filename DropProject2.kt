package FT5

fun main () {
    println("Introduza uma palavra:")
    val a: String? = readLine()
    println("Introduza uma palavra:")
    val b: String? = readLine()
    if (a == "" && b == "") {
        println("As palavras nao terminam nem comecam com o mesmo caracter")
    } else {
        if (a != null && b != null) {
            if (a[a.length - 1] == b[b.length - 1] && a[0] == b[0]) {
                println("As palavras terminam e comecam com o mesmo caracter")
            }
            if (a[a.length - 1] != b[b.length - 1] && a[0] != b[0]) {
                println("As palavras nao terminam nem comecam com o mesmo caracter")
            }
            if (a == "" && b == "") {
                println("As palavras nao terminam nem comecam com o mesmo caracter")
            }
        }
    }
}