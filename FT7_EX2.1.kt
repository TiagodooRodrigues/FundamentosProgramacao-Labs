package FT7
fun soma (num1: Int, num2 : Int) = num1 + num2
fun main() {
    val numero1 = 3
    val numero2 = 4
    val numero3 = 6
    val resultado1 = soma (numero1, numero2)
    println ( "resultado1 = ${ resultado1 } " ) // resultado1 = 7
    val resultado2 = soma (numero2, numero3)
    println ( "resultado2 = ${ resultado2 } " ) // resultado2 = 10
}