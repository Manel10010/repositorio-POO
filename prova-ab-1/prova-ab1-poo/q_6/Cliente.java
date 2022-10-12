package q_6;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private ArrayList<ContaCorrente> conta = new ArrayList<ContaCorrente>();

    public Cliente(String nome, ContaCorrente conta) {
        this.nome = nome;
        this.conta.add(conta);
    }   

    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ContaCorrente> getConta() {
        return conta;
    }

    public void setConta(ArrayList<ContaCorrente> conta) {
        this.conta = conta;
    }
}
