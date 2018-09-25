//Name: Jordan Volkman
//Class: Advanced Software Design
//Date: 9/25/2018
//Requirements:
/* Write a program to test your classthat does the following:
 * Prompt the user to enter the numerator and denominator of a rational number.
 * Prompt the user to enter the numerator and denominator of a second rational number.
 * Prompt the user to enter the number of digits of precision to display to the right of the decimal point.
 * Print the result of adding the two rational numbersin the form a/band floating-point format.
 * Print the result of subtracting the two rational numbers in the form a/band floating-point format. 
 * Print the result of multiplying the two rational numbers in the form a/band floating-point format. 
 * Print the result of dividing the two rational numbers in the form a/band floating-point format
 */
package assignment2;

import java.util.Scanner;

public class Rational {
	// declare 2 private class variables
	private int numerator;
	private int denominator;
	
	// create setters and getters
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
	// no-argument constructor
	Rational(){
		this(0,0);
	}
	// two-argument constructor
	Rational(int num, int den){
		this.numerator = num;
		this.denominator = den;
	}
	// adding two rational numbers
	public static Rational addRational(Rational number1, Rational number2){
		//initialize holder object.
		Rational rat1 = new Rational();
		// declare holder variables.
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
		} // if the denominators are not the same, make them the same and add.
		else{
			rat1.setNumerator(number1.getNumerator() + number2.getNumerator());
			rat1.setDenominator(number1.getDenominator());
		}// if they are the same, do the calculation.
		// simplify the fraction
		simplify(rat1);
		// return local object.
		return rat1;
	}
	// subtract rational numbers
	public static Rational subtractRational(Rational number1, Rational number2) {
		// initialize holder object.
		Rational rat1 = new Rational();
		// declare holder variables.
		int num1den;
		int num2den;
		int num1num;
		int num2num;
		
		if(number1.getDenominator() != number2.getDenominator()){
		
			num1den = number1.getDenominator() * number2.getDenominator();
			num2den = number1.getDenominator() * number2.getDenominator();
			
			num1num = number1.getNumerator() * number2.getDenominator();
			num2num = number2.getNumerator() * number1.getDenominator();
			// subtract after making fractions equivalent
			rat1.setNumerator(num1num - num2num);
			rat1.setDenominator(num1den);
		}
		else{
			//subtract without having to do conversion
			rat1.setNumerator(number1.getNumerator() - number2.getNumerator());
			rat1.setDenominator(number1.getDenominator());
		}
		// simplify result if possible
		simplify(rat1);
		
		return rat1;
	}
	// Divide rational numbers
	public static Rational divideRational(Rational number1, Rational number2){
		// initialize holder object.
		Rational rat1 = new Rational();
		// declare holder variables.
		int num;
		int den;
		
		num = number2.getDenominator();
		den = number2.getNumerator();
		// make the fraction a reciprocal
		rat1.setNumerator(num);
		rat1.setDenominator(den);
		// multiply result of reciprocal
		return multiplyRational(number1, rat1);
	}
	//multiply rational numbers
	public static Rational multiplyRational(Rational number1, Rational number2){
		//initialize holder object.
		Rational rat1 = new Rational();
		// perform mutliplication
		rat1.setNumerator(number1.getNumerator() * number2.getNumerator());
		rat1.setDenominator(number1.getDenominator() * number2.getDenominator());
		// simplify
		simplify(rat1);
		
		return rat1;
	}
	public String toString(int precision) {
		// declare holder variables.
		double num = this.getNumerator();
		double den = this.getDenominator();
		double floatPoint = num / den;
		// format toString output.
		return String.format("%d/%d, %."+ precision + "f", this.numerator, this.denominator, floatPoint);
	}
	public static void simplify(Rational number1){
		
		if(number1.getNumerator() == number1.getDenominator()){
			
			number1.setDenominator(1);
			number1.setNumerator(1);
		}// if numerator and denominator are the same, return 1
		else{
			// find the greatest common multiple through this static method. 
		long gcm = greatestCommonMultiple(number1.getNumerator(), number1.getDenominator());
		// set numerator and denominator by first dividing out the gcm.
		number1.setNumerator((int) (number1.getNumerator() / gcm));
		number1.setDenominator((int) (number1.getDenominator() / gcm));
		}
			
	}
	public static long greatestCommonMultiple(long numerator, long denominator) {
		// return gcm between the two inputs, keep looping until found.
	    return denominator == 0 ? numerator : greatestCommonMultiple(denominator, numerator % denominator);
	}
	
	public static void main(String[] args) {
		// main method to drive the program.
		// initialize holder variables for user input.
		int a;
		int b;
		int precision = 2;
		// instantiate scanner object
		Scanner input = new Scanner(System.in);
		
		// grab input
		System.out.println("Enter your first rational number's numerator and denominator separated by a space.");
		a = input.nextInt();
		b = input.nextInt();
		
		System.out.printf("%d%d%n", a, b);
		Rational num1 = new Rational(a, b);
		// create new instance of object from user input
		input.nextLine();
		
		System.out.println("Enter your second rational number's numerator and denominator separated by a space.");
		a = input.nextInt();
		b = input.nextInt();
		// create new instance of object from user input
		Rational num2 = new Rational(a, b);
		// gather user input for decimal precision
		System.out.println("Enter the number of decimal places you would like to see in your answers.");
		precision = input.nextInt();
		// create new instance of object for result holding purposes
		Rational num3 = new Rational();
		// add numbers
		num3 = addRational(num1, num2);
		System.out.println(num3.toString(precision));
		// subtract numbers
		num3 = subtractRational(num1, num2);
		System.out.println(num3.toString(precision));
		// multiply numbers
		num3 = multiplyRational(num1, num2);
		System.out.println(num3.toString(precision));
		// divide numbers
		num3 = divideRational(num1, num2);	
		System.out.println(num3.toString(precision));
		
	}
	
}
