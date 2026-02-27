package FT4

fun main () {
    println("Digite a regiao de aquisicao do produto entre Continental , Acores e Madeira")
    val regiao: String = readLine()!!.toString()
    println("Qual e o produto? ")
    val produto = readLine()!!.toString()
    println("Qual o preco do produto? ")
    val precoproduto = readLine()!!.toDouble()
    println("O qual essencial e o produto ? (Escala: muito , medio e pouco)")
    val essencial = readLine()!!.toString()
    var iva = 0.00
    var precomiva = 0.00
    when (essencial) {
        "muito" -> when (regiao) {
            "Continental" -> {
                precomiva = (0.06 * precoproduto + precoproduto)
                iva = (0.06 * precoproduto)
            }
            "Madeira" -> {
                precomiva = (0.05 * precoproduto + precoproduto)
                iva = (0.05 * precoproduto)
            }
            "Acores" -> {
                precomiva = (0.04 * precoproduto + precoproduto)
                iva = (0.04 * precoproduto)
            }
        }
        "medio" -> when (regiao) {
            "Continental" -> {
                precomiva = (0.13 * precoproduto + precoproduto)
                iva = (0.13 * precoproduto)
            }
            "Madeira" -> {
                precomiva = (0.12 * precoproduto + precoproduto)
                iva = (0.12 * precoproduto)

            }
            "Acores" -> {
                precomiva = (0.09 * precoproduto + precoproduto)
                iva = (0.09 * precoproduto)
        }
        "pouco" -> when (regiao) {
            "Continental" -> {
                precomiva = (0.23 * precoproduto + precoproduto)
                iva = (0.23 * precoproduto)
            }
            "Madeira" -> {
                    precomiva = (0.22 * precoproduto + precoproduto)
                    iva = (0.22 * precoproduto)
                }
            "Acores" -> {
                precomiva = (0.18 * precoproduto + precoproduto)
                iva = (0.18 * precoproduto)
            }
        }
        }
    }
    println("Local de Aquisicao: $regiao")
    println("Para o artigo $produto , considerando $essencial essencial, os valores calculados sao: ")
    println("Sem IVA: $precoproduto")
    println("Com IVA: $precomiva")
    println("Total IVA: $iva ")
}