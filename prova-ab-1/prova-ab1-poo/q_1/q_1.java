public class q_1 {
    public static void main(String[] args) {
        Compra compra = new Compra();
        Produto produto1 = new Produto("Shampoo", 12);
        Produto produto2 = new Produto("Condicionador", 18);
        Produto produto3 = new Produto("Sabonete Líquido", 20);
        Produto produto4 = new Produto("Escova de Dentes", 21);
        Produto produto5 = new Produto("Pasta de dentes", 12);

        compra.adicionaProduto(produto1);
        compra.adicionaProduto(produto2);
        compra.adicionaProduto(produto3);
        compra.adicionaProduto(produto4);
        compra.adicionaProduto(produto5);

        compra.listarProdutos();
        compra.obterValorTotalCompra();

    }
}
