package exercicio02

fun main() {
    print("Insira um parágrafo de texto: ")
    val input = readLine() ?: ""

    val palavrasCount = countPalavras(input)

    println("O parágrafo contém $palavrasCount palavras.")
}

fun countPalavras(texto: String): Int {
    val palavras = texto.trim().split("\\s+".toRegex())
    return if (texto.isBlank()) 0 else palavras.size
}