package MES

print("Insira o número do mês para receber o numero de dias do mesmo: ")
val mes: Int = readLine()!!.toInt()
when (mes) {
    1,3,5,7,8,10,12-> print("O mes $mes tem 31 dias")
    2-> print("O mes $mes tem 28 a 29 dias")
    4,6,9,11-> print("O mes $mes tem 30 dias")
}