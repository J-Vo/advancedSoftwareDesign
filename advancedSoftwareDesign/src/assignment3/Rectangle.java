package assignment3;

public class Rectangle extends Quadrilateral{
	
	Rectangle(Point r1, Point r2, Point r3, Point r4){
		super(r1, r2, r3, r4);
	}
	@Override
	public double calculateArea() {
		double width;
		double length;
		
		width = this.getTopRight().getX() - this.getTopLeft().getX();
		System.out.println("The width is:" + width);
		length = this.getTopLeft().getY() - this.getBottomLeft().getY();
		System.out.println("The length is:" + length);
		
		return length * width;
	}
}
