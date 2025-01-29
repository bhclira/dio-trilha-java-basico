
import java.util.concurrent.ThreadLocalRandom;


public class While {
    public static void main(String[] args) {
        double mesada = 50.0;
        
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce do valor: " + valorDoce + " comprado");
            mesada = mesada - valorDoce;

        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Acabou a mesada");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

/*
 
        int i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }   
 */
 
}
