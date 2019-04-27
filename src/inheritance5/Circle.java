package inheritance5;

public class Circle implements GeometricObject {

	protected double radius = 1.0;
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 2 * Math.PI * this.radius;
	}

	@Override
	public double getArea() {
		return Math.PI * Math.pow(this.radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}

	
	
}
