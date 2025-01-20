import java.util.Date;

public class Operadores {
    public static void main(String[] args) throws Exception {
        
        String nome = "Breno";
        int idade = 45;
        double peso = 68.5;
        char sexo = 'M';
        boolean casado = true;
        Date dataNascimento = new Date();

        // operadores aritmeticos : + - * / %

        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 155 / 3;
        int modulo = 18 % 3; // resto da divisão
        double resultado = (10 * 7) + (20 / 7);

        // o operador + é usado para concatenar strings

        String nomeCompleto = nome + " Castro";

        System.out.println(nomeCompleto);
        
        // operadores unários: ++ --

        int num1 = +10;
        int num2 = -10;

        System.out.println(- num1); // nao afetou minha variavel principal, nao inverteu sinal

        num1 = -num1; // inverte o sinal
        num2 = num2 * -1; // inverte o sinal
        
        System.out.println(num1);

        // incremento e decremento de números

        num2 = 5;
        
        num1 = num1 + 2; // num1 = num1 + 1;
        // num2--; //num2 = num2 - 1;
        
        System.out.println( ++ num2); // primeiro incrementa e depois imprime o valor

        System.out.println(num2); // primeiro imprime o valor e depois incrementa

        // negando expressões booleanas

        boolean logico = true;

        System.out.println(!logico); // essa variavel é em memoria, nao altera o valor dela

        logico  = !logico; // inverte o valor da variavel

        System.out.println(logico);
    }
}
