package AbstractShape;

abstract class Shape {
	abstract void RectangleArea(double length, double breadth);
	abstract void SquareArea(double side);
	abstract void CircleArea(double radius);
}

class Area extends Shape{

	void RectangleArea(double length, double breadth) {
		System.out.println("Area of Rectangle: "+length*breadth);	
	}

	void SquareArea(double side) {
		System.out.println("Area of Square: "+side*side);
	}

	void CircleArea(double radius) {
		System.out.println("Area of Circle: "+(22/7)*radius*radius);
	}
}