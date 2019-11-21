package ca.POO.Shapes;

import java.awt.Point;

public class Square extends Shape{

	private double length;

	public Square() {
		super();
		this.setLength(length);
	}
	
	public Square(Point center, double length) {
		super(center);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return this.length * this.length;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return this.length * 4;
	}
	
	public void draw() {
		System.out.println("Un carre positionne en: " + this.getCenter() + " et de longueur: " + this.length);
	}
	
	
}
