package q_4;

public class CartaoDeCredito implements MeioPagamento{
    
    @Override
    public void pagar(float valor) {
        System.out.printf("Pagando via Cartão de Crédito: R$%.2f\n", valor);
    }
}
