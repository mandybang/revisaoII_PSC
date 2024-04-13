import java.util.Scanner;
public class ExercicioE12 { 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicita ao usuário que insira uma string
    System.out.print("Digite uma string: ");
    String input = scanner.nextLine();

    // Remove espaços em branco e converte para letras minúsculas para ignorar maiúsculas e minúsculas
    input = input.replaceAll("\\s+", "").toLowerCase();

    // Verifica se a string é um palíndromo
    if (isPalindromo(input)) {
        System.out.println("A string \"" + input + "\" é um palíndromo.");
    } else {
        System.out.println("A string \"" + input + "\" não é um palíndromo.");
    }

    scanner.close();
}

// Função para verificar se uma string é um palíndromo
public static boolean isPalindromo(String str) {
    int i = 0;
    int j = str.length() - 1;

    
    while (i < j) {
        if (str.charAt(i) != str.charAt(j)) {
            return false;
        }
        i++;
        j--;
    }
    return true;
}
}