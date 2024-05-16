import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) throws Exception {
        
        try {
            
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Qual seu nome? ");
        String nome = scanner.next();

        System.out.println("Qual seu sobrenome? ");
        String sobrenome = scanner.next();

        System.out.println("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.println("Qual sua altura? ");
        double altura = scanner.nextDouble();

        System.out.println("Olá " + nome + " " + sobrenome);
        
        System.out.println("Sua idade é: " + idade);

        System.out.println("Sua altura é: " + altura);
    } 
    catch (InputMismatchException e) {
        System.out.println("Os campos idade e altura devem ser númericos");

    }

  }
 
}

