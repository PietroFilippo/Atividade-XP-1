package objetos

class Produto(
    val nome: String,
    var quantidade: Int,
    val nivelMinimo: Int,
    val nivelMaximo: Int
) {

    fun reporEstoque() {
        if (quantidade < nivelMinimo) {
            println("Reposição de estoque para o produto $nome.")
            quantidade = nivelMaximo
            println("O estoque do produto $nome foi reposto para $nivelMaximo unidades.")
        }
    }

    fun exibirStatus() {
        println("Produto: $nome | Quantidade em estoque: $quantidade")
        if (quantidade < nivelMinimo) {
            println("O estoque está abaixo do nível mínimo.")
        }
    }
}