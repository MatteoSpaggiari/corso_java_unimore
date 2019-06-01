package exame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestApp {

	public static void main(String[] args) {
		

		Circle c1 = new Circle(new Point(2,2), 1);
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(new Point(-2,-2), 5);
		Circle c4 = new Circle(new Point(2,-2), 7);
		Circle c5 = new Circle(new Point(2,-2), 7);
		
		System.out.println("c1:"+c1);
		System.out.println("c2:"+c1);
		System.out.println("c3:"+c1);
		System.out.println("c4:"+c1);
		
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(c1);
		shapes.add(c2);
		shapes.add(c3);
		shapes.add(c4);
		
		System.out.println(c1.getPosition(shapes));
		System.out.println(c2.getPosition(shapes));
		System.out.println(c3.getPosition(shapes));
		System.out.println(c4.getPosition(shapes));
		
		System.out.println(shapes);
		
		System.out.println(c5.equals(c1));
		System.out.println(c5.equals(c2));
		System.out.println(c5.equals(c3));
		System.out.println(c5.equals(c4));
		System.out.println(c5.equals(c5));
		System.out.println(c4);
		System.out.println(c5);
		
		c2.setRadius(10);
		
		System.out.println(c2.getPosition(shapes));
		System.out.println(shapes);
	}

}
