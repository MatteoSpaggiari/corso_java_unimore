package exame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class Shape implements Comparable<Shape> {

	protected List<Shape> shapes;
	protected double width;
	protected double height;
	protected double posX;
	protected double posY;
	protected ShapeContainer container;
	
	public Shape() {
		super();
		shapes = new ArrayList<Shape>();
		width = 0;
		height = 0;
		posX = 0;
		posY = 0;
	}

	public double getWidth() {
		return container.getWidth();
	}

	public double getHeight() {
		return container.getHeight();
	}

	public double getPosX() {
		return container.getVertex().getX();
	}

	public double getPosY() {
		return container.getVertex().getY();
	}
	
	protected abstract void shapeContainer(); 
	
	public int compareTo(Shape other) {
		return (container.getArea() > other.container.getArea()) ? 1 : -1;
	}
	
	public int getPosition(List<Shape> shapes) {
		Collections.sort(shapes);
		return shapes.indexOf(this);
	}
	
}
