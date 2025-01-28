// CONDICIONAL COMPOSTA

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if(nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // condicional ternária
        String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        System.out.println(resultado);

        String resultado2 = nota >=7 ? "Aprovado" : nota>=5 && nota <7 ? "recuperação" :  "Reprovado";    
        System.out.println(resultado2);
    }


    
}
