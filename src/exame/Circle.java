package exame;

public class Circle extends Shape {

	protected Point center;
	protected double radius;
	
	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
		calcShapeContainer();
	}

	public Circle(double radius) {
		super();
		center = new Point(0,0);
		this.radius = radius;
		calcShapeContainer();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
		calcShapeContainer();
	}
	
	@Override
	protected void calcShapeContainer() {
		container = new ShapeContainer();
		container.setWidth(radius*2);
		container.setHeight(radius*2);
		container.setVertex(new Point((center.getX()-width),(center.getY()-height)));
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius,2);
	}
	
	@Override
	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + ", getPerimeter()=" + getPerimeter() + ", getArea()="
				+ getArea() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (center == null) {
			if (other.center != null)
				return false;
		} else if (center.getX() != other.center.getX() || center.getY() != other.center.getY()) {
			return false;
		}
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
}
