import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nome_cliente = "";
        double saldo = 0.0;

        System.out.println("Por favor, digite o número da Conta: ");
        numero = teclado.nextInt();

        System.out.println("\nPor favor, digite o número da Agência: ");
        agencia = teclado.next();

        System.out.println("\nPor favor, digite o nome do cliente: ");
        nome_cliente = teclado.next();

        System.out.println("\nPor favor, digite o saldo: ");
        saldo = teclado.nextDouble();

        System.out.println("\n\nOlá "+nome_cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo de R$ "+saldo+" já está disponível para saque.");
    }
}
