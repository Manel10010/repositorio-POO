package q_4;

public class PIX implements MeioPagamento{

    @Override
    public void pagar(float valor) {
        System.out.printf("Pagando via PIX: R$%.2f\n", valor);
    }
    
}
