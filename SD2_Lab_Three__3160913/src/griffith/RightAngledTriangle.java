package griffith;

public class RightAngledTriangle  extends Shape {
	private double base;
	private double height;

	//constructor that sets the shape's name, base, and height
	public RightAngledTriangle(String name, double base, double height) {
		super(name);
		this.base = base;
		this.height = height;
	}
	//getters for base and height
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
	//setters for base and height
	public void setBase(double base) {
		this.base = base;
	}


	public void setHeight(double height) {
		this.height = height;
	}
	
	// Implementations of area, perimeter, and toString
	@Override
	public double area() {
		return (base * height) / 2;
	}

	@Override
	public double perimeter() {
		// Pythagorean theorem: hypotenuse = sqrt(base^2 + height^2)
		double hypotenuse = Math.sqrt(base * base + height * height);
		return base + height + hypotenuse;
	}

	@Override
	public String toString() {
		return String.format("%s (RightAngledTriangle) base=%.4f height=%.4f", getName(), base, height);
	}

}