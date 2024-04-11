import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Preço do produto:R$");
    Double preço = scanner.nextDouble();
    
    System.out.print("Desconto: ");
    double desconto = scanner.nextInt();

    Double resultado = (desconto / 100 );
    
    Double resultado2 = (preço * resultado);

    Double resultado3 = (preço - resultado2);

    System.out.println("O Desconto é de " + resultado2 + " %");

    System.out.println("Então o preço será: R$" + resultado3);
    scanner.close();
    }
}
