import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        Conta conta = new Conta();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        conta.numero = numero;

        System.out.println("Digite a agência da conta: ");
        String agencia = scanner.next();
        conta.agencia = agencia;

        System.out.println("Digite o nome do Cliente: ");
        String nomeCliente = scanner.next();
        conta.nomeCliente = nomeCliente;

        System.out.println("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        conta.saldo = saldo;


        System.out.println("Conta criada com sucesso!");
        System.out.println("Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");

        scanner.close();

    }
}
