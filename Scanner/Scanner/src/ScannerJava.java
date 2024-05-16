import java.util.Locale;
import java.util.Scanner;

public class ScannerJava {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu Nome: ");
        String nome = scanner.next();
        
        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();
        
        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        
        System.out.println("Seu nome é " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Sua altura é: " + altura);
        

    }
}
