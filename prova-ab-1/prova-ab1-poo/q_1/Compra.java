import java.util.ArrayList;

public class Compra {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private double valorTotal;

    void adicionaProduto(Produto produto) {
        produtos.add(produto);
        valorTotal += produto.getValor();
    }

    void obterValorTotalCompra() {
        System.out.println(valorTotal);
    }

    void listarProdutos() { //percorrendo a lista produtos
        for (int i = 0; i < produtos.size(); i++) {
            System.out.println(produtos.get(i).getNome());
          }
    }
}
