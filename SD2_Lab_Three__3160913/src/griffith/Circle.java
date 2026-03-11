package griffith;

public class Circle extends Shape {
	private double radius;
	
	//constructor that sets the shape's name and radius
	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	//getter and setter for radius
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Implementations of area, perimeter, and toString
	@Override
	public double area() {
		return Math.PI * radius * radius;
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public String toString() { //name (Circle) radius=radius
		return String.format("%s (Circle) radius=%.4f", getName(), radius);
	}

}