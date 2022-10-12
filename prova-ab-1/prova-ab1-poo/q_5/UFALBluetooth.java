package q_5;

public abstract class UFALBluetooth {
    public void rodar() {
        estabelecerConexão(); //I
        processarDados();     //II
        fecharConexão();      //III
    }

    public void estabelecerConexão() {
        System.out.println("Estabelecendo conexão!");
    }

    public abstract void processarDados();

    public void fecharConexão() {
        System.out.println("Fechando conexão!");
    }
}
