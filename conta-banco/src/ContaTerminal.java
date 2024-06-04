import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conta Banco");
        
        System.out.println("Informe o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Informe a agência: ");
        String agencia = scanner.nextLine();
        
        System.out.println("Informe o número da conta:");
        int numero = scanner.nextInt();

        System.out.println("Informe o saldo:");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo);


        System.out.println();
        System.out.println("== FIM ==");
    }
}
