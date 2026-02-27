package FT7
fun primeiraLetra(texto: String) : Char = texto[0]
fun ultimaLetra(texto: String): Char = texto[texto.length-1]
fun comecaComMaiuscula(texto: String): Boolean = texto[0].toInt() in 65..90
fun palavraGrande(palavra: String): Boolean = palavra.length > 8
fun duplicaPrimeiraLetra(texto: String): String = texto + texto[0]
fun main () {
    val resultado = primeiraLetra("Modesto")
    val resultado2 = ultimaLetra("Betclic")
    val resultado3 = comecaComMaiuscula("Ganhou")
    val resultado4 = palavraGrande("Maradona")
    val resultado5 = duplicaPrimeiraLetra("Curso")
    println("$resultado\n$resultado2\n$resultado3\n$resultado4\n$resultado5")
}