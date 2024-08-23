package exercicio01

fun main() {
    print("Insira um número inteiro: ")
    val num = readLine()?.toIntOrNull() ?: return

    if (ePrimo(num)) {
        println("O número $num é primo.")
    } else {
        println("O número $num não é primo.")
    }
}

fun ePrimo(num: Int): Boolean {
    if (num <= 1) return false
    for (i in 2..num / 2) {
        if (num % i == 0) {
            return false
        }
    }
    return true
}