package inheritance4;

public class TestApp {

	public static void main(String[] args) {
		
		MovablePoint p = new MovablePoint(0, 0, 5, 5);
		System.out.println(p);
		p.moveUp();
		System.out.println(p);
		p.moveDown();
		System.out.println(p);
		p.moveLeft();
		System.out.println(p);
		p.moveRight();
		System.out.println(p);
		
		MovableCircle c = new MovableCircle(0, 0, 2, 2, 5);
		System.out.println(c);
		c.moveUp();
		System.out.println(c);
		c.moveDown();
		System.out.println(c);
		c.moveLeft();
		System.out.println(c);
		c.moveRight();
		System.out.println(c);
		
		MovableRectangle r = new MovableRectangle(0, 0, 10, 10, 4, 4);
		System.out.println(r);
		r.moveUp();
		System.out.println(r);
		r.moveDown();
		System.out.println(r);
		r.moveLeft();
		System.out.println(r);
		r.moveRight();
		System.out.println(r);

	}

}
