package com.mphasis.training.oops;
//allows only public abstract methods and final variables
interface Shape{
	double PI=3.14;
	 double area();
}
class Circle implements Shape{
	private int radius;
	public Circle(int radius) {
		this.radius=radius;
	}
	@Override
	public double area() {
	return PI*radius*radius;
	}	
	
}
class Triangle implements Shape{
	@Override
	public double area() {
		return 0.0;
		
	}
	public static void draw() {
		System.out.println("draw");
	}
	
}

public class AbstractDemo {
	public static void main(String[] args) {
		Shape s1=new Circle(12);
		Triangle.draw();
		System.out.println(s1.area());

	}
	static {
		System.out.print("Static called");
	}

}
