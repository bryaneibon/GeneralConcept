package ca.POO.Shapes;
import java.awt.Point;
import java.lang.Math;
public class Circle extends Shape{
    // Begin of the class: attributes, constructors, properties, ...
    
    private double radius;
    
    public Circle() {
    	super();
    	this.setRadius(1);
    }

    
	public Circle(Point center, double radius) {
		super();
		this.setRadius(radius);
	}


	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = Math.abs(radius);
	}
	
	@Override
	public double area() {
		return Math.PI * this.radius * this.radius;
	}
	@Override
	public double perimeter() {
        return 2 * Math.PI * this.radius;
	}
	public void draw() {
		System.out.println("Un Cercle positionne en: " + this.getCenter() + " et de rayon: " + this.radius);
	}
}