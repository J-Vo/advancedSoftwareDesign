package assignment3;

public class Point {
	
	private double x;
	private double y;
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	Point(){
		this(0,0);
	}
	Point(double x,double y){
		this.x = x;
		this.y = y;
	}
	
}
