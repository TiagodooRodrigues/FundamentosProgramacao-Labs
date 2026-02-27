import FT7.soma

fun main () {
    var count = 1
    var soma1 = 1
    var soma2 = 0
        println("Introduza um numero")
        var n1 = readLine()!!.toInt()
        println("Introduza um numero")
        var n2 = readLine()!!.toInt()
        while (n2!=n1 * 2) {
        count = count + 1  // contagem de vezes
        soma1 = n1 + n2  // soma dos dois primeiros numeros
        println(soma1)
        print(count)
        n1 = n2

    }
    count = count + 1
     if (soma1 == 0)  {
         soma2 = n1 + n2
     } else {
         soma2 = soma1 + n2
     }
    println("Foram lidos $count números cuja soma e $soma2")
}