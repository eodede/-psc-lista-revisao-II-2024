import java.util.Scanner;

public class Idade {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = scanner.nextInt();

    if (idade > 18) {
    System.out.println("Você é maior de idade!");
    }
    else
    System.out.println("Você é menor de idade!");
    scanner.close();
    }
}
