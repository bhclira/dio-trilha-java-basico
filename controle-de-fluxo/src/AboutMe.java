import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        } catch (InputMismatchException e) {
            
            System.out.println("Os campos idade e altura devem ser números inteiros ou decimais, respectivamente.");

        }      
        
    }
}
