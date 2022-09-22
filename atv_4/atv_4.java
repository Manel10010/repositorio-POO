package atv_4;
import java.util.Scanner;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de Shapes:");
        int qntdshapes = sc.nextInt();

        Formato shapes[] = new Formato[qntdshapes];

        for (int i = 0; i < qntdshapes; i++) {
            System.out.println("**Shape #" + (i+1) + "data:**");
            System.out.println("Retângulo ou Circulo (r/c)?");
            String forma = sc.next();
            System.out.println("Cor BLACK/BLUE/RED");
            String nomeCor = sc.next();
            Cores cor = Cores.valueOf(nomeCor);
            if (forma.equals("r")) {
                System.out.println("Largura:");
                double largura = sc.nextDouble();
                System.out.println("Altura");
                double altura = sc.nextDouble();
                shapes[i] = new Retangulo(cor, largura, altura);
            } else if(forma.equals("c")) {
                System.out.println("Raio:");
                double raio = sc.nextDouble();
                shapes[i] = new Circulo(cor, raio);
            }
        }
    
    System.out.println("ÁREAS DOS FORMATOS:");
    for (Formato objetos : shapes) {
        System.out.println(objetos.area());
    }
    sc.close();
    }
}
