package FT5
fun main () {
    println("Digite uma palavra com 3 caracteres: ")
    var c3: String = readLine().toString()
    if (c3.length != 3) {
        print("Erro, a palavra nao tem o comprimento indicado")
    } else {
        println("*************")
        println("* $c3       *")
        println("*  $c3      *")
        println("*   $c3     *")
        println("*************")
    }
}