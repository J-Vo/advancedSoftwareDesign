package assignment3;

public class Trapezoid extends Quadrilateral{
	
	Trapezoid(Point t1, Point t2, Point t3, Point t4){
		super(t1, t2, t3, t4);
	}
	@Override
	public double calculateArea() {
		double upperBase;
		double lowerBase;
		double height;
		
		upperBase = this.getTopRight().getX() - this.getTopLeft().getX();
		System.out.println("The upper base is:" + upperBase);
		
		lowerBase =  this.getBottomRight().getX() - this.getBottomLeft().getX();
		System.out.println("The lower base is:" + lowerBase);
		
		height = this.getTopLeft().getY() - this.getBottomLeft().getY();
		System.out.println("The height is:" + height);
		
		return ((upperBase + lowerBase) * height) / 2;
	}
}
