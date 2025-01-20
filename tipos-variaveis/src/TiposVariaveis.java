public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        
        byte idade = 21;
        short quantidadeAlunos = 100;
        int cep = 12345678;
        long cpf = 12345678901L;
        float salario = 2000.0f;
        double salarioMinimo = 2000.0;

        // CUIDADO! Java é fortemente tipado, ou seja, não é possível atribuir um valor de um tipo a uma variável de outro tipo!

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);
        
        // variáveis vs constantes
        // conceito constante: valor que não pode ser alterado
        // SINTAXE: final TIPO NOME = VALOR;

        
        final double VALOR_DE_PI = 3.14;

        // VALOR_DE_PI = 3.14; // erro de compilação

    }
}
