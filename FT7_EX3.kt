package FT7
fun primeiro(num1: Int , num2: Int) = num1 + num2 * 0
fun dobro(num1: Int) = num1 * 2
fun iguais(numero1: Int, numero2: Int) = numero1 == numero2
fun junta(num1: Int, num2: Int) = "$num1$num2"
fun juntaComVirgula(palavra1: String,palavra2: String) = "$palavra1,$palavra2"
fun main() {
    val numero1 = 3
    val numero2 = 4
    val numero3 = 6
    val resultado1 : Int = primeiro(numero1, numero2)
    val resultado2 : Int = primeiro(numero3, numero1)
    println ( "resultado1 = ${ resultado1 } " ) // resultado1 = 3  // envolve 3 e 4
    println ( "resultado2 = ${ resultado2 } " ) // resultado2 = 6  // envolve 6 e 3
    val resultado3 : Int = dobro(numero1)
    val resultado4 : Int = dobro(numero2)
    println ( "resultado3 = ${ resultado3 } " ) // resultado3 = 6
    println ( "resultado4 = ${ resultado4 } " ) // resultado4 = 8
    val resultado5 : Boolean = iguais(numero1, numero2)
    val resultado6 : Boolean = iguais(numero1, 3 )
    println ( "resultado5 = ${ resultado5 } " ) // resultado5 = false
    println ( "resultado6 = ${ resultado6 } " ) // resultado6 = true
    val resultado7 : String = junta(numero1, numero2)
    val resultado8 : String = junta(numero1, numero3)
    println ( "resultado7 = ${ resultado7 } " ) // resultado7 = 34
    println ( "resultado8 = ${ resultado8 } " ) // resultado8 = 36
    val resultado9 : String = juntaComVirgula( "ola" , "ole" )
    val resultado10 : String = juntaComVirgula( "fundamentos" , "programação" )
    println ( "resultado9 = ${ resultado9 } " ) // resultado9 = ola,ole
    println ( "resultado10 = ${ resultado10 } " ) // resultado10 = fundamentos,programação
}
