package q_4;

public class Boleto implements MeioPagamento{
    
    @Override
    public void pagar(float valor) {
        System.out.printf("Pagando via Boleto: R$%.2f\n", valor);
    }
}
