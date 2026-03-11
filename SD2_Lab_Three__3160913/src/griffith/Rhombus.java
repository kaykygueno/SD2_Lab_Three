package griffith;

public class Rhombus extends Shape {
	private double diagonal1;
	private double diagonal2;
	
	//constructor that sets the shape's name and the two diagonals
	public Rhombus(String name, double diagonal1, double diagonal2) {
		super(name);
		this.diagonal1 = diagonal1;
		this.diagonal2 = diagonal2;
	}
	
	//getters for the two diagonals
	public double getDiagonal1() {
		return diagonal1;
	}

	public double getDiagonal2() {
		return diagonal2;
	}
	
	//setters for the two diagonals
	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}
	
	// Implementations of area, perimeter, and toString
	@Override
	public double area() {
		return (diagonal1 * diagonal2) / 2;
	}

	@Override
	public double perimeter() {
		// side = sqrt((d1/2)^2 + (d2/2)^2)
		double sideLength = Math.sqrt(Math.pow(diagonal1 / 2, 2) + Math.pow(diagonal2 / 2, 2));
		return 4 * sideLength; 
	}

	@Override
	public String toString() {
		return String.format("%s (Rhombus) d1=%.4f d2=%.4f", getName(), diagonal1, diagonal2);
	}

}