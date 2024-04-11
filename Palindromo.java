import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();
        
        String texto = entrada.replaceAll("\\s", "").toLowerCase();
        
        boolean palindromo = true;
        for (int i = 0; i < texto.length() / 2; i++) {
            if (texto.charAt(i) != texto.charAt(texto.length() - i - 1)) {
                palindromo = false;
                break;
            }
        }
        if (palindromo) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
        scanner.close();
    }
}
