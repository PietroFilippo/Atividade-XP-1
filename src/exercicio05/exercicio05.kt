package exercicio05

import kotlin.random.Random

fun main() {
    print("Insira a quantidade de vezes que os dados serão lançados: ")
    val vezes = readLine()?.toIntOrNull() ?: return

    if (vezes <= 0) {
        println("O número de lançamentos deve ser maior que zero.")
        return
    }

    for (i in 1..vezes) {
        val dado1 = lancarDado()
        val dado2 = lancarDado()
        val soma = dado1 + dado2

        println("Lançamento $i: Dado 1 = $dado1, Dado 2 = $dado2, Soma = $soma")
    }
}

fun lancarDado(): Int {
    return Random.nextInt(1, 7)
}