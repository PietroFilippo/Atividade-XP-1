package exercicio08

import objetos.Produto

fun main() {
    val produtos = mutableListOf<Produto>()

    for (i in 1..5) {
        println("Cadastro do produto $i:")
        print("Insira o nome do produto: ")
        val nome = readLine() ?: ""

        print("Quantidade inicial em estoque: ")
        val quantidade = readLine()?.toIntOrNull() ?: 0

        print("Nível mínimo de estoque: ")
        val nivelMinimo = readLine()?.toIntOrNull() ?: 0

        print("Nível máximo de estoque: ")
        val nivelMaximo = readLine()?.toIntOrNull() ?: 0

        val produto = Produto(nome, quantidade, nivelMinimo, nivelMaximo)
        produtos.add(produto)
    }

    println("\nVerificação de estoque dos produtos:")
    for (produto in produtos) {
        produto.exibirStatus()
        if (produto.quantidade < produto.nivelMinimo) {
            produto.reporEstoque()
        }
        println()
    }
}