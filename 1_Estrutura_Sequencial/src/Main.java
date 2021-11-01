import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		////////////////////////////////////
		/// Saida de dados em Java
		/*
		
		int  y = 32;
		double x = 10.35896;
		String nome = "Luana";
		int idade = 28;
		double renda = 4000.0; 
		
		System.out.print("Olá mundo!");
		System.out.println("Tudo bom ?");
		
		System.out.println(y);
		System.out.println(x);
		
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);

		System.out.println("Resultado = " + x +  " metros");
		System.out.printf("Resultado =  %.2f metros%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais %n", nome, idade, renda);


		*/
		////////////////////////////////////
		/// Saida de dados em Java - Exercicio 
		/*
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("%s, which price is $ %.2f %n", product1, price1);
		System.out.printf("%s, which price is $ %.2f %n", product2, price2);
		System.out.printf("Record: %d years old, code %d and gender %c %n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f %n", measure);
		System.out.printf("Rouded (three decimalplaces): %.3f %n", measure);
		
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
		
		
		*/
		////////////////////////////////////
		/// Processamento de dados em Java, Casting 
		
		/*
		int a, b;
		double resultado;
		
		a = 5;
		b = 2;
		
		resultado = (double) a / b;
		System.out.println(resultado);
		
		*/
		////////////////////////////////////
		/// Entrada de Dados 
		
		/*
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		
		sc.close();
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int x;
		x = sc.nextInt();
		System.out.println("Voce digitou: " + x);
		
		sc.close();
		*/
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		x = sc.nextDouble();
		System.out.println("Voce digitou: " + x);
		System.out.printf("Voce digitou: %.2f%n", x);
		
		sc.close();
		*/ 
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char x;
		x = sc.next().charAt(0);
		System.out.println("Voce digitou: " + x);
		
		sc.close();	
		*/
		
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String x;
		int y;
		double z; 
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
	
		System.out.println("Voce digitou: " + x);
		System.out.println("Voce digitou: " + y);
		System.out.println("Voce digitou: " + z);
		
		sc.close();	
		*/
		
		////////////////////////////////////
		/// Entrada de Dados em Java - Parte 2
		
		/*
		Scanner sc = new Scanner(System.in);
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		sc.nextLine(); // consumir quebra de linha que ficou pendente
		
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados Digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		*/
		
		////////////////////////////////////
		/// Funcoes Matematicas 
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

}
