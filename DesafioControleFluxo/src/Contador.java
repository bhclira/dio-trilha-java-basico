import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o valor do primeiro parâmetro (parametroUm):");
        int parametroUm = scanner.nextInt();
        System.out.println("Por favor, digite o valor do segundo parâmetro (parametroDois):");
        int parametroDois = scanner.nextInt();

        try {
            contar(parametroUm, parametroDois);
            // chamando o método contendo a lógica de contagem
            
        } catch (ParametrosInvalidosException e) {
            // imprimir mensagem: o segundo parametro deve ser maior que o primeiro
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm) {
            throw new ParametrosInvalidosException();

        } else {
            int contagem = parametroDois - parametroUm;
            
            for (int i = 1; i <= contagem; i++) {
                System.out.println( i);
            }
        }
    }

}
