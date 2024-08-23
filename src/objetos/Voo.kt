package objetos

class Voo(
    val numeroDoVoo: Int,
    private val assentosDisponiveis: IntArray
) {

    fun reservarAssento(assento: Int): Boolean {
        if (assento < 1 || assento > assentosDisponiveis.size) {
            println("Número de assento inválido.")
            return false
        }

        if (assentosDisponiveis[assento - 1] == 1) {
            assentosDisponiveis[assento - 1] = 0
            println("Assento $assento reservado com sucesso.")
            return true
        } else {
            println("Assento $assento já está reservado.")
            return false
        }
    }

    fun exibirStatusAssentos() {
        println("Status dos assentos para o voo $numeroDoVoo:")
        for (i in assentosDisponiveis.indices) {
            val status = if (assentosDisponiveis[i] == 1) "Disponível" else "Reservado"
            println("Assento ${i + 1}: $status")
        }
    }
}