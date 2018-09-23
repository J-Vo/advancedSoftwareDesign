package lab2;

public class Point {
	
	private int x;
	private int y;
	private Point Point;
	
	public Point() {
		this(0, 0);
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Point(Point point){
		this(point.x, point.y);
	}
	public void setPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void setX( int x) {
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY(){
		return y;
	}
	public double distanceFromOrigin() {
		
		double distanceOrigin;

		distanceOrigin = Math.sqrt((Math.pow(this.x, 2) + Math.pow(this.y, 2)));
		
		return distanceOrigin;
	}
	public double distance(Point other) {
		
		double distanceFromOther;
		
		distanceFromOther = Math.sqrt((Math.pow((this.x - other.x), 2)) + (Math.pow((this.y - other.y), 2)));
		return distanceFromOther;
	}
	public void translate(int dx, int dy){
		
		this.x = this.x + dx;
		this.y = this.y + dy;
	}
	public String toString() {
		
		return String.format("(%d,%d)", this.x, this.y);
	}
	/*public static void main(String[] args){
		Point point1 = new Point(8,2);
		Point point2 = new Point(4,3);
		
		System.out.printf("Distance from Origin %f%n", point1.distanceFromOrigin());
		System.out.printf("Distance from other point %f%n", point1.distance(point2));
		point2.translate(2, 3);
		System.out.println(point2);
		System.out.println(point1.distance(point2));
		point1.translate(6, -2);
		System.out.println(point1);
		System.out.printf("Distance from other point %f%n", point1.distance(point2));
		
	}*/
}
