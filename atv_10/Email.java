package atv_10;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Email {
    //private Funcionario remetente;
    private Funcionario destinatario;
    private String conteudo;
    private String titulo;
    private String data;

    public Email(Funcionario destinatario, String conteudo, String titulo) {
        //this.remetente = remetente;
        this.destinatario = destinatario;
        this.conteudo = conteudo;
        this.titulo = titulo;

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String data = sdf.format(new Date());
        this.data = data;
    }

    //Métodos especiais  
    public Funcionario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Funcionario destinatario) {
        this.destinatario = destinatario;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    
}
