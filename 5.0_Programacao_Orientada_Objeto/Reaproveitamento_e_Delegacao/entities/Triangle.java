package entities;

public class Triangle {
	
	// ATRIBUTOS da classe 
	public double a;
	public double b;
	public double c;
	
	// METODO
	public double area() {
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
