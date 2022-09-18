package atv_1;
import java.util.Scanner;

public class atv_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a cotação do dólar? ");
        double valorDolar = sc.nextDouble();

        System.out.println("Quantos dólares serão comprados?");
        double quantidade = sc.nextDouble();

        double resultado = CurrencyConverter.dolarPraReal(quantidade, valorDolar);
        System.out.printf("Quantidade a ser paga em reais: R$ %.2f%n", resultado);
        sc.close();
    }
}
