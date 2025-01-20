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


    // operadores ternários


        int a, b;
        
        a = 10;
        b = 10;

        String resultado2 = "";
        
        if (a==b)
            resultado2 = "verdadeiro";
        else
            resultado2 = "é falso";
        
            System.out.println(resultado2);
        
        // <exp condicional> ? <caso cond seja true> : <caso cond seja false>
        
        String resultado3 = a==b ? "verdadeiro" : "é falso";

        System.out.println(resultado3);

        // ternario com inteiros
        int resultado4 = a == b ? 1 : 0;

        System.out.println(resultado4);

    // operadores relacionais: realiza comparações entre valores no fluxo de execução

        // == != > < >= <= retorna um valor booleano true or false

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        } else {
            System.out.println("a nossa condição é falsa");
        }

        System.out.println("Numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("Numero1 é diferente de numero2? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("Numero1 é maior que numero2? " + simNao);

            // comparando textos ou objetos

        String nomeUm = "BRENO";
        String nomeDois = new String ("BRENO");

        System.out.println(nomeUm == nomeDois); // false dois objetos na memoria stake vs heap

        System.out.println(nomeUm.equals(nomeDois)); // true compara o conteudo para objetos
        
    // operadores lógicos: && || ! permitem criar expressões lógicas maiores
        // concepção de tabela verdade de variavel booleana ou expressao relacional

        boolean expressao1 = true;

        boolean expressao2 = false;

        if (expressao1 && expressao2) {
            System.out.println("expressao1 e expressao2 são verdadeiras, as duas ao mesmo tempo");
        }

        if (expressao1 || expressao2) {
            System.out.println("/nexpressao1 ou expressao2 são verdadeiras, uma das duas é verdadeira");
        }

        System.out.println("fim");
        

    }
}
