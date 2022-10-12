package q_6;

public class ContaEspecial extends ContaCorrente{
    private float limite;
    public ContaEspecial(float saldo, float limite) {
        super(saldo);
        this.limite = limite;
    }
    @Override
    public void sacar(float saque) {
        if (saque <= saldo || saque <= saldo+limite) {
            System.out.printf("Sacando R$%.2f", saque);
            super.saldo -= saque;
        } else {
            System.out.println("Saldo insuficiente! SEU POBRE!");
        }
    }
    
}
