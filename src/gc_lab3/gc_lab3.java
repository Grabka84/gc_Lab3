package gc_lab3;
import java.util.Scanner;

public class gc_lab3 {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		String name; // no initial value
		int integer = 0; // initialize with any amount at first because the request to input integer is in the while loop, will get immediately overwritten
		char exitChar = 'Y'; // if exitChar becomes anything other than y or Y, exit program
		String exitCharString; // when prompted, user inputs if they want to exit
		
		System.out.println("Welcome to Lab Number 3!");
		System.out.println("-----------------------------------------------");
		System.out.print("Please enter your name: ");
		name = userInput.nextLine();
		System.out.println();
		System.out.println("Hello " + name + "!");
		
		while(exitChar == 'y' || exitChar == 'Y') { // if user enters y or Y when asked, repeat program
		boolean isValid = false; // to run the while loop initially, if first while loop repeats then reset isValid to false
		
			while(isValid == false) { // test if the number chosen is between 1 and 100, ask again if not. Runs the first time since it is initialized as false
				System.out.print("Please enter a whole number between 1 and 100: ");
				integer = userInput.nextInt();
				if(integer > 0 && integer <= 100) {
					isValid = true;
				}
			}	
		
			System.out.println();
			System.out.println(name + ", the number you have chosen is " + integer);
		
			if (integer % 2 == 1) {
				if(integer > 60) {
					System.out.println(integer + ": Odd and over 60.");
				} else {
					System.out.println(integer + ": Odd.");
				}
			
			} else { 
				if(integer <= 25) {
					System.out.println("Even and less than 25.");
				} else if (integer <= 60) {
					System.out.println("Even.");
				} else {
					System.out.println(integer + ": Even.");
				}
			}
			System.out.println("-----------------------------------------------");
			System.out.print("Would you like to enter another value? (y/n) "); // if Y or y or Yes or anything starting with y is written, repeats program using the while loop from above
			exitCharString = userInput.next();
			exitChar = exitCharString.charAt(0);
			System.out.println();
		}
		
		System.out.println("Thanks for participating " + name + "! Goodbye!");
		userInput.close();
	}
}
