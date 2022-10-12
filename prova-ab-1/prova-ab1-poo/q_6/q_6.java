package q_6;

public class q_6 {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(7000);
        ContaEspecial contaEspecial = new ContaEspecial(500, 2000);

        Cliente c1 = new Cliente("Thiago", contaCorrente);
        Cliente c2 = new Cliente("Robertinha", contaEspecial);

        c1.getConta().get(0).sacar(8000);
        c2.getConta().get(0).sacar(2000);
        System.out.println("");
        System.out.println(c2.getConta().get(0).getSaldo());

        System.out.println("");
        System.out.println(c2.getConta().get(0).transferir(c1.getConta().get(0), 2500));
    }
}
