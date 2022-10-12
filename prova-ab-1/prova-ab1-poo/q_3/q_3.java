package q_3;

public class q_3 {
    public static void main(String[] args) {
        Login app = new Login();
        Usuario user = new Usuario("coxinha123", "12345678");
        Google google = new Google("google@gmail.com", "12345678");
        Facebook facebook = new Facebook("facebook@gmail.com", "12345678");
        iCloud apple = new iCloud("icloud@gmail.com", "12345678");

        System.out.println("Logando por Form");
        app.logarPorForm(user);
        System.out.println("");

        //Logando pelo Google
        app.logarPorPlataforma(google);
        System.out.println("");

        //Logando pelo Facebook
        app.logarPorPlataforma(facebook);
        System.out.println("");

        //Logando pela iCLoud
        app.logarPorPlataforma(apple);
    }
}
