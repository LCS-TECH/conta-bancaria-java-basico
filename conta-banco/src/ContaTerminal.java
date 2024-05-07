import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String agencia;
        String nomeCliente;
        int numero;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero da sua agência.");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o numero da sua conta");
        numero = sc.nextInt();
        sc.nextLine();
        System.out.println("Por favor, informe seu nome.");
        nomeCliente = sc.nextLine();

        saldo = 0;

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numero + " seu saldo de " + saldo + " já está disponível para saque.");

        sc.close();
    }
}