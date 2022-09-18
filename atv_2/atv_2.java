package atv_2;
import java.util.Scanner;

public class atv_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retangulo r1 = new Retangulo();

        System.out.println("Digite a Largura e Altura do retângulo:");
        double largura = sc.nextDouble();
        r1.setLargura(largura);
        double altura = sc.nextDouble();
        r1.setAltura(altura);
        
        System.out.printf("AREA = %.2f%n", r1.area());
        System.out.printf("PERÍMETRO = %.2f%n", r1.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", r1.diagonal());
        
        sc.close();
    }
}
