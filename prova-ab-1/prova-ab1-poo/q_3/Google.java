package q_3;

public class Google extends Plataforma{

    public Google(String email, String senha) {
        super.email = email;
        super.senha = senha;
    }

    public void logar() {
        System.out.println("Logando com sua conta do Google!");
        System.out.println("Usuário: " + super.email);
        System.out.println("Senha: " + super.senha);
    }
}
