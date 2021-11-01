import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		////////////////////////////////////////////////
		// Estrutura Condicional (if-else)
		/*
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas horas ?");
		int hora = sc.nextInt();
		
		if (hora < 12) {
			System.out.println("Bom dia");
		}
		else if (hora < 18) {
			System.out.println("Boa tarde");
		}
		else {
			System.out.println("Boa Noite");
		}
		
		sc.close();
		
		*/
		////////////////////////////////////////////////
		/// Atribuição Acumulativa 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int minutos = sc.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}

		System.out.printf("Vamor da conta = R$ %.2f %n", conta);

		sc.close();
	}

}
