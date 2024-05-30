
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o número da Agência:" );
        String agencia = scanner.next();

        System.out.println("Informe o número da Conta:" );
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Informe o seu nome:" );
        String nomeCliente = scanner.nextLine();
      
        System.out.println("Informe o valor para depósito:" );
        double deposito = scanner.nextDouble();
        
        
        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, deposito ));
        
  }
}
