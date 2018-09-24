
package assignment2;

import java.util.Scanner;

public class Rational {
	//DECLARE 2 PRIVATE VARIABLES
	private int numerator;
	private int denominator;
	
	// CREATE SETTERS AND GETTERS
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	//NO-ARGUMENT CONSTRUCTOR
	Rational(){
		this.numerator = 0;
		this.denominator = 0;
	}
	//2 ARGUMENT CONSTRUCTOR
	Rational(int num, int den){
		this.numerator = num;
		this.denominator = den;
	}
	//ADDING TWO RATIONAL NUMBERS
	public static Rational addRational(Rational number1, Rational number2){
		//initialize holder object.
		Rational rat1 = new Rational();
		int num1den;
		int num2den;
		int num1num;
		int num2num;
		
		if(number1.getDenominator() != number2.getDenominator()){
		
			num1den = number1.getDenominator() * number2.getDenominator();
			num2den = number1.getDenominator() * number2.getDenominator();
			
			num1num = number1.getNumerator() * number2.getDenominator();
			num2num = number2.getNumerator() * number1.getDenominator();
			
			rat1.setNumerator(num1num + num2num);
			rat1.setDenominator(num1den);
		}
		else{
			rat1.setNumerator(number1.getNumerator() + number2.getNumerator());
			rat1.setDenominator(number1.getDenominator());
		}
		
		simplify(rat1);
		
		return rat1;
	}
	//SUBTRACT RATIONAL NUMBERS
	public static Rational subtractRational(Rational number1, Rational number2) {
		
		Rational rat1 = new Rational();
		int num1den;
		int num2den;
		int num1num;
		int num2num;
		
		if(number1.getDenominator() != number2.getDenominator()){
		
			num1den = number1.getDenominator() * number2.getDenominator();
			num2den = number1.getDenominator() * number2.getDenominator();
			
			num1num = number1.getNumerator() * number2.getDenominator();
			num2num = number2.getNumerator() * number1.getDenominator();
			
			rat1.setNumerator(num1num - num2num);
			rat1.setDenominator(num1den);
		}
		else{
			rat1.setNumerator(number1.getNumerator() - number2.getNumerator());
			rat1.setDenominator(number1.getDenominator());
		}
		
		simplify(rat1);
		
		return rat1;
	}
	public static Rational divideRational(Rational number1, Rational number2){
		Rational rat1 = new Rational();
		
		int num;
		int den;
		
		num = number2.getDenominator();
		den = number2.getNumerator();
		
		rat1.setNumerator(num);
		rat1.setDenominator(den);
		
		return multiplyRational(number1, rat1);
	}
	public static Rational multiplyRational(Rational number1, Rational number2){
		Rational rat1 = new Rational();
		
		rat1.setNumerator(number1.getNumerator() * number2.getNumerator());
		rat1.setDenominator(number1.getDenominator() * number2.getDenominator());
		
		simplify(rat1);
		
		return rat1;
	}
	public String toString(int precision) {
		
		double num = this.getNumerator();
		double den = this.getDenominator();
		double floatPoint = num / den;
		
		return String.format("%d/%d, %."+ precision + "f", this.numerator, this.denominator, floatPoint);
	}
	public static void simplify(Rational number1){
		
		if(number1.getNumerator() == number1.getDenominator()){
			
			number1.setDenominator(1);
			number1.setNumerator(1);
		}
		else{
			
		long gcm = greatestCommonMultiple(number1.getNumerator(), number1.getDenominator());
		
		number1.setNumerator((int) (number1.getNumerator() / gcm));
		number1.setDenominator((int) (number1.getDenominator() / gcm));
		}
			
	}
	public static long greatestCommonMultiple(long numerator, long denominator) {
	    return denominator == 0 ? numerator : greatestCommonMultiple(denominator, numerator % denominator);
	}
	
	public static void main(String[] args) {
		
		int a;
		int b;
		int precision = 2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first rational number's numerator and denominator separated by a space.");
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.printf("%d%d%n", a, b);
		Rational num1 = new Rational(a, b);
		
		input.nextLine();
		
		System.out.println("Enter your second rational number's numerator and denominator separated by a space.");
		a = input.nextInt();
		b = input.nextInt();
		Rational num2 = new Rational(a, b);
		System.out.println("Enter the number of decimal places you would like to see in your answers.");
		precision = input.nextInt();
		
		Rational num3 = new Rational();
		
		num3 = addRational(num1, num2);
		System.out.println(num3.toString(precision));
		
		num3 = subtractRational(num1, num2);
		System.out.println(num3.toString(precision));
		
		num3 = multiplyRational(num1, num2);
		System.out.println(num3.toString(precision));
		
		num3 = divideRational(num1, num2);	
		System.out.println(num3.toString(precision));
		
	}
	
}
