package exercicio03

import objetos.Aluno

fun main() {
    val alunos = mutableListOf<Aluno>()

    for (i in 1..5) {
        print("Insira o nome do aluno $i: ")
        val nome = readLine() ?: ""

        val notas = DoubleArray(3)
        for (j in notas.indices) {
            print("Insira a nota ${j + 1} do aluno $nome: ")
            notas[j] = readLine()?.toDoubleOrNull() ?: 0.0
        }

        alunos.add(Aluno(nome, notas))
    }

    for (aluno in alunos) {
        val media = aluno.calcularMedia()
        val status = if (aluno.foiAprovado()) "Aprovado" else "Reprovado"
        println("Aluno: ${aluno.nome} | Média: %.2f | Status: $status".format(media))
    }
}