package inheritance3;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();
		System.out.println(c1);
		
		Circle c2 = new Circle(2);
		System.out.println(c2);
		
		Circle c3 = new Circle(2, "Red", true);
		System.out.println(c3);
		
		Rectangle r1 = new Rectangle();
		System.out.println(r1);
		
		Rectangle r2 = new Rectangle(2,5);
		System.out.println(r2);
		
		Rectangle r3 = new Rectangle(2, 5, "Green", false);
		System.out.println(r3);
		
		Square s1 = new Square();
		System.out.println(s1);
		
		Square s2 = new Square(2);
		System.out.println(s2);
		
		Square s3 = new Square(2, "Green", false);
		System.out.println(s3);
		
		s1.setSide(13);
		s1.setColor("Blue");
		System.out.println(s1);
		
		s1.setLength(15);
		System.out.println(s1.getColor());
		System.out.println(s1);
		
		Shape[] shapes = {c1, c2, c3, r1, r2, r3, s1, s2, s3};
		
		for(Shape shape : shapes) {
			System.out.println(shape);
			if(shape instanceof Circle) {
				Circle c = (Circle)shape;
				System.out.println(c.getRadius());
			}
		}
		
	}

}
