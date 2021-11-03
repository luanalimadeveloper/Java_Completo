package entities;

public class Rectangle {
	
	public double width;
	public double height; 
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimeter() {
		double perimeter = (2 * width) + (2 * height);
		return perimeter;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt( Math.pow(width, 2) + Math.pow(height,2) );
		return diagonal; 
	}
	
	public String toString() {
		return "area: " + String.format("%.2f", area()) 
		     + " perimeter: " +  String.format("%.2f", perimeter()) 
		     + " diagonal: " + String.format("%.2f", diagonal());
	}

}
