fun temKQJ(carta1: String, carta2:String): Boolean = when {
    carta1 == "K"|| carta1 == "Q"|| carta1 == "J"-> true  //Carta1 for K,Q,J
    carta2 == "K"|| carta2 == "Q" || carta2 == "J"-> true //Carta2 for K,Q,J
    else -> false
}
fun pontosAs(carta: String, temKQJ: Boolean): Int = when {
    carta == "A" && temKQJ == true ->11 // A passa ser 11
    carta == "A" && temKQJ == false ->1 // A passa ser 1
    else -> 0  // A cartas nao tem A
}
fun pontosKQJ(carta: String): Int = when(carta) {
    "K","Q","J"->10
    else -> 0
    }
fun outrosPontos(carta: String): Int = when (carta) {
    "2"->2
    "3"->3
    "4"->4
    "5"->5
    "6"->6
    "7"->7
    "8"->8
    "9"->9
    "10"->10
    else->0
}
fun pontosTotais(carta1:String, carta2: String): Int = when {
    pontosAs(carta1,temKQJ(carta1,carta2)) == 1 && outrosPontos(carta2) == 0 -> pontosAs(carta1,temKQJ(carta1,carta2)) + pontosAs(carta1,temKQJ(carta1,carta2)) // A + A 2pontos
    pontosAs(carta1,temKQJ(carta1,carta2)) == 11 -> pontosAs(carta1,temKQJ(carta1,carta2)) + pontosKQJ(carta2)// A + K||Q||J 21pontos
    pontosAs(carta2,temKQJ(carta1,carta2)) == 11 -> pontosAs(carta2,temKQJ(carta1,carta2)) + pontosKQJ(carta1) // K||Q||J + A 21pontos
    pontosAs(carta1,temKQJ(carta1,carta2)) == 1 && outrosPontos(carta2) !=0 -> pontosAs(carta1,temKQJ(carta1,carta2)) + outrosPontos(carta2) // A + Numero
    pontosAs(carta2,temKQJ(carta1,carta2)) == 1 && outrosPontos(carta1) !=0 -> pontosAs(carta2,temKQJ(carta1,carta2)) + outrosPontos(carta1) // Numero + A
    pontosKQJ(carta1) == 10 && pontosKQJ(carta2) == 10 -> pontosKQJ(carta1) + pontosKQJ(carta2) // K||Q||J + K||Q||J
    pontosKQJ(carta1) == 10 && outrosPontos(carta2) !=0 -> pontosKQJ(carta1) + outrosPontos(carta2) // K||Q||J + Numero
    pontosKQJ(carta2) == 10 && outrosPontos(carta1) !=0 -> pontosKQJ(carta2) + outrosPontos(carta1) //Numero + K||Q||J
    outrosPontos(carta1) !=0 && outrosPontos(carta2) != 0 -> outrosPontos(carta1) + outrosPontos(carta2) // Numero + Numero
    else -> 0
}
fun main(){
    println("Insira carta 1 (A,K,Q,J,10,9,8,7,6,5,4,3,2)")
    val carta1 = readLine()
    println("Insira carta 2 (A,K,Q,J,10,9,8,7,6,5,4,3,2)")
    val carta2 = readLine()
    if(carta1 != null && carta2 !== null){
        val pontos = pontosTotais(carta1, carta2)
        println("Pontos: ${pontos}")
    }else{
        println("So possivel calcular pontos com duas cartas validas")
    }
}














