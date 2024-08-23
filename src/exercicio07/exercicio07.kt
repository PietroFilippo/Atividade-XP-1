package exercicio07

import objetos.Voo

fun main() {
    val voo = Voo(101, IntArray(10) { 1 })

    voo.exibirStatusAssentos()

    while (true) {
        println("Insira o número do assento que deseja reservar (ou insira 0 para sair): ")
        val numeroAssento = readLine()?.toIntOrNull() ?: continue

        if (numeroAssento == 0) break

        voo.reservarAssento(numeroAssento)

        voo.exibirStatusAssentos()
    }

    println("Programa finalizado.")
}