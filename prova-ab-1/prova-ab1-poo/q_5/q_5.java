package q_5;

public class q_5 { //Template Method
    public static void main(String[] args) {
        App app = new App();
        Pacote pacote = new Pacote();
        Serial serial = new Serial();

        app.iniciar(pacote);
        System.out.println("");
        app.iniciar(serial);
    }
}
