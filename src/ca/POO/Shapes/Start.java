package ca.POO.Shapes;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Circle());
		shapes.add(new Circle(new Point(10, 10), 20));
		shapes.add(new Square());
		shapes.add(new Square(new Point(10, 10), 2));

		
		for (Shape shape : shapes) {
			System.out.println(shape.area());
		}
		System.out.println("**************************************");
		for (Shape shape : shapes) {
			System.out.println(shape.perimeter());
			shape.draw();

		}
		System.out.println("**************************************");
		
	}

}
