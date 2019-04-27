package inheritance5;

public class ResizableCircle extends Circle implements Resizable {

	
	
	public ResizableCircle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResizableCircle(double radius) {
		super(radius);
		// TODO Auto-generated constructor stub
	}

	public void resize(int percent) {
		this.radius = this.radius * (percent / 100);
	}
	
	@Override
	public String toString() {
		return "ResizableCircle [radius=" + radius + ", getPerimeter()=" + getPerimeter() + ", getArea()=" + getArea() + "]";
	}

	
	
	
}
