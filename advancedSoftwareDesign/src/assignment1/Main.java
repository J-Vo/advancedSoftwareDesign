package assignment1;
//Name: Jordan Volkman
//Class: Advanced Software Design
//Date: 9/12/2018


import java.util.*;

public class Main {
	// Part 1: Finding prime numbers
	public void primeNumber(){
		// Initialize and set array to length of 5.
		int ARRAY_LENGTH = 5;
		int[] array = new int[ARRAY_LENGTH];
		
		Scanner input = new Scanner(System.in);
		// Iterate through array to use for user input.
		for(int count = 0; count < array.length; count++) {
			boolean pass = true;
			System.out.println("Input five numbers, you are currently on input:" + (count + 1));
			do{
				try {
					// Insert integers into array.
					array[count] = input.nextInt();
					pass = true;
				}
				catch(InputMismatchException e){
					// If user attempts to input invalid characters, the program will spit out an error and have the user try again.
					System.out.println("Invalid input, please enter a valid integer.");
					pass = false;
					input.nextLine();
				}
			}while(pass == false);
		}
		System.out.println("You entered numbers:");
		// Iterate through the array to find which inputted numbers are potentialy prime or not.
		for(int count = 0; count < array.length; count++){
			System.out.print(array[count]);
			boolean isPrime = true;
			// Each number from 2 through to the number in the array is checked if it can divide into the number.
			for(int i = 2; i < array[count]; i++)
				if(array[count] % i == 0){
					isPrime = false;
				}
			if(isPrime == false) {
				// If the number is found to not be prime, we look for the prime factors that make up the number.
					System.out.print(" is not prime.");
					System.out.print(" The prime factors of this number are: ");
					while(array[count] % 2 == 0){
						// The while loop will run in this portion until 2 can no longer be divided into the number in the array.
						System.out.print("2 ");
						array[count] = array[count]/ 2;
					}
					// This for loop runs through and checks to see if there are any odd numbers as prime factors.
					for (int i = 3; i <= Math.sqrt(array[count]); i = i + 2) 
				    { 
				        while (array[count]%i == 0) 
				        { 
				            System.out.print(" "+ i);
				            array[count] = array[count]/i; 
				        } 
				    }
					// Finally we check to see if there are any other fairly large prime factors out there that aren't covered in the previous 2 loops.
				    if (array[count] > 2) 
				        System.out.print(" " + array[count]);
			}
			else {
				System.out.print(" is prime.");
			}
			System.out.println();
		}
	}
	// Part 2: Palindrome
	public void numberPalindrome() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any five digit number and we'll tell you if it's a palindrome or not.");
		
		// Initialize and declare variables, including an array that will help reverse our 5 digit integer.
		int userInput = input.nextInt();
		// This gives us how many digits are in the input.
		int length = (int)(Math.log10(userInput)+1);
		int numCompare = userInput;
		int[] reverse = new int[5];
		
		if(length != 5){
			// The user will be prompted that they entered an invalid input.
			throw new IllegalArgumentException("Invalid number.");
		}
		// The for loop will help us go through what the user entered and put each piece into the array in reverse order from the way it was input.
		for(int count = 0; count < 5; count++){
			reverse[count] = userInput % 10;
			userInput = userInput / 10;
			System.out.printf("%d", reverse[count]);
			}
		// Reassemble the array back into a recognizable full integer, this way we can do a compare of the two to determine if they are indeed palindromes.
		int reverseResult = 10000 * reverse[0] + 1000 * reverse[1] + 100 * reverse[2] + 10 * reverse[3] + 1* reverse[4];
		System.out.println();
		// Perform compare.
		if(numCompare == reverseResult) {
			System.out.println("You entered a palindrome.");
		}
		else {
			System.out.println("You did not enter a palindrome.");
		}
	}
	// Part 3: Test Scores
	public void testScores() {
		Scanner input = new Scanner(System.in);
		// Initialize and declare variables.
		int failures = 0;
		int passes = 0;
		int numberOfScores = 5;
		String[] passFail = new String[numberOfScores];
		int[] score = new int[numberOfScores];
		// Iterate through inserting each score into array.
		for(int i = 0; i < numberOfScores; i++){
			boolean pass = true;
			System.out.println("Input five scores, you are currently on score # " + (i + 1));
			do{
				try {
					score[i] = input.nextInt();
					// If an incorrect score is entered, user will be prompted to enter it again.
					if(score[i] < 0 || score[i] > 100){
						pass = false;
						System.out.println("Invalid score.");
						input.nextLine();
					}
					else{
						pass = true;
					}
				}
				catch(InputMismatchException e){
					System.out.println("Invalid score.");
					pass = false;
					input.nextLine();
				}
			}
			//This do while statement is what allows the program to keep asking the user for valid input.
			while(pass == false);
		}
		// Set variables to the start of the array.
		int a = score[0];
		int b = score[0];
		for(int i = 0; i < numberOfScores; i++) {
			// Find lowest score.
			if(score[i] < a){
				a = score[i];
			}
			// Find highest score.
			if(score[i] > b) {
				b = score[i];
			}
			// Find failures & number of.
			if(score[i] < 60){
				passFail[i] = "Fail";
				failures++;
			}
			// Find passes & number of.
			else {
				passFail[i] = "Pass";
				passes++;
			}
			System.out.printf("%d : %s%n", score[i], passFail[i]);
		}
		// Print final output.
		System.out.println("Total number of passes: " + passes);
		System.out.println("Total number of failures: " + failures);
		System.out.println("The highest score was: " + b);
		System.out.println("The lowest score was: " + a);
		
	}
	public static void main(String[] args){
		boolean quitModule = false;
		// This do while statement will keep looping until the user decides to quit.
		do {
			// Initialize variable validResponse to true.
			boolean validResponse = true;
			int userChoice = 0;
			// Constructor creates an instance of the Class object Main.
			Main test = new Main();
			// Create instance of Scanner object.
			Scanner input = new Scanner(System.in);
			
			System.out.printf(" Welcome%nEnter in integer form which module you'd like to run.%n 1. Prime Numbers%n 2. Palindrome%n 3. Test Scores%n 4. Quit%n");
			// This do while will keep looping if the user consistently enters invalid input.
			do {
				try{
					// Let the user input what module to go to or quit.
					userChoice = input.nextInt();
					
					if(userChoice < 1 || userChoice > 4){
						validResponse = false;
						System.out.println("Invalid Input.");
						input.nextLine();
					}
					// Validation check to ensure what was entered is between 1 and 4.
					if(userChoice < 1 || userChoice > 4){
						validResponse = false;
						System.out.println("Invalid Input.");
						input.nextLine();
					}
					else {
						validResponse = true;
						input.nextLine();
					}
				}
				// Catches any inputs that are not integers.
				catch(InputMismatchException e){
					validResponse = false;
					System.out.println("Invalid Input.");
					input.nextLine();
				}
			}while(!validResponse);
			// This set of if and else ifs decide which module to enter into or to trip the quitModule boolean so that the program will cease looping.
			if(userChoice == 1) {
				test.primeNumber();
			}
			else if(userChoice == 2) {
				test.numberPalindrome();
			}
			else if(userChoice == 3) {
				test.testScores();
			}
			else if(userChoice == 4){
				quitModule = true;
			}
		}while(quitModule == false);
		System.out.println("|| PROGRAM TERMINATED ||");
	}
	
}
