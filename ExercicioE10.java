import java.util.Scanner;

public class ExercicioE10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira o valor original do produto: ");
        double valorOriginal = scanner.nextDouble();

        System.out.print("Insira a porcentagem de desconto (%): ");
        double percentualDesconto = scanner.nextDouble();
        double desconto = valorOriginal * (percentualDesconto / 100);
        double valorComDesconto = valorOriginal - desconto;


        System.out.println("Valor do desconto: R$" + desconto);
        System.out.println("Novo valor com desconto: R$" + valorComDesconto);




        scanner.close();
    }
}
