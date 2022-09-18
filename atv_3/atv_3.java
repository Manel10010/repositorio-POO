package atv_3;
import java.util.Scanner;

public class atv_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario f1 = new Funcionario();

        System.out.println("Nome do funcionario:");
        String nome = sc.nextLine();
        f1.setNome(nome);
        
        System.out.println("Salário Bruto:");
        double salarioBruto = sc.nextDouble();
        f1.setSalarioBruto(salarioBruto);

        System.out.println("Imposto:");
        double imposto = sc.nextDouble();
        f1.setImposto(imposto);
        
        f1.status();
        System.out.println("Porcentagem para aumento:");
        double porcentagem = sc.nextDouble();
        f1.aumentarSalario(porcentagem);

        f1.status();
        sc.close();
    }
}
