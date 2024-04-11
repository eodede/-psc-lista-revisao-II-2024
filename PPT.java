import java.util.Scanner;
import java.util.Random;

public class PPT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao jogo Pedra, Papel e Tesoura!");
        System.out.println("Por favor, escolha sua jogada:");
        System.out.println("1. Pedra");
        System.out.println("2. Papel");
        System.out.println("3. Tesoura");
        System.out.print("Digite o número correspondente à sua escolha: ");

        int escolhaJogador = scanner.nextInt();

        if (escolhaJogador < 1 || escolhaJogador > 3) {
            System.out.println("Escolha inválida. Por favor, escolha um número entre 1 e 3.");
            return;
        }

        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        int escolhaComputador = random.nextInt(3) + 1;

        System.out.println("Você escolheu: " + opcoes[escolhaJogador - 1]);
        System.out.println("O computador escolheu: " + opcoes[escolhaComputador - 1]);

        if (escolhaJogador == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaJogador == 1 && escolhaComputador == 3) ||
                   (escolhaJogador == 2 && escolhaComputador == 1) ||
                   (escolhaJogador == 3 && escolhaComputador == 2)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("Você perdeu!");
        }
    }
}
