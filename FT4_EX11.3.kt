package FT4

fun main() {
    var soma = 0
    print("Digite o número: ")
    var numero: Int = readLine()!!.toInt()
    if (numero != 7) {
        soma += numero
    }
    if (soma > 5) {
        numero *= 2
        soma += numero
        if (numero < 20 && soma > 15)
            println(numero)
        print(soma)
    } else {
        print(soma)
    }
}