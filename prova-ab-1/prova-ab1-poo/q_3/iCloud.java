package q_3;

public class iCloud extends Plataforma{
    public iCloud(String email, String senha) {
        super.email = email;
        super.senha = senha;
    }

    public void logar() {
        System.out.println("Logando com sua conta do iCloud!");
        System.out.println("Usuário: " + super.email);
        System.out.println("Senha: " + super.senha);
    }
}
