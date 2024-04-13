import java.util.Scanner;

public class ExercicioE11 { 
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem-vindo ao Jogo Pedra, Papel e Tesoura!");

    while (true) {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.println("4. Sair do jogo");

        System.out.print("Digite o número da sua escolha: ");
        int escolhaJogador = scanner.nextInt();

        if (escolhaJogador == 4) {
            System.out.println("Obrigado por jogar! Até mais!");
            break;
        }

       
        int escolhaComputador = (int) (Math.random() * 3) + 1;
       
        System.out.println("Você escolheu: " + nomeOpcao(escolhaJogador));
        System.out.println("O computador escolheu: " + nomeOpcao(escolhaComputador));

        int resultado = determinaVencedor(escolhaJogador, escolhaComputador);
        if (resultado == 0) {
            System.out.println("Empate!");
        } else if (resultado == 1) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
        }

    scanner.close();
    
    }

public static int determinaVencedor(int escolhaJogador, int escolhaComputador) {
    if (escolhaJogador == escolhaComputador) {
        return 0; // Empate
    } else if ((escolhaJogador == 1 && escolhaComputador == 3) ||
               (escolhaJogador == 2 && escolhaComputador == 1) ||
               (escolhaJogador == 3 && escolhaComputador == 2)) {
        return 1; // Jogador vence
    } else {
        return -1; // Computador vence
    }
}

// Função para obter o nome da opção escolhida
public static String nomeOpcao(int escolha) {
    switch (escolha) {
        case 1:
            return "Pedra";
        case 2:
            return "Papel";
        case 3:
            return "Tesoura";
        default:
            return "";
    }
}
}