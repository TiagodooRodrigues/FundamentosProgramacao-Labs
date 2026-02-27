package Formulas

var taxaConversao: Float = 1.60934f
print("Introduza milhas: ")
var milhas: Short = readLine()!!.toShort()
var kms: Int = (milhas * taxaConversao).toInt()
println("$milhas milhas são $kms kms")
