package exame;

public class ShapeContainer {

	private double width;
	private double height;
	private Point vertex;
	
	
	
	public ShapeContainer() {
		super();
	}

	public ShapeContainer(double width, double height, Point vertex) {
		super();
		this.width = width;
		this.height = height;
		this.vertex = vertex;
	}
	
	public double getWidth() {
		return width;
	}


	public double getHeight() {
		return height;
	}


	public Point getVertex() {
		return vertex;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setVertex(Point vertex) {
		this.vertex = vertex;
	}

	public double getArea() {
		return width*height;
	}
	
}
