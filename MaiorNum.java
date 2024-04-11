import java.util.Scanner;

public class MaiorNum {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o 1º número");
    Double num1 = scanner.nextDouble();

    System.out.println("Digite o 2º número");
    Double num2 = scanner.nextDouble();

    System.out.println("Digite 3º número");
    Double num3 = scanner.nextDouble();

    if (num1 > num2 && num1 > num3) {
    System.out.println("O maior numero é :" + num1);}
    if (num2 > num1 && num2 > num3) {
    System.out.println("O maior numero é :" + num2);}
    if (num3 > num1 && num3 > num2) {
    System.out.println("O maior numero é :" + num3);}
    }
}

