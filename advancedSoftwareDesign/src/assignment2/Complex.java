package assignment2;

import java.util.Scanner;

public class Complex {

		private double realPart;
		private double imaginaryPart;
		
		Complex(){
			this.realPart = 0;
			this.imaginaryPart = 0;
		}
		Complex(double real, double imaginary){
			this.realPart = real;
			this.imaginaryPart = imaginary;
		}
		
		public double addNumbers(double number)
		{
			double additionResult;

			additionResult = this.realPart + number;

			return additionResult;
		}
		public String toString() {
			return String.format("(%d, %d)", this.realPart, this.imaginaryPart);
		}
		
		public String subtractNumbers(Complex number){
			
			return null;
			
		}
		public static void main(String[] args) {
			double inputx;
			double inputy;
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the real part and imaginary part of a complex number, starting with the real number:");
			
			inputx = input.nextDouble();
			
			inputy = input.nextDouble();
			
			Complex c1 = new Complex(inputx, inputy);
			
			input.nextLine();
			
			System.out.println("Enter the real part and imaginary part of a second complex number, starting with the real number:");
			
			inputx = input.nextDouble();
			
			inputy = input.nextDouble();
			
			Complex c2 = new Complex(inputx, inputy);
			
			c1.addNumbers(c2);
			c1.subtractNumbers(c2);

		}
}
