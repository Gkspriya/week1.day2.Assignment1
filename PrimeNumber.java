package week1.day2;

public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a 'for' loop: type 'for', followed by ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {

		// Declare an int Input and assign a value 13

		int input = 13, i;

		// Declare a boolean variable flag as false

		boolean flag = false;

		// Iterate from 2 to half of the input

		for (i = 2; i <= 13 / 2; i++) {
			// Divide the input with each for loop variable and check the remainder
			if (input % i == 0) {

				// Set the flag as true when there is no remainder

				flag = true;
				// break the iterator
				break;
			}
			// Check the flag (Provide a condition)

		}
		if (flag == false) {
			// Print 'Prime' when the condition matches

			System.out.println(input + " is a prime Number");
		} else {
			// Print 'Not a Prime' when the condition doesn't match
			System.out.println(input + " is not a Prime Number");
		}

	}

}
