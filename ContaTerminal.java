import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta.");
        int numero = scanner.nextInt();

        System.out.println("Agora informa qual é a agência.");
        String agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Diga-nos qual seu nome completo.");
        String nome = scanner.nextLine();

        System.out.println("Por último, informe qual o valor disponível na conta.");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta numero " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
    }
    
}
