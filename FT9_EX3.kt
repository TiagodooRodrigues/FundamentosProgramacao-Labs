package FT9
fun contemLetraA (texto: String): Boolean {
    var valor = false // nao tem a
    if ('a' in texto) { // caso texo tenha a
        valor = true // tem a
    }
    return valor
}
fun geraSequencia(inicio: Int, fim: Int): String{
    var count = inicio
    var sequencia = ""
    while (count <= fim) { // inclui primeiro e ultimo numero
        sequencia += count //adiciona numeros a sequencia
        count++ // aumenta numero
    }
    return sequencia
}
fun multiplica (texto: String, nVezes: Int): String {
    var count = 0
    var textofinal = "" // vazio
    while (count < nVezes) {
        textofinal+= texto // escreve texto ao vazio
        count++ // conta
    }
    return  textofinal
}