package q_4;

public class q_4 {
    public static void main(String[] args) {
        App app = new App();
        PIX pix = new PIX();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        Boleto boleto = new Boleto();

        app.pagar(pix, 320);
        app.pagar(cartaoDeCredito, 320);
        app.pagar(boleto, 320);
    }
}
