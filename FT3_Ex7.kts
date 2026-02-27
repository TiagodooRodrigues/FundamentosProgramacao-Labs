package FT3
println("Qual é o primeiro número?")
var x: Int = readLine()!!.toInt()
println("Qual é o segundo número?")
var y: Int = readLine()!!.toInt()
var soma: Int = x + y
if (x > y) {
    print("$x é maior que o y")
} else {
    print("$soma")
}

