import java.util.Scanner;
/*
 * StringFun.java
 * Author:  Rishi Kumar
 * Submission Date:  10/10/2023
 *
 * Purpose: A few functions that a user can call continuously
 * until they decide to end the program that will manipulate a string.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia's Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */
public class StringFun {
	public static void main(String[] args) {
		//original string input
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string to be manipulated");
		String userWord = scan.nextLine();
		
		//while loop that runs until user enters quit
		while (true) {
			//prompts for command
			System.out.println("Enter your command (reverse, replace first, replace last, remove all, remove, quit)");
			String command = scan.nextLine();
			
	
			//the branch that checks if user entered quit as their command
			if (command.equalsIgnoreCase("quit")) {
				System.exit(1);
			}
			// reverse command
			else if (command.equalsIgnoreCase("reverse")) {
				String result = "";
				for (int i = userWord.length() - 1; i >= 0; i--) {
					 result += userWord.charAt(i); 
				}
				userWord = result;
				System.out.println("The new sentence is: " + userWord);
			}
			
			// replace first command
			else if (command.equalsIgnoreCase("replace first")) {
				String result = "";
				boolean found = false;
				System.out.println("Enter the character to replace");
				char charToReplace = scan.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char charToReplaceWith = scan.nextLine().charAt(0);
				for (int i = 0; i < userWord.length(); i++) {
					if ((found == false) && (userWord.charAt(i) == charToReplace)) {
						result += charToReplaceWith;
						found = true;
					}
					else {
						result += userWord.charAt(i);
					}
				}
				if (found) {
					userWord = result;
					System.out.println("The new sentence is: " + userWord);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			
			//replace last command
			else if (command.equalsIgnoreCase("replace last")) {
				String result = "";
				String newResult = "";
				boolean found = false;
				System.out.println("Enter the character to replace");
				char charToReplace = scan.nextLine().charAt(0);
				System.out.println("Enter the new character");
				char charToReplaceWith = scan.nextLine().charAt(0);
				for (int i = userWord.length() -1; i >= 0; i--) {
					if ((found == false) && (userWord.charAt(i) == charToReplace)) {
						result += charToReplaceWith;
						found = true;
					}
					else {
						result += userWord.charAt(i);
					}
				}
				for (int j = result.length() - 1; j >= 0; j--) {
					newResult += result.charAt(j);
				}
				if (found) {
					userWord = newResult;
					System.out.println("The new sentence is: " + userWord);
				}
				else {
					System.out.println("The letter was not found in the word");
				}
			}
			
			//remove all command
			else if(command.equalsIgnoreCase("remove all")) {
				String result = "";
				boolean found = false;
				System.out.println("Enter the character to remove");
				char charToRemove = scan.nextLine().charAt(0);
				for (int i = 0; i < userWord.length(); i++) {
					if (userWord.charAt(i) == charToRemove) {
						result += "";
						found = true;
					}
					else {
						result += userWord.charAt(i);
					}
				}
				if (found) {
					userWord = result;
					System.out.println("The new sentence is: " + userWord);
				}
				else {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				
			}
			
			// remove command
			else if (command.equalsIgnoreCase("remove")) {
				String result = "";
				int counter = 0;
				boolean found = false;
				System.out.println("Enter the character to remove");
				char charToRemove = scan.nextLine().charAt(0);
				System.out.println("Enter the " + charToRemove + " you would like to remove (Not the index - 1 = 1st, 2 = 2nd, etc.):");
				String whichCountToRemove = scan.nextLine();
				int intOfWhichCountToRemove = Integer.parseInt(whichCountToRemove);
				for (int i = 0; i < userWord.length(); i++) {
					if(userWord.charAt(i) == charToRemove) {
						counter ++;
						if (counter == intOfWhichCountToRemove) {
							result += "";
							found = true;
						}
						else {
							result += userWord.charAt(i);
						}
					}
					else {
						result += userWord.charAt(i);
					}	
				}
				if (counter == 0) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}
				else if (found == false) {
					System.out.println("Error: the letter you are trying to remove does not exist");
				}	
					else {
					userWord = result;
					System.out.println("The new sentence is: " + userWord);
				}
					
			}
			
			//command invalid
			else {
				System.out.println("Command invalid. Try again");
			}
		}

	}
}
