fun buildBoard(numColumns: Int, numLines: Int, showLegend: Boolean= false, showPieces: Boolean = false,
               pieces: Array<Pair<String, String>?>): String {
    val esc: String = Character.toString(27) //variavel com informacao das cores
    val startWhite = "$esc[30;30m" // pintar preto
    val startBlue = "$esc[30;44m"  // pintar azul
    val startGrey = "$esc[30;47m" // pintar cinzento
    val end = "$esc[0m" // terminar pintura
    var tabuleiro = "" // tabuleiro
    val fundoAzul = "$startBlue   $end"
    var contadorPosicoes: Int = 0 // contador de arrays

    if (showLegend) { // se o tabuleiro tiver legenda
        tabuleiro += fundoAzul // pinta bloco inicial azul
        for (letter in 0 until numColumns) { // Recorrer as letras da legenda usando valor ASCII
            tabuleiro += "$startBlue ${(letter + 65).toChar()} $end" // adicionar letras da legenda
        }
        tabuleiro += "$fundoAzul\n" // pinta bloco final azul e passa para proxima linha abaixo
    }
    for (line in 1..numLines) {
        for (column in 1..numColumns) {
            if (showLegend && column == 1) { // se for com legenda e for a primeira coluna
                tabuleiro += "$startBlue ${line} $end" // pinta bloco azul com respetivo numero de linhas
            }
            var visualPiece = " " // variavel que coloca as pecas no tabuleiro
            if (pieces[contadorPosicoes] != null) {  // verifica no array se a primeira contem peca
                val piece = pieces[contadorPosicoes]!!.first // ve a peca
                val color = pieces[contadorPosicoes]!!.second // ve a cor da peca
                visualPiece = if (showPieces) { // se utilizado quiser pecas do tabuleiro
                    convertStringToUnicode(piece, color) // converte esse pair para peca pintada
                } else {
                    " " // sem pecas
                }
            }
            tabuleiro += if ((line + column) % 2 == 0) { // formula da cor do teclado
                "$startWhite $visualPiece $end"
            } else {
                "$startGrey $visualPiece $end"
            }
            contadorPosicoes++ //contador de arrays
        }
        if (showLegend) { // se tiver legenda
            tabuleiro += fundoAzul // pinta um bloco final azul
        }
        tabuleiro += "\n" // passa proxima linha
    } // acaba quando pintar o tabuleiro

    if (showLegend) { // se tiver legenda
        for (column in 0..numColumns + 1) { // pinta ate ultima coluna mais um bloco que representa linha final azul
            tabuleiro += fundoAzul // pintar linha azul final
        }
        tabuleiro += "\n" // dar espaco para comecar jogo
    }
    return tabuleiro // tabuleiro final
}
fun createInitialBoard(numColumns:Int, numLines: Int): Array<Pair<String,String>?> {
//array com informacao do tabuleiro inicial
    return when {
        numColumns == 4 && numLines == 4 -> arrayOf(null,null,Pair("T","b"), Pair("B","b"),
            null,null,null,null,
            null,null,null,null,
            Pair("T","w"),Pair("Q","w"),null,null) // tabuleiro 4x4

        numColumns == 6 && numLines == 6 -> arrayOf(Pair("H","b"), Pair("B","b"), Pair("Q","b"),Pair("K","b"),
            Pair("B","b"),Pair("T","b"),
            Pair("P","b"), Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            Pair("P","w"), Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),
            Pair("H","w"),Pair("B","w"),Pair("K","w"), Pair("Q","w"),Pair("B","w"),Pair("T","w")) // tabuleiro 6x6

        numColumns == 6 && numLines == 7 -> arrayOf(Pair("T","b"),Pair("B","b"),Pair("Q","b"),Pair("K","b"),
            Pair("B","b"),Pair("H","b"),
            Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            null,null,null,null,null,null,
            Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),
            Pair("T","w"),Pair("B","w"),Pair("K","w"),Pair("Q","w"),Pair("B","w"),Pair("H","w")) // tabuleiro 6x7

        numColumns == 7 && numLines == 7 -> {
            arrayOf(
                Pair("T","b"),Pair("H","b"),Pair("B","b"),Pair("K","b"), Pair("B","b"),Pair("H","b"),Pair("T","b"),
                Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),
                null,null,null,null,null,null,null,
                null,null,null,null,null,null,null,
                null,null,null,null,null,null,null,
                Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),
                Pair("T","w"),Pair("H","w"),Pair("B","w"),Pair("K","w"),Pair("B","w"),Pair("H","w"),Pair("T","w"))
        } // tabuleiro 7x7

        numColumns == 8 && numLines == 8 -> arrayOf(Pair("T","b"),Pair("H","b"),Pair("B","b"),Pair("Q","b"),
            Pair("K","b"),Pair("B","b"),Pair("H","b"),Pair("T","b"),
            Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),Pair("P","b"),
            Pair("P","b"),
            null,null,null,null,null,null,null,null,
            null,null,null,null,null,null,null,null,
            null,null,null,null,null,null,null,null,
            null,null,null,null,null,null,null,null,
            Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),Pair("P","w"),
            Pair("P","w"),
            Pair("T","w"),Pair("H","w"),Pair("B","w"),Pair("K","w"),Pair("Q","w"),Pair("B","w"),Pair("H","w"),
            Pair("T","w")) //tabuleiro 8x8
        else -> emptyArray() // fora das opcoes tabuleiros iniciais
    }
}
fun createTotalPiecesAndTurn(numColumns: Int, numLines: Int): Array<Int?> {
//Array (Pecas Brancas,PecasPretas,TurnoAtual)
    return when {
        numColumns == 4 && numLines == 4 -> arrayOf(2,2,0)
        numColumns == 6 && numLines == 6 -> arrayOf(12,12,0)
        numColumns == 6 && numLines == 7 -> arrayOf(12,12,0)
        numColumns == 7 && numColumns == 7 -> arrayOf(14,14,0)
        numColumns == 8 && numColumns == 8 -> arrayOf(16,16,0)
        else -> emptyArray()
    }
}
fun convertStringToUnicode(piece: String, color: String): String { // Converter Pair(String,String) numa Peca
    var peca = ""
    when (Pair(piece,color)) {
        Pair("P","w") -> peca = "\u2659" //peao
        Pair("P","b") -> peca = "\u265F"
        Pair("H","w") -> peca = "\u2658" // cavalo
        Pair("H","b") -> peca = "\u265E"
        Pair("K","w") -> peca = "\u2654" // Rei
        Pair("K","b") -> peca = "\u265A"
        Pair("T","w") -> peca = "\u2656" //Torre
        Pair("T","b") -> peca = "\u265C"
        Pair("B","w") -> peca = "\u2657" // Bispo
        Pair("B","b") -> peca = "\u265D"
        Pair("Q","w") -> peca = "\u2655" // Rainha
        Pair("Q","b") -> peca = "\u265B"
        else -> " "
    }
    return peca
}
fun getCoordinates (readText: String?): Pair<Int, Int>? { // obter coordenadas do tabuleiro a partir do Pair(x,y)
    var contadorColunas = 1 // Conta de A->Z -> colunas
    var contadorLinhas = 1 // Conta de 1-8 -> linhas
    var letra = 'a'
    var numero = '1'
    var resultado = ""
    var coordenadas= Pair(contadorLinhas, contadorColunas)
    if (readText != null && readText.length > 1 &&
        readText[0] in '1'..'9'&& (readText[1] in 'A'..'Z'|| readText[1] in 'a'..'z')) {
        while (resultado != readText) {
            while (numero != readText[0]) {
                numero++
                contadorLinhas++
            }
            if (readText[1] in 'A'..'Z') {
                letra = 'A'
                while (letra != readText[1]) {
                    letra++
                    contadorColunas++
                }
            } else {
                while (letra != readText[1]) { // para as letras minusculas
                    letra++
                    contadorColunas++
                }
            }
            resultado = "$numero$letra"
        }
        coordenadas = Pair(contadorLinhas,contadorColunas)
        return coordenadas
    }
    return null
}
fun checkRightPieceSelected(pieceColor:String, turn: Int): Boolean { // jogador deve selecionar a sua peca
    return when {
        pieceColor == "b" && turn == 1 ->true
        pieceColor == "w" && turn == 0 -> true
        else -> false
    }
}
fun isCoordinateInsideChess (coord: Pair<Int, Int>,numColumns:Int,numLines: Int):Boolean {
// cordenadas estao dentro do tabuleiro
    return when {
        numColumns == 4 && numLines == 4 && coord.first in 1..4 && coord.second in 1..4 -> true
        numColumns == 6 && numLines == 6 && coord.first in 1..6 && coord.second in 1..6 -> true
        numColumns == 6 && numLines == 7 && coord.first in 1..7 && coord.second in 1..6 -> true
        numColumns == 7 && numLines == 7 && coord.first in 1..7 && coord.second in 1..7 -> true
        numColumns == 8 && numLines == 8 && coord.first in 1..8 && coord.second in 1..8 -> true
        else -> false
    }
}
fun isValidTargetPiece(currentSelectedPiece : Pair<String, String>,currentCoord : Pair<Int, Int>,
                       targetCoord : Pair<Int, Int>, pieces : Array<Pair<String, String>?>, numColumns: Int,
                       numLines: Int): Boolean {
    return when (currentSelectedPiece) {
        Pair("H","b") , Pair("H","w") -> isHorseValid(currentCoord,targetCoord,pieces,numColumns,numLines) //
        Pair("T","b") , Pair("T","w") -> isTowerValid(currentCoord,targetCoord,pieces,numColumns,numLines) //
        Pair("B","b") , Pair("B","w") -> isBishopValid(currentCoord,targetCoord,pieces,numColumns,numLines)
        // valida o movimento do tipo de peca a partir das suas respectivas funcoes
        Pair("Q","b") , Pair("Q","w") -> isQueenValid(currentCoord,targetCoord,pieces,numColumns,numLines) //
        Pair("K","b") , Pair("K","w") -> isKingValid(currentCoord,targetCoord,pieces,numColumns,numLines) //
        Pair("P","b") , Pair("P","w") -> isKnightValid(currentCoord,targetCoord,pieces,numColumns,numLines) //
        else -> false
    }
}
fun isHorseValid(currentCoord: Pair<Int, Int>,targetCoord : Pair<Int, Int>,pieces : Array<Pair<String, String>?>,
                 numColumns: Int, numLines: Int): Boolean {
    return if (Math.abs(currentCoord.first - targetCoord.first) == 1 &&
        Math.abs(currentCoord.second - targetCoord.second) == 2 ||
        Math.abs(currentCoord.first - targetCoord.first) == 2 &&
        Math.abs(currentCoord.second - targetCoord.second) == 1) {
        val coordenandasAtuais = pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
        val coordenandasFinais = pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1]
        coordenandasFinais == null || coordenandasFinais.second != coordenandasAtuais!!.second // true
    } else {
        false
    }
}
fun isKingValid(currentCoord: Pair<Int, Int>,targetCoord : Pair<Int, Int>,pieces: Array<Pair<String, String>?>,
                numColumns: Int,numLines: Int):Boolean {
    return if ((targetCoord.first in currentCoord.first -1 .. currentCoord.first +1) &&
        (targetCoord.second in currentCoord.second -1 .. currentCoord.second + 1) ) {
        val coordenandasAtuais = pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
        val coordenandasFinais = pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1]
        coordenandasFinais == null || coordenandasFinais.second != coordenandasAtuais!!.second
    } else {
        false
    }
}
fun isTowerValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,
                 numColumns: Int,numLines: Int):Boolean {
    return if (targetCoord.second == currentCoord.second || targetCoord.first == currentCoord.first) {
    val coordenandasAtuais = pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
    val coordenandasFinais = pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1]
        coordenandasFinais == null || coordenandasFinais.second != coordenandasAtuais!!.second
    } else {
        false
    }
}

fun isBishopValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,
                  numColumns: Int,numLines: Int): Boolean {
    return if (targetCoord.first != currentCoord .first && targetCoord.second != currentCoord.second) {
        val coordenandasAtuais = pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
        val coordenandasFinais = pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1]
        coordenandasFinais == null || coordenandasFinais.second != coordenandasAtuais!!.second
    } else {
        false
    }
}

fun isQueenValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,
                 numColumns: Int,numLines: Int):Boolean {
    return (isTowerValid(currentCoord, targetCoord, pieces, numColumns, numLines) || isBishopValid(currentCoord,
        targetCoord, pieces, numColumns, numLines))
}
fun isKnightValid(currentCoord: Pair<Int, Int>,targetCoord: Pair<Int, Int>,pieces: Array<Pair<String, String>?>,
                  numColumns: Int,numLines: Int):Boolean {
    return if(currentCoord.second == targetCoord.second &&
        targetCoord.first in currentCoord.first - 1..currentCoord.first + 1 ) {
        val coordenandasAtuais = pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
        val coordenandasFinais = pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1]
        coordenandasFinais == null || coordenandasFinais.second != coordenandasAtuais!!.second
    } else {
        false
    }
}

/*fun contadorArrays(numColumns: Int , numLines: Int,coord: Pair<Int, Int>? ) : Int {
    var contador = 0
    if (coord != null ) {
        for (lines in 1..numLines) {
            for (colunas in 1..numColumns) {
                if (lines == coord.first && colunas == coord.second) {
                    return contador
                } else contador++
            }
        }
    }
    return contador
}
 */

fun movePiece( pieces : Array<Pair<String, String>?>, numColumns: Int, numLines: Int, currentCoord: Pair<Int, Int>,
               targetCoord: Pair<Int, Int>, totalPiecesAndTurn: Array<Int>): Boolean {
    val currentPiece = pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
    val targetPiece = pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1]
        if (isValidTargetPiece(currentPiece!!, currentCoord, targetCoord, pieces, numColumns, numLines)) {
             return when {
                currentPiece.second == "b" || currentPiece.second == "w" && targetPiece == null -> {
                    pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1] =
                        pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
                    pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1] = null
                    true
                }
                currentPiece.second == "b" && targetPiece != null -> {
                    pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1] =
                        pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
                    totalPiecesAndTurn[2] = 0 // Mudanca Turno
                    totalPiecesAndTurn[0] = totalPiecesAndTurn[0]!! - 1 // Tirar uma peca branca
                     true
                }
                currentPiece.second == "w" && targetPiece != null -> {
                    pieces[numColumns * (targetCoord.first - 1) + targetCoord.second - 1] =
                        pieces[numColumns * (currentCoord.first - 1) + currentCoord.second - 1]
                    totalPiecesAndTurn[2] = 1 // Mudanca Turno
                    totalPiecesAndTurn[0] = totalPiecesAndTurn[0]!! - 1 // Tirar uma peca branca
                    true
                }
                else -> false
            }
        } else {
           return false
        }
    }
fun startNewGame (whitePlayer: String, blackPlayer: String, pieces : Array<Pair<String, String>?>,
                  totalPiecesAndTurn : Array<Int?>,numColumns: Int,numLines: Int, showLegend: Boolean= false,
                  showPieces: Boolean = false) {
    val chamaArray = createTotalPiecesAndTurn(numColumns,numLines)
    val perguntaInicio = "$whitePlayer, choose a piece (e.g 2D).\n" +
            "Menu-> m;" +
            "\n"
    val perguntaInicio2 = "$whitePlayer, choose a target piece (e.g 2D).\n" +
            "Menu-> m;" +
            "\n"
    println(buildBoard(numColumns, numLines,showLegend,showPieces,createInitialBoard(numColumns,numLines)))
    do {
        println(perguntaInicio)
            var coordenadasInseridas1 = readLine()
            while (getCoordinates(coordenadasInseridas1) == null ||
                pieces[numColumns * (getCoordinates(coordenadasInseridas1)!!.first - 1) +
                        getCoordinates(coordenadasInseridas1)!!.second - 1] == null) {
                println(erro)
                println(perguntaInicio)
                coordenadasInseridas1 = readLine()
            }
            while (!isCoordinateInsideChess(getCoordinates(coordenadasInseridas1)!!, numColumns, numLines)) {
                println(erro)
                println(perguntaInicio)
                coordenadasInseridas1 = readLine()
            }
            val coordenandasAtuais1 = getCoordinates(coordenadasInseridas1)!!
            val pecaCoordenandasAtuais1 =
                pieces[numColumns * (coordenandasAtuais1.first - 1) + coordenandasAtuais1.second - 1]
            while (!checkRightPieceSelected(pecaCoordenandasAtuais1!!.second, chamaArray[2]!!)) {
                println(erro)
                println(perguntaInicio)
                coordenadasInseridas1 = readLine()
            }
            println(perguntaInicio2)
            var coordenadasInseridas2 = readLine()
            while (getCoordinates(coordenadasInseridas2) == null) {
                println(erro)
                coordenadasInseridas2 = readLine()
            }
            while (!isCoordinateInsideChess(getCoordinates(coordenadasInseridas2)!!, numColumns, numLines)) {
                println(erro)
                println(perguntaInicio2)
                coordenadasInseridas2 = readLine()
            }
            if (movePiece(
                    pieces,
                    numColumns,
                    numLines,
                    getCoordinates(coordenadasInseridas1)!!,
                    getCoordinates(coordenadasInseridas2)!!,
                    totalPiecesAndTurn as Array<Int>)) {
                println(buildBoard(numColumns, numLines, showLegend, showPieces, pieces))
            } else {
                println(erro)
            }
    } while (chamaArray[0]!= 0 || chamaArray[1] != 0)
}
fun buildMenu(): String {  // String Inicio do  -> escreve o menu inicial do jogo
    return """1-> Start New Game;
2-> Exit Game.
"""
}
fun checkIsNumber(number: String): Boolean = when { // verifica se e um numero
    number.toIntOrNull() == null -> false // transforma em null a tentativa de transformar em numero
    else -> true
}
fun checkName(number: String): Boolean = when { // verificar se e um nome
    number[0].toInt() in 65..90 && " " in number &&
            number[posicaoespaco(' ',number) + 1].toInt() in 65..90-> true //
    // a letra a seguir ao espaco tem ser maiscula
    else -> false
} // Tem de ter letra maiscula na primeira letre e letra maiscula no apelido

fun showChessLegendOrPieces(message:String): Boolean? = when (message){ // pergunta se tem legenda e pecas
    "Y","y"-> true
    "N","n"-> false
    else -> null
}
val erro = "Invalid response." // variavel global

fun callPlayer(param : String): String{ // chama o jogador e usa o checkname
    var isValid = false
    var jogador = ""
    val pergunta = param
    do {
        println(pergunta)
        jogador = readLine()!!.toString()
        if (checkName(jogador) == false) {
            println(erro)
        } else {
            isValid = true
        }
    } while (isValid == false)

    return jogador
}

fun callColumns(param : String): Int { // valida as colunas
    var isValid = false
    var columns: String = ""
    do {
        println(param)
        columns = readLine()!!.toString()
        if (checkIsNumber(columns) == false) {
            println(erro)
        } else {
            if (columns.toInt() < 4 || columns.toInt() > 8) {
                println(erro)
            } else {
                isValid = true
            }
        }
    } while (isValid == false)
    return columns.toInt()
}
fun callLine(param: String) : Int { // valida as linhas
    var isValid = false
    var lines: String = ""
    val pergunta = param
    val perguntaColunas = "How many chess columns?\n"
    do {
        println(pergunta)
        lines = readLine()!!.toString()
        if (checkIsNumber(lines) == false) {
            println(erro)
            callColumns(perguntaColunas)
        } else {
            if (lines.toInt() < 4 || lines.toInt() > 8) {
                println(erro)
                callColumns(perguntaColunas)
            } else isValid = true
        }
    } while (isValid == false)
    return lines.toInt()
}
fun callLegendORpieces(param: String):Boolean {
    var isValid = false
    var legendasOuPecas: String
    var valorbooleano = false
    do {
        println(param)
        legendasOuPecas = readLine()!!.toString()
        if (showChessLegendOrPieces(legendasOuPecas) == null) {
            println(erro)
        } else {
            valorbooleano = showChessLegendOrPieces(legendasOuPecas) == true
            isValid = true
        }
    } while (isValid == false)
    return valorbooleano
}

fun startGame(){  // Inicializar o Jogo
    var isExit = false
    do {
        println(buildMenu())
        val escolhadomenu = readLine()!!.toString()
        if (escolhadomenu == "1") {
            val whitePlayer = callPlayer("First player name?\n")
            val blackPlayer = callPlayer("Second player name?\n")
            val columns = callColumns("How many chess columns?\n")
            val lines = callLine("How many chess lines?\n")
            val legends = callLegendORpieces("Show legend (y/n)?\n")
            val pieces = callLegendORpieces("Show pieces (y/n)?\n")
            startNewGame(whitePlayer,blackPlayer,createInitialBoard(columns,lines),
                createTotalPiecesAndTurn(columns,lines),columns,lines,legends,pieces)
        } else {
            if (escolhadomenu == "2") {
                isExit= true
            }
        }
    } while (!isExit)
}

fun posicaoespaco(letra : Char, palavra: String): Int { // Encontra a posicao do espaco do nome de jogador
    var count = 0
    if ( letra in palavra) {
        while (palavra[count] != letra) {
            count ++
        }
    }
    return count
}

fun main() {
    println("Welcome to the Chess Board Game!")
    startGame()
}