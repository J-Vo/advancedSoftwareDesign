package advancedSoftwareDesign;

import java.util.Scanner;

// The Fibanacci series 0, 1, 1, 2, 3, 5, 8, 13, 21

public class Lab1 {
	public static int fibonacci(int n) {
		int a = 0;
		int b = a + 1;
		int c = 0;
		
		if(n == 0) {
			return a;
		}
		if(n == 1 || n == 2) {
			return b;
		}
		else
			
		for(int i = 1; i < n; i++) {
			c = a + b;
			a = b;
		    b = c;
		}
		return c;
	}
	public static void main(String[] args) {
		
		while (true) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the n-th digit of the fibonnaci sequence you'd like to compute");
		
		int n = input.nextInt();
		
		System.out.println(fibonacci(n));
		}
	}
	

}
