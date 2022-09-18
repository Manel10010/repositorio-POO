package atv_4;
import java.util.Scanner;
import java.util.ArrayList;

public class atv_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de Shapes:");
        int qntdshapes = sc.nextInt();

        Formato shapes[] = new Formato[qntdshapes];

        for (int i = 0; i <= qntdshapes; i++) {
            System.out.printf("**Shape #%s!%n data:**", i);
        }
    }
}
