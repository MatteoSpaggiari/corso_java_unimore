package inheritance4;

public class MovableRectangle implements Movable {
	
	MovablePoint topLeft;
	MovablePoint bottomRight;
	
	public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
		super();
		this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
		this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);;
	}
	
	public void moveUp() {
		this.topLeft.moveUp();
		this.bottomRight.moveUp();
	}
	
	public void moveDown() {
		this.topLeft.moveDown();
		this.bottomRight.moveDown();
	}
	
	public void moveLeft() {
		this.topLeft.moveLeft();
		this.bottomRight.moveLeft();
	}
	
	public void moveRight() {
		this.topLeft.moveRight();
		this.bottomRight.moveRight();
	}

	@Override
	public String toString() {
		return "MovableRectangle [topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
	}
	
} 
