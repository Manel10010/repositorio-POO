package q_2;

public class q_2 {
    public static void main(String[] args) {
        Estacionamento estacionamento = new Estacionamento();
        Carro c1 = new Carro("Uno", "Preto", 2);
        Carro c2 = new Carro("Ferrari", "Vermelha", 3);
        Carro c3 = new Carro("Celta", "Azul", 4);
        Carro c4 = new Carro("Uno Mili", "Vermelho", 1);

        estacionamento.adcionarCarro(c1);
        estacionamento.adcionarCarro(c2);
        estacionamento.adcionarCarro(c3);
        estacionamento.adcionarCarro(c4);

        estacionamento.listarCarros();
        estacionamento.obterQntdTotalPessoas();
    }
}
