package advancedSoftwareDesign;

import java.io.IOException;
import java.util.*;

public class sphereCalculator {
	public double userInput(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius of the sphere: ");	
		double sphereRadius = 0;
		try { 
	    		sphereRadius = input.nextDouble();
		}
		catch(InputMismatchException e){
	    	System.err.println("Caught InputMismatchException: " + e.getMessage());
	    	sphereRadius = 0.0;
	    } 
		System.out.println("The radius of the Sphere is: " + sphereRadius);
		input.close();
		return sphereRadius;
		}
	public double calculateVolume(double radius){
		double sphereVolume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);	
		return sphereVolume;
	}
	public static void main (String[] args){
		sphereCalculator obj = new sphereCalculator();
		double sphereRadius = obj.userInput();	
		System.out.println("The Volume of the sphere is: " + obj.calculateVolume(sphereRadius));
	}
}
