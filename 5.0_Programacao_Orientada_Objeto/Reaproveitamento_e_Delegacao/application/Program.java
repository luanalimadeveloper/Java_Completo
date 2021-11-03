package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {

	public static void main(String[] args) {
	

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	// VARIAVEIS x e y do tipo Triangle 
	Triangle x, y;
	
	// INSTANCIAR o objeto / criar o objeto 
	x = new Triangle();
	y = new Triangle();
	
	// LÊ dados e armazana em cada um dos ATRIBUTOS do OBJETO x
	System.out.println("Enter the measures of triangle X: ");
	x.a = sc.nextDouble();
	x.b = sc.nextDouble();
	x.c = sc.nextDouble();
	
	System.out.println("Enter the measures of triangle Y: ");
	y.a = sc.nextDouble();
	y.b = sc.nextDouble();
	y.c = sc.nextDouble();
	
	// CHAMADA do método
	double areaX = x.area();
	double areaY = y.area();
	
	System.out.printf("Triangle X area: %.4f%n", areaX);
	System.out.printf("Triangle Y area: %.4f%n", areaY);
	
	if (areaX > areaY) {
		System.out.println("Larger area: X");
	}
	else {
		System.out.println("Larger area: Y");
	}
	
	sc.close();
	}

}
