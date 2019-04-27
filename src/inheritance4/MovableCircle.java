package inheritance4;

public class MovableCircle implements Movable {
	
	int radius;
	MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		super();
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
		
	}
	
	public void moveUp() {
		this.center.moveUp();
	}
	
	public void moveDown() {
		this.center.moveDown();
	}
	
	public void moveLeft() {
		this.center.moveLeft();
	}
	
	public void moveRight() {
		this.center.moveRight();
	}

	@Override
	public String toString() {
		return "MovableCircle [radius=" + radius + ", center=" + center + "]";
	}
	
}
