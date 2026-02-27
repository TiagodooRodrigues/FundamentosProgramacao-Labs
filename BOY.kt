fun constroiFigura(largura: Int) : String {
    val cinzento = '\u2B1C'
    val preto = '\u2B1B'
    var resultado = ""
    for (linha in 1..largura) {
        for (coluna in 1..largura) {
            if (linha % 2 == 0) resultado+=cinzento else resultado+=preto
        }
        resultado+= '\n'
    }
    return resultado
}
fun tabuleiro(linha: Int, coluna: Int) : String {
    val esc: String = Character.toString(27)
    val startWhite = "$esc[30;30m"
    val startBlue = "$esc[30;44m"
    val startGrey = "$esc[30;47m"
    val end = "$esc[0m"
    var tabuleiro = ""
    for (linhas in 1..linha) {
        for (colunas in 1..coluna) {
            if (linhas % 2 == 1) {
                if (colunas % 2 == 0) {
                    tabuleiro += "$startGrey   $end"
                } else tabuleiro += "$startWhite   $end"
            } else {
                if (colunas % 2 == 0) {
                    tabuleiro += "$startWhite   $end"
                } else tabuleiro += "$startGrey   $end"
            }
        }
        tabuleiro+= '\n'
    }
    return tabuleiro
}
fun main () {
    println(tabuleiro(10,10))
}