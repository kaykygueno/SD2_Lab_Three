package griffith;

public abstract class Shape {
	private String name;

	//Constructor that sets the shape's name.
	public Shape(String name) {
		this.name = (name == null) ? "" : name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name == null) ? "" : name;
	}

	// Return the area of the shape.
	public abstract double area();

	//Return the perimeter of the shape.
	public abstract double perimeter();

	@Override
	public String toString() {
		return name;
	}

}
