package FT4

fun main(){
    println("Introduza um numero")
    val numero: Int = readLine()!!.toInt()
    if (numero>5 && numero<10) {
        print("O número $numero está entre 5 e 10")
    } else {
        print("O número não está entre 5 e 10")
    }
}