import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o número da Conta!");
            numeroConta = scanner.nextInt();
            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.next();
            System.out.println("Por favor, digite o seu nome!");
            nomeCliente = scanner.next();
            System.out.println("Por favor, digite o valor que será depositado!");
            saldo = scanner.nextDouble();
            //scanner.close();
        }


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldo + " já está disponível para saque!" );



    }
}
