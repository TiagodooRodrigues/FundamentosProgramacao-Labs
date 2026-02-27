package MES

print("Insira o número do mês para receber o numero de dias do mesmo: ")
val mes : Int = readLine()!!.toInt()
        if (mes <=7){
            if (mes == 2){
                print("o mês $mes tem 28 a 29 dias")
    }else{
        if (mes%2 ==0) {
            print("O mês $mes tem 30 dias")
        }else{
            print("O mês $mes tem 31 dias.")
        }
    }
        }else if(mes>7){
            if(mes%2==0){
        print("O mês $mes tem 31 dias")
    }else{
        print("O mês $mes tem 30 dias")
    }
}


