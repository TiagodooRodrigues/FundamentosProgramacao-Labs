package FT5
fun main () {
    println("Introduza uma palavra: ")
    val str : String = readLine().toString()
    if (str.length < 3) {
        println("A palavra $str é curta")
    } else {
        if (str.length >= 3 && str.length <= 6 ) {
            println("A palavra \"$str\" é média ")
        } else {
            println("A palavra \"$str\" é longa ")
        }
    }
}
