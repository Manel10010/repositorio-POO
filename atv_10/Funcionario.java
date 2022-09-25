package atv_10;
import java.util.ArrayList;

public class Funcionario {
    private String nome;
    private String cargo;
    private int matricula;
    private String email;
    private ArrayList<Email> enviados;
    private ArrayList<Email> recebidos;

    public Funcionario(String nome, String cargo, int matricula, String email) {
        this.nome = nome;
        this.cargo = cargo;
        this.matricula = matricula;
        this.email = email;

        ArrayList<Email> enviados = new ArrayList<>();
        this.enviados = enviados;

        ArrayList<Email> recebidos = new ArrayList<>();
        this.recebidos = recebidos;
    }

    public void enviarEmail(Funcionario destinatario, String conteudo, String titulo) {
        Email newEmail = new Email(destinatario, conteudo, titulo);
        this.setEnviados(newEmail);
        destinatario.setRecebidos(newEmail);
    }
    //Métodos especiais
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Email> getEnviados() {
        for (Email emails : this.enviados) {
            System.out.println("Conteudo: " + emails.getConteudo() + " \nDestinatario: " + emails.getDestinatario().getNome());
        }
        return enviados;
    }

    public void setEnviados(Email email) {
        this.enviados.add(email);
    }

    public ArrayList<Email> getRecebidos() {
        for (Email emails : this.recebidos) {
            System.out.println("Conteudo: " + emails.getConteudo() + " \nDestinatario: " + emails.getDestinatario().getNome());
        }
        return enviados;
    }

    public void setRecebidos(Email email) {
        this.recebidos.add(email);
    }
    
    
}
