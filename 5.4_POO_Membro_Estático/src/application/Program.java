/* Como a Calculadora era uma classe com operacoes e constantes estaticas,
foi possivel declacar os métodos da classe como estático e usar diretamente  
as operacoes (c , v) e a constante (PI) atravez do nome da classe (Calculator). */
// ver commit anterior para ver outras maneiras de implementar membros estaticos.

package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
