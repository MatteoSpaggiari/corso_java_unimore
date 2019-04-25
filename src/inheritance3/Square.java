package inheritance3;

public class Square extends Rectangle {

	public Square() {
		super();
	}

	public Square(double side) {
		super(side, side);
	}

	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
		// TODO Auto-generated constructor stub
	}

	public double getSide() {
		return this.width;
	}
	
	public void setSide(double side) {
		this.width = side;
		this.length = side;
	}

	@Override
	public void setWidth(double side) {
		this.setSide(side);
	}

	@Override
	public void setLength(double side) {
		this.setSide(side);
	}

	@Override
	public String toString() {
		return "Square [getSide()=" + getSide() + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter()
		+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + "]";
	}
	
	
	
}
