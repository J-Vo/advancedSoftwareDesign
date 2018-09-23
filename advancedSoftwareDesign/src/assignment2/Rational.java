
package assignment2;

public class Rational {
	
	private int numerator;
	private int denominator;
	
	Rational(){
		this.numerator = 0;
		this.denominator = 0;
	}
	Rational(int num, int den){
		this.numerator = num;
		this.denominator = den;
	}
	public static Rational addRational(Rational number1, Rational number2){
		
		Rational rat1 = new Rational();
		int num1den;
		int num2den;
		int num1num;
		int num2num;
		
		if(number1.denominator != number2.denominator){
		
			num1den = number1.denominator * number2.denominator;
			num2den = number1.denominator * number2.denominator;
			
			num1num = number1.numerator * number2.denominator;
			num2num = number2.numerator * number1.denominator;
			
			rat1.numerator = num1num + num2num;
			rat1.denominator = num1den;
		}
		else{
			rat1.numerator = number1.numerator + number2.numerator;
			rat1.denominator = number1.denominator;
		}
		return rat1;
	}
	public static Rational subtractRational(Rational number1, Rational number2) {
		
		Rational rat1 = new Rational();
		int num1den;
		int num2den;
		int num1num;
		int num2num;
		
		if(number1.denominator != number2.denominator){
		
			num1den = number1.denominator * number2.denominator;
			num2den = number1.denominator * number2.denominator;
			
			num1num = number1.numerator * number2.denominator;
			num2num = number2.numerator * number1.denominator;
			
			rat1.numerator = num1num - num2num;
			rat1.denominator = num1den;
		}
		else{
			rat1.numerator = number1.numerator - number2.numerator;
			rat1.denominator = number1.denominator;
		}
		return rat1;
	}
	public static Rational divideRational(Rational number1, Rational number2){
		Rational rat1 = new Rational();
		int num;
		int den;
		
		num = number2.denominator;
		den = number2.numerator;
		
		rat1.numerator = num;
		rat1.denominator = den;
		
		return multiplyRational(number1, rat1);
	}
	public static Rational multiplyRational(Rational number1, Rational number2){
		Rational rat1 = new Rational();
		
		rat1.numerator = number1.numerator * number2.numerator;
		rat1.denominator = number1.denominator * number2.denominator;
		
		return rat1;
	}
	public String toString(int precision) {
		
		double floatPoint = this.numerator / this.denominator;
		
		return String.format("%d/%d, %5f", this.numerator, this.denominator, floatPoint);
	}
	public static void main(String[] args) {
		
		Rational num1 = new Rational(1, 2);
		Rational num2 = new Rational(3, 4);
		Rational num3 = new Rational();
		Rational num4 = new Rational();
		Rational num5 = new Rational();
		Rational num6 = new Rational();
		
		//num3 = addRational(num1, num2);
		
		//System.out.printf("%d / %d%n", num3.numerator, num3.denominator);
		
		
		num4 = subtractRational(num1, num2);
		
		System.out.printf("%d / %d%n", num4.numerator, num4.denominator);
		
		num6 = multiplyRational(num1, num2);
		
		System.out.printf("%d / %d%n", num6.numerator, num6.denominator);
		
		num5 = divideRational(num1, num2);
		
		System.out.printf("%d / %d%n", num5.numerator, num5.denominator);
		
		System.out.println(num5.toString(2));
		
	}
	
}
