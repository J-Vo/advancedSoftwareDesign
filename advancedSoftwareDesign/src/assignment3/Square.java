package assignment3;

public class Square extends Quadrilateral{
	
	Square(Point s1, Point s2, Point s3, Point s4){
		super(s1, s2, s3, s4);
	}
	@Override
	public double calculateArea() {
		double height;

		height = this.getTopLeft().getY() - this.getBottomLeft().getY();
		System.out.println("The side is: " + height);
		return height * height;
	}
}
