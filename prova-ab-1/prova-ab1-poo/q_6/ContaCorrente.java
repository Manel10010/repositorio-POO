package q_6;

public class ContaCorrente{
    protected float saldo;

    public ContaCorrente(float saldo) {
        this.saldo = saldo;
    }

    public void depositar(float deposito) {
        System.out.printf("Depositando R$%.2f", deposito);
        this.saldo += deposito;
    }

    public void sacar(float saque) {
        if (saque <= this.saldo) {
            System.out.printf("Sacando R$%.2f", saque);
            this.saldo -= saque;
        } else {
            System.out.println("Saldo insuficiente! SEU POBRE!");
        }
    }

    public boolean transferir(ContaCorrente contaCorrente, float valor) {
        if (valor <= this.saldo) {
            return true;
        } 
        return false;
    }

    //Métodos Especiais
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    
}   
