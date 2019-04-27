package inheritance4;

public class MovablePoint implements Movable {

	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public void moveUp() {
		this.y = this.y + this.ySpeed;
	}
	
	public void moveDown() {
		this.y = this.y - this.ySpeed;
	}
	
	public void moveLeft() {
		this.x = this.x - this.xSpeed;
	}
	
	public void moveRight() {
		this.x = this.x + this.xSpeed;
	}

	@Override
	public String toString() {
		return "MovablePoint [x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}
	
}
