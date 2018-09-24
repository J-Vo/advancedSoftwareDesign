package assignment2;

import java.util.Scanner;

public class Complex {

		private double realPart;
		private double imaginaryPart;
		
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

		Complex(){
			this.realPart = 0;
			this.imaginaryPart = 0;
		}
		Complex(double real, double imaginary){
			this.realPart = real;
			this.imaginaryPart = imaginary;
		}
		
		public Complex addNumbers(Complex number)
		{
			Complex resultNum = new Complex(); 

			resultNum.setRealPart(this.getRealPart() + number.getRealPart());
			resultNum.setImaginaryPart(this.getImaginaryPart() + number.getImaginaryPart());
			
			return resultNum;
		}
		public String toString() {
			return String.format("(%.1f, %.1f)", this.getRealPart(), this.getImaginaryPart());
		}
		
		public Complex subtractNumbers(Complex number){
				
			Complex resultNum = new Complex(); 

			resultNum.setRealPart(this.getRealPart() - number.getRealPart());
			resultNum.setImaginaryPart(this.getImaginaryPart() - number.getImaginaryPart());
				
			return resultNum;
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
			
			Complex c3 = new Complex();
			
			c3 = c1.addNumbers(c2);
			System.out.printf("Addition result: %s%n" , c3.toString());
			c3 = c1.subtractNumbers(c2);
			System.out.printf("Subtraction result: %s%n" , c3.toString());

		}
}
