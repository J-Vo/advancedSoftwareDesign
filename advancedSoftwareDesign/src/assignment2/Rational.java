
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
	public Rational divideRational(Rational number){
		
		return number;
	}
	public static void main(String[] args) {
		
		Rational num1 = new Rational(1, 9);
		Rational num2 = new Rational(3, 5);
		Rational num3 = new Rational();
		
		num3 = addRational(num1, num2);
		
		System.out.printf("%d / %d", num3.numerator, num3.denominator);
	}
	
}
