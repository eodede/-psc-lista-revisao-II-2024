import java.util.Scanner;

public class Nota {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a nota do aluno: ");
    Double nota = scanner.nextDouble();

    System.out.println("A média é 5");

    if (nota >= 5) {
    System.out.println("Aprovado!!!");
    }
    else
    System.out.println("Reprovado!!!");
    scanner.close();
    }
}
