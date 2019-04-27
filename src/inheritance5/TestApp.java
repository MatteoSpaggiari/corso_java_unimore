package inheritance5;

public class TestApp {

	public static void main(String[] args) {
		
		Circle c = new Circle();
		System.out.println(c);
		
		Circle c1 = new Circle(13);
		System.out.println(c1);
		
		ResizableCircle cr = new ResizableCircle(5);
		System.out.println(cr);
		
		cr.resize(200);
		System.out.println(cr);
		
	}

}
