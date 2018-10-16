package assignment3;

public class Main {
	public static void main(String args[]){
		
		Point q1 = new Point(1.1, 1.2);
		Point q2 = new Point(6.6, 2.8);
		Point q3 = new Point(6.2, 9.9);
		Point q4 = new Point(2.2, 7.4);
		
		Quadrilateral q = new Quadrilateral(q1,q2,q3,q4);
		System.out.println("Coordinates of Quadrilateral are:");
		System.out.println(q.toString());
		
		Point t1 = new Point(0.0, 0.0);
		Point t2 = new Point(10.0, 0.0);
		Point t3 = new Point(8.0, 5.0);
		Point t4 = new Point(3.3, 5.0);
		
		Trapezoid t = new Trapezoid(t1, t2, t3, t4);
		System.out.println("Coordinates of Trapezoid are:");
		System.out.println(t.toString());
		System.out.println("Area of the Trapezoid is:" + t.calculateArea());
		
		
		Point p1 = new Point(5.0, 5.0);
		Point p2 = new Point(11.0, 5.0);
		Point p3 = new Point(12.0, 20.0);
		Point p4 = new Point(6.0, 20.0);
		
		Parallelogram p = new Parallelogram(p1, p2, p3, p4);
		System.out.println("Coordinates of Parallelogram are:");
		System.out.println(p.toString());
		System.out.println("Area of the Parallelogram is:" + p.calculateArea());
		
		Point r1 = new Point(17.0, 14.0);
		Point r2 = new Point(30.0, 14.0);
		Point r3 = new Point(30.0, 28.0);
		Point r4 = new Point(17.0, 28.0);
		
		Rectangle r = new Rectangle(r1, r2, r3, r4);
		System.out.println("Coordinates of Rectangle are:");
		System.out.println(r.toString());
		System.out.println("Area of the Rectangle is:" + r.calculateArea());
		
		
		Point s1 = new Point(4.0, 0.0);
		Point s2 = new Point(8.0, 0.0);
		Point s3 = new Point(8.0, 4.0);
		Point s4 = new Point(4.0, 4.0);
		
		Square s = new Square(s1, s2, s3, s4);
		System.out.println("Coordinates of Square are:");
		System.out.println(s.toString());
		System.out.println("Area of the Square is:" + s.calculateArea());
	}
}
