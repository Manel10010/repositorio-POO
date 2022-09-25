package atv_10;

public class atv_10 {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(
            "Roberto", "Acessor", 20112321, "roberto.acessor@gmail.com");
        Funcionario f2 = new Funcionario(
            "Luciana", "CEO", 20112123, "luciana.ceo@gmail.com");
        
        String conteudo = "Nullam non porta nisl. Nam accumsan id velit vel pulvinar. Fusce finibus magna sit amet posuere pharetra. Integer nec metus fringilla, cursus augue sed, vestibulum libero. Sed vulputate elit luctus condimentum aliquet. Nullam molestie auctor diam, ut viverra urna accumsan non. Mauris at congue tellus. Ut ac velit neque. Nunc varius felis elit, non eleifend velit congue eu. Sed ante ligula, pellentesque in purus ac, ullamcorper fermentum dui. Donec cursus leo id lectus euismod, sit amet vestibulum felis porta. Duis vel ex sed risus blandit feugiat pretium sed enim. Donec dignissim pellentesque dolor. Nullam sed interdum justo.";
        String titulo = "Reunião";

        f1.enviarEmail(f2, conteudo, titulo);
        System.out.println("Nome: " + f1.getNome());
        System.out.println("Matrícula: " + f1.getMatricula());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Enviados:");
        f1.getEnviados();
        System.out.println("Recebidos:");
        f1.getRecebidos();

        System.out.println();

        System.out.println("Nome: " + f2.getNome());
        System.out.println("Matrícula: " + f2.getMatricula());
        System.out.println("Cargo: " + f2.getCargo());
        System.out.println("Enviados:");
        f2.getEnviados();
        System.out.println("Recebidos:");
        f2.getRecebidos();
    }
}
