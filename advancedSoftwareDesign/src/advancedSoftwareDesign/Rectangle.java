package advancedSoftwareDesign;

public class Rectangle {
	
	private float length = 1;
	private float width = 1;
	
	public void setLength(float length){
		if(length <= 0.0 || length >= 20.0) {
			throw new IllegalArgumentException("Length must be between 0.0 and 20.0");
		}
		this.length = length;
	}
	public void setWidth(float width) {
		if(width <= 0.0 || width >= 20.0) {
			throw new IllegalArgumentException("Width must be between 0.0 and 20.0");
		}
		this.width = width;
	}
	public float getLength() {
		return this.length;
	}
	public float getWidth() {
		return this.width;
	}
	public float calculatePerimeter() {
		
		float perimeter;
		
		perimeter = (getLength() + getWidth()) * 2;
		
		return perimeter;
	}
	public float calculateArea() {
		
		float area;
		
		area = getLength() * getWidth();
		
		return area;
	}
	
	public static void main(String[] args){
		
		Rectangle newRectangle = new Rectangle();
		
		newRectangle.setLength(19);
		newRectangle.setWidth(6);
		
		System.out.println(newRectangle.calculatePerimeter());
		System.out.println(newRectangle.calculateArea());

	}

}
