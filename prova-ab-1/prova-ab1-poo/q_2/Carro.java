package q_2;

public class Carro {
    private String nome;
    private String cor;
    private int qntdPessoas;

    public Carro(String nome, String cor, int qntdPessoas) {
        this.nome = nome;
        this.cor = cor;
        if (qntdPessoas <= 4 && qntdPessoas >= 0) {
            this.qntdPessoas = qntdPessoas;
        }
    }

    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String marca) {
        this.nome = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQntdPessoas() {
        return qntdPessoas;
    }

    public void setQntdPessoas(int qntdPessoas) {
        this.qntdPessoas = qntdPessoas;
    }

    
}
