import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int numero;
		String agencia,nome_cliente;
		double saldo ;
		System.out.println("Nos informe seu nome");
		nome_cliente = input.next();
		System.out.println("Por favor.digite o número da sua agência! ");
		agencia = input.next();
		System.out.println("O número de sua conta ");
		numero = input.nextInt();
		System.out.println("Nos informe seu saldo");
		saldo = input.nextDouble();
		
		
		System.out.printf("Olá %s,obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já esta disponivel",nome_cliente,agencia,numero,saldo);
		
		
		
		
		input.close();
	}

}
