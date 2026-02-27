fun multiploDe(num1:Int, num2:Int): Boolean {
    return num1 % num2 == 0
}
fun intensidadeSismoTextual(intensidadeRitcher: Float): String? {
    return when  {
        intensidadeRitcher < 1.0-> null
        intensidadeRitcher in 1.0..1.9 ->"Micro"
        intensidadeRitcher in 2.0..3.9 -> "Menor"
        intensidadeRitcher in 4.0..4.9 -> "Leve"
        intensidadeRitcher in 5.0..4.9 -> "Moderado"
        intensidadeRitcher in 6.0..6.9 -> "Forte"
        intensidadeRitcher in 7.0..7.9 -> "Maior"
        else -> "Grande"
    }
}
fun primeiroDigito(num1: Int): Int {
    var a = num1.toString()
    var b : Int = a[0].toInt()
    if ( b.toInt() !in 48..57) {
        b = a[1].toInt()
    }
    return when (b) {
        48 -> 0
        49 -> 1
        50 -> 2
        51 -> 3
        52 -> 4
        53 -> 5
        54 -> 6
        55 -> 7
        56 -> 8
        else -> 9

    }
}
fun main () {
    println(primeiroDigito(5))
}