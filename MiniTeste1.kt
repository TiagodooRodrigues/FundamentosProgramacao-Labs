fun main() {
    println("Introduza o seu nome")
    val nome: String = readLine()!!.toString()
    println("Introduza o seu salario")
    var salario = readLine()!!.toInt()
    if (salario < 0) {
        print("Valor invalido")
    } else {
        var novosalario = 0.0
        var percentagemsalarial = 0
        when (salario){
            in 0..1000-> {
                novosalario = (salario + salario * 0.12)
                percentagemsalarial = 12
            }
            in 1000..1750 -> {
                novosalario = (salario + salario * 0.10)
                percentagemsalarial = 10
            }
            in 1750..2500 -> {
                novosalario = (salario + salario * 0.07)
                percentagemsalarial = 7
            }
            in 2500..5000 -> {
                novosalario = (salario + salario * 0.05)
                percentagemsalarial = 5
            }
            else -> {
                novosalario = (salario + salario * 0.0)
                percentagemsalarial = 0
            }
        }
        println("Parabens $nome. Tera um aumento salarial de $percentagemsalarial%")
        print("Ficara a receber $novosalario€")
    }
}