import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Entre com o número da conta: ");
        int numero = terminal.nextInt();
        System.out.println("Entre com o número da agencia: ");
        String agencia = terminal.next();
        System.out.println("Nome de Usúario: ");
        String usuario = terminal.next();
        System.out.println("Entre com o saldo da conta: ");
        float saldo = terminal.nextFloat();

        System.out.println("Olá "+usuario+ " obrigado por criar uma conta em nosso banco, sua agência é "+agencia+
         " conta "+numero+ " e seu saldo "+saldo+ ", já disponível para saque");
    }
}
