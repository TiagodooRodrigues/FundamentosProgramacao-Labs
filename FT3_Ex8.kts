package FT3

println("Introduza o seu nome: ")
val nome: String = readLine()!!.toString()
println("Introduza a sua idade: ")
val idade: Byte = readLine()!!.toByte()
if (idade >= 18){
    print("$nome é maior de idade")
}
