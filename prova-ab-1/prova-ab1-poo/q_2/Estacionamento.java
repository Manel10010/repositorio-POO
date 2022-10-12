package q_2;
import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Carro> carros = new ArrayList<Carro>();
    private int totalPessoas;

    public void adcionarCarro(Carro carro) {
        carros.add(carro);
        this.totalPessoas += carro.getQntdPessoas();
    }

    public void obterQntdTotalPessoas() {
        System.out.println(totalPessoas);
    }

    public void listarCarros() {
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i).getNome());
          }
    }
}
