package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
 
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            // precisarao sofrer alterações
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }

        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas );
        }
        else {
            System.out.println("Não conseguimos contato com " + candidato + " após " + tentativasRealizadas + " tentativas");
        }
    }



    static boolean atender() {
        return new Random().nextInt(3)==1;
    }
    

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void selecaoCandidatos () {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Bruno", "Rodrigo", "Jonas", "Leonardo", "Pedro"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while ((candidatosSelecionados < 5) &&  (candidatoAtual < candidatos.length)) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("Analisando candidato: " + candidato + " Solicitou esse valor de salário: " + String.format("%.2f", salarioPretendido));
            if(salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }

    static void analisarCandidato (double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");

        } else if(salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta");

        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }

    }

    static void imprimirSelecionados() {
        String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
        System.out.println("Candidatos a lista de selecionados com seu índice: ");
        for(int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + (indice+1) + " é: " + candidatos[indice]);
        }
        System.out.println("Forma abreviada de iteração for each: ");
        for(String candidato : candidatos) {
            System.out.println("O candidato selecionado foi: " + candidato);
        }
    }

}
