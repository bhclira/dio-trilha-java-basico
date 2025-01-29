import java.util.Random;

public class DoWhile {
    public static void main(String[] args) {

        System.out.println("Discando...");

        int tentativas = 0;
        boolean conectado = false;

        do { 
            System.out.println("Tentando conexão...");
            tentativas ++;
            if (tentativas >=5) {
                conectado = true;
            }
        } while (!conectado);

        // outro exemplo

        do { 
            System.out.println("Telefone tocando..");
            
        } while(tocando());

            System.out.println("Alô?");
        

    }

    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3) == 1;
        System.out.println("Atendeu? + atendeu");
        // negando o ato de continuar tocando
        return !atendeu;
    }

}
