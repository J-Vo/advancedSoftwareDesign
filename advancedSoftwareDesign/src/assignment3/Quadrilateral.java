package assignment3;

public class Quadrilateral {
	
	private Point topLeft;
	private Point topRight;
	private Point bottomLeft;
	private Point bottomRight;
	
	public Point getTopLeft() {
		return topLeft;
	}
	public void setTopLeft(Point topLeft) {
		this.topLeft = topLeft;
	}
	public Point getTopRight() {
		return topRight;
	}
	public void setTopRight(Point topRight) {
		this.topRight = topRight;
	}
	public Point getBottomLeft() {
		return bottomLeft;
	}
	public void setBottomLeft(Point bottomLeft) {
		this.bottomLeft = bottomLeft;
	}
	public Point getBottomRight() {
		return bottomRight;
	}
	public void setBottomRight(Point bottomRight) {
		this.bottomRight = bottomRight;
	};
	Quadrilateral(){
		
		Point tl = new Point();
		Point tr = new Point();
		Point bl = new Point();
		Point br = new Point();		
		this.setBottomLeft(bl);
		this.setBottomRight(br);
		this.setTopLeft(tl);
		this.setTopRight(tr);		
	}
	Quadrilateral(Point bl, Point br, Point tr, Point tl){
		 this.setBottomLeft(bl);
		 this.setBottomRight(br);
		 this.setTopLeft(tl);
		 this.setTopRight(tr);
	}
	public double calculateArea(){
		double area = 0;
		return area;
	}
	public String toString() {                                            
	      return String.format("(" + this.getBottomLeft().getX() + ", " + this.getBottomLeft().getY() + ") " + "," +
	    		  "(" +  this.getBottomRight().getX() + ", " + this.getBottomRight().getY() + ") " + "," +
	    		  "(" + this.getTopRight().getX() + ", " + this.getTopRight().getY() + ") " + "," +
	    		  "(" + this.getTopLeft().getX() + ", " + this.getTopLeft().getY() + ")");
	}
	
}
