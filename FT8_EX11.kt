package FT8
fun countletra(palavra: String, letra: Char): Int {
    var count = 0
    for (a in palavra) {
        if (a == letra) {
            count++
        }
    }
    return count
}
fun main () {
    var texto = readLine()!!.toString()
    println(countletra(texto,'a'))
}

