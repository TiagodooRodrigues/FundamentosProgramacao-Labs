package MES

print("Introduz o mês: ")
var mes: String = readLine()!!.toString()
when (mes) {
    "Janeiro", "Abril", "Junho", "Setembro", "Novembro" -> print("30 dias")
    "Fevereiro" -> print("28 ou 29 dias ")
    "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> print("31 dias ")
}