public class ForArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        for(int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        String[] alunos = {"Ana", "Maria", "José", "Pedro"};

        for(int x = 0; x < alunos.length; x++){
            System.out.println(alunos[x]);
        }

        for (String elemento : alunos) {
            System.out.println("Aluno: " + elemento);
            
        }
    }
}
