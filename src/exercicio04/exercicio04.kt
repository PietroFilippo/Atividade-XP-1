package exercicio04

fun main() {
    val nomes = Array(10) { "" }

    for (i in nomes.indices) {
        print("Insira o nome do aluno ${i + 1}: ")
        nomes[i] = readLine() ?: ""
    }

    nomes.sort()

    println("\nLista dos alunos na ordem alfabética:")
    for (nome in nomes) {
        println(nome)
    }
}