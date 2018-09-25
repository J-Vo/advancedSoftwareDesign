//Name: Jordan Volkman
//Class: Advanced Software Design
//Date: 9/25/2018
//Requirements:
/*Write a program to test your class that does the following:
  -Prompt the user to enter the real and imaginary part of a complex number. 
  -Prompt the user to enter the real and imaginary part of a second complex number. 
  -Print the result of adding the two numbersusing the print method.
  -Print the resultof subtracting the two numbers using the print method.*/

package assignment2;

import java.util.Scanner;

public class Complex {
		// declare class variables.
		private double realPart;
		private double imaginaryPart;
		// methods for setters and getters.
		public double getRealPart() {
			return realPart;
		}
		public void setRealPart(double realPart) {
			this.realPart = realPart;
		}
		public double getImaginaryPart() {
			return imaginaryPart;
		}
		public void setImaginaryPart(double imaginaryPart) {
			this.imaginaryPart = imaginaryPart;
		}
		// no-argument constructor
		Complex(){
			this(0,0);
		}
		// two-argument constructor.
		Complex(double real, double imaginary){
			this.realPart = real;
			this.imaginaryPart = imaginary;
		}
		// add number method
		public Complex addNumbers(Complex number){
			// instantiate holder object.
			Complex resultNum = new Complex(); 
			//perform calculation
			resultNum.setRealPart(this.getRealPart() + number.getRealPart());
			resultNum.setImaginaryPart(this.getImaginaryPart() + number.getImaginaryPart());
			//return results
			return resultNum;
		}
		public String toString() {
			//Set toString format for printing.
			return String.format("(%.1f, %.1f)", this.getRealPart(), this.getImaginaryPart());
		}
		
		public Complex subtractNumbers(Complex number){
			//instantiate local object to hold results.
			Complex resultNum = new Complex(); 
			//perform calculation
			resultNum.setRealPart(this.getRealPart() - number.getRealPart());
			resultNum.setImaginaryPart(this.getImaginaryPart() - number.getImaginaryPart());
			//return results
			return resultNum;
		}
		//Main method to drive the program.
		public static void main(String[] args) {
			// declare variables.
			double inputx;
			double inputy;
			// instatiate input object.
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the real part and imaginary part of a complex number, starting with the real number:");
			//Grab user input.
			inputx = input.nextDouble();
			
			inputy = input.nextDouble();
			//instantiate first Complex class.
			Complex c1 = new Complex(inputx, inputy);
			
			input.nextLine();
			
			System.out.println("Enter the real part and imaginary part of a second complex number, starting with the real number:");
			//gather input for c2 object.
			inputx = input.nextDouble();
			
			inputy = input.nextDouble();
			// Instatiate second object
			Complex c2 = new Complex(inputx, inputy);
			//Instantiate third object to input the results into.
			Complex c3 = new Complex();
			// add numbers input into c3.
			c3 = c1.addNumbers(c2);
			System.out.printf("Addition result: %s%n" , c3.toString());
			// subtract numbers and overwrite results from addition into c3.
			c3 = c1.subtractNumbers(c2);
			System.out.printf("Subtraction result: %s%n" , c3.toString());

		}
}
