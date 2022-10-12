package q_3;

public class Login implements App{
    
    public void logarPorForm(Usuario user){
        System.out.println("Logando...");
        System.out.println("Usuário: " + user.getUsuario());
        System.out.println("Senha: " + user.getSenha());
    }
    public void logarPorPlataforma(Plataforma plataforma) {
        System.out.println("Logando...");
        plataforma.logar();
    }
}
