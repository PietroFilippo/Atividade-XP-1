package objetos

class Aluno(val nome: String, val notas: DoubleArray) {
    fun calcularMedia(): Double {
        return notas.average()
    }

    fun foiAprovado(): Boolean {
        return calcularMedia() >= 7.0
    }
}