package assignment3;

public class Parallelogram extends Quadrilateral{
	
	Parallelogram(Point p1, Point p2, Point p3, Point p4){
		super(p1, p2, p3, p4);
	}
	@Override
	public double calculateArea() {
		double area = 0;
		double height;
		double base;
		
		base = this.getTopRight().getX() - this.getTopLeft().getX();
		System.out.println("The base is: " + base);
		
		height = this.getTopLeft().getY() - this.getBottomRight().getY();
		System.out.println("The height is:" + height);
		
		return base * height;
	}
	@Override
	public String toString() {                                            
	      return String.format("(" + this.getTopLeft().getX() + ", " + this.getTopLeft().getY() + ") " + "," +
	    		  "(" + this.getTopRight().getX() + ", " + this.getTopRight().getY() + ") " + "," +
	    		  "(" + this.getBottomRight().getX() + ", " + this.getBottomRight().getY() + ") " + "," +
	    		  "(" + this.getBottomLeft().getX() + ", " + this.getBottomLeft().getY() + ")");
	}
}
