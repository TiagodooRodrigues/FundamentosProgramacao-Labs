package FT4

fun main (){
    println("Introduza o seu nome: ")
    val nome: String = readLine()!!.toString()
    println("Introduza a sua idade: ")
    val idade: Int = readLine()!!.toInt()
    if (idade >= 18){
        print("$nome é maior de idade")
    }else{
        print("$nome não é maior de idade")
    }
}