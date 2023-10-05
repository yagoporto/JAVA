import java.util.Scanner;
public class ContaTerminal {

    public static void main(String[] args) {
        int numeroConta;
        String numeroAgencia, nomeDoCliente;
        double saldo = 1715.38;


        Scanner sc = new Scanner(System.in);
        System.out.println("======================================");
        System.out.println("|            BANCO JAVA              |");
        System.out.println("======================================");
        System.out.println();

        System.out.print("Digite o nome do cliente: ");
        nomeDoCliente = sc.nextLine();
        System.out.print("Digite o número da agencia: ");
        numeroAgencia = sc.nextLine();
        System.out.print("Digite o número da conta: ");
        numeroConta = sc.nextInt();

        System.out.printf("Olá %s, obrigado por acessar o nosso banco, sua agencia é %s, conta %d e seu saldo de R$%.2f já esta disponível para saque", nomeDoCliente, numeroAgencia, numeroConta, saldo);
        
    
    }
    
}
