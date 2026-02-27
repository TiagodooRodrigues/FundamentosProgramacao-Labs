package Formulas

print("Introduza o seu Peso: ")
var peso: Float = readLine()!!.toFloat()
print("Introduza a sua altura: ")
var altura: Float = readLine()!!.toFloat()
println("Seu peso é $peso e tem a altura de $altura ")
var IMC: Float = (peso / (altura * altura))
print("O valor final é $IMC")
