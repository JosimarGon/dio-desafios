import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {


    public static void main(String[] args) throws Exception {

        // TODO: Conhecer e importar a classe Scanner
        
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite o agência bancária: ");
            String agencia = scanner.next();
            
            System.out.println("Digite seu nome: ");
            String nomeCliente = scanner.next();

            System.out.println("Digite o saldo bancário: ");
            double saldo = scanner.nextDouble();
   
            System.out.print("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua");
            System.out.print("agência é " + agencia + ", conta "+numeroConta+" e seu saldo "+ saldo +" já está disponível para saque.");
        }

    //Obter pela scanner os  valores no terminal

    // Exibir a mensagem com valores criados
    }
}
