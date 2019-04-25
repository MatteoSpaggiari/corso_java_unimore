package inheritance3;

public class Rectangle extends Shape {

	protected double width;
	protected double length;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		return this.width*this.length;
	}

	@Override
	public double getPerimeter() {
		return (2*this.width)+(2*this.length);
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled
				+ ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
	
}
