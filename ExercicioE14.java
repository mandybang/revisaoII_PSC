import java.util.Scanner;

public class ExercicioE14 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário que insira a nota do aluno
    System.out.print("Digite a nota do aluno: ");
    double nota = scanner.nextDouble();

    // Verifica se a nota é maior ou igual a 6.0, indicando aprovação
    if (nota >= 6.0) {
        System.out.println("O aluno foi aprovado!");
    } else {
        System.out.println("O aluno foi reprovado.");
    }

    scanner.close();
}
}