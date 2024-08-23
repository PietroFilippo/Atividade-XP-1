package exercicio06

fun main() {
    val temperaturas = DoubleArray(30)

    for (i in temperaturas.indices) {
        print("Insira a temperatura do dia ${i + 1}: ")
        temperaturas[i] = readLine()?.toDoubleOrNull() ?: 0.0
    }

    val media = temperaturas.average()

    val temperaturasList = temperaturas.toList()

    val maxTemp = temperaturasList.maxOrNull() ?: Double.MIN_VALUE
    val diaMaxTemp = temperaturasList.indexOf(maxTemp) + 1

    val minTemp = temperaturasList.minOrNull() ?: Double.MAX_VALUE
    val diaMinTemp = temperaturasList.indexOf(minTemp) + 1

    println("\nTemperatura média: %.2f".format(media))
    println("Temperatura máxima: %.2f (Dia %d)".format(maxTemp, diaMaxTemp))
    println("Temperatura mínima: %.2f (Dia %d)".format(minTemp, diaMinTemp))
}