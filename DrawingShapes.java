import java.util.Scanner;
/*
 * DrawingShapes.java
 * Author:  Rishi Kumar
 * Submission Date:  10/14/2023
 *
 * Purpose: Draws different shapes using combination of asterisks 
 * and spaces based on user input.
 *
 * Statement of Academic Honesty:
 *
 * The following code represents my own work. I have neither 
 * received nor given inappropriate assistance. I have not copied 
 * or modified code from any source other than the course webpage 
 * or the course textbook. I recognize that any unauthorized 
 * assistance or plagiarism will be handled in accordance with 
 * the University of Georgia"s Academic Honesty Policy and the 
 * policies of this course. I recognize that my work is based 
 * on an assignment created by the School of Computing 
 * at the University of Georgia. Any publishing or
 * posting of source code for this assignment is strictly 
 * prohibited unless you have written consent from the 
 * School of Computing at the University of Georgia.  
 */
public class DrawingShapes {

	public static void main(String[] args) {
		//ask user for shape
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a shape: r t h o p");
		String userShape = scan.nextLine();
		

		switch (userShape) {
			case "r" : // rectangle
				//ask for length
				System.out.println("Enter a length");
				int rectangleColumns = scan.nextInt();
				if (rectangleColumns <= 1) {
					System.out.println("Length must be greater than 1");
					System.out.println("Goodbye!");
					break;
				}
				//ask for height
				System.out.println("Enter a height");
				int rectangleRows = scan.nextInt();
				if (rectangleRows <= 1) {
					System.out.println("Height must be greater than 1");
					System.out.println("Goodbye!");
					break;
				}
				//calculations
				System.out.println("Below is a " + rectangleColumns + " by " + rectangleRows + " rectangle of *");
				for (int columns = 0; columns < rectangleRows; columns++) {
					for (int rows = 0; rows < rectangleColumns; rows++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
				break;
				
			case "t": //triangle
				//ask for length
				System.out.println("Enter a length");
				int triangleLength = scan.nextInt();
				if (triangleLength <= 1) {
					System.out.println("Length must be greater than 1");
					System.out.println("Goodbye!");
					break;
				}
				
				System.out.println("Below is a triangle with two side lengths of " + triangleLength + " *");
				int triangleSpacesLength = 0;
				//calculations
				for (int i = 1; i <= triangleLength; i++) {
					int spaceCounter = 0;
					for (triangleSpacesLength = triangleLength - i; triangleSpacesLength > 0; triangleSpacesLength--) {
						System.out.print(" ");
						spaceCounter++;
					}
					for (int triangleAsteriskLength = 1; triangleAsteriskLength <= i * 2 - 1; triangleAsteriskLength++) { 
						System.out.print("*");
					}
					System.out.print("\n");
				}
				
				break;
				
			case "h": //hexagon
				//ask for length
				System.out.println("Enter a length");
				int hexagonLength = scan.nextInt();
				if (hexagonLength <= 1) {
					System.out.println("Length must be greater than 1");
					System.out.println("Goodbye!");
					break;
				}
				System.out.println("Below is a hexagon with side lengths of " + hexagonLength + " *");
				int hexagonSpacesLength = 0;
				int hexagonAsteriskCounter = 0;
				//calculations
				for (int i = 1; i <= hexagonLength; i++) {
					for (hexagonSpacesLength = hexagonLength - i; hexagonSpacesLength >= 0; hexagonSpacesLength--) {
						System.out.print(" ");
					} 
					for (int hexagonAsteriskLength = 1; hexagonAsteriskLength <= hexagonLength + hexagonAsteriskCounter; hexagonAsteriskLength++) { 
						System.out.print("*");
						
					} 
					System.out.print("\n");
					hexagonAsteriskCounter +=2;
				}
				//calculations part 2
				for (int i = 1; i <= hexagonLength; i++) {
					for (int j = 1; j < i; j++) {
						System.out.print(" ");
					} 
					for (int hexagonAsteriskLength = hexagonLength + hexagonAsteriskCounter - 2; hexagonAsteriskLength >= 0; hexagonAsteriskLength--) { 
						System.out.print("*");
					} 
					System.out.print("\n");
					hexagonAsteriskCounter -=2;
				}
				break;
				
			case "o": //octagon
				//ask for length
				System.out.println("Enter a length");
				int octagonLength = scan.nextInt();
				if (octagonLength <= 1) {
					System.out.println("Length must be greater than 1");
					System.out.println("Goodbye!");
					break;
				}
				System.out.println("Below is an octagon with side lengths of " + octagonLength + " *");
				int octagonSpacesLength = 0;
				int octagonAsteriskCounter = 0;
				//calculations
				for (int i = 1; i <= octagonLength -1; i++) {
					for (octagonSpacesLength = octagonLength - i; octagonSpacesLength > 0; octagonSpacesLength--) {
						System.out.print(" ");
					} 
					for (int octagonAsteriskLength = 1; octagonAsteriskLength <= octagonLength + octagonAsteriskCounter; octagonAsteriskLength++) { 
						System.out.print("*");
						
					} 
					System.out.print("\n");
					octagonAsteriskCounter +=2;
				}
				//calculations part 2
				for (int octagonColumns = 0; octagonColumns < octagonLength; octagonColumns++) {
					for (int octagonRows = 0; octagonRows < octagonLength + octagonAsteriskCounter; octagonRows++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
				//calculations part 3
				for (int i = 1; i < octagonLength; i++) {
					for (int j = 0; j < i; j++) {
						System.out.print(" ");
					} 

					for (int octagonAsteriskLength = octagonLength + octagonAsteriskCounter - 2; octagonAsteriskLength > 0; octagonAsteriskLength--) { 
						System.out.print("*");
					} 
					System.out.print("\n");
					octagonAsteriskCounter -=2;
				}
				break;
				
			case "p": //pentagon
				//ask for length
				System.out.println("Enter a length");
				int pentagonLength = scan.nextInt();
				if (pentagonLength <= 1) {
					System.out.println("Length must be greater than 1");
					System.out.println("Goodbye!");
					break;
				}
				int pentagonRows = pentagonLength;
				int pentagonAsteriskLength = 1;
				System.out.println("Below is a pentagon with 4 side lengths of " + pentagonLength + " *");
				int pentagonSpacesLength = 0;
				//calculations
				for (int i = 1; i <= pentagonLength; i++) {
					for (pentagonSpacesLength = pentagonLength - i; pentagonSpacesLength > 0; pentagonSpacesLength--) {
						System.out.print(" ");
					}
					for (pentagonAsteriskLength = 1; pentagonAsteriskLength <= i * 2 - 1; pentagonAsteriskLength++) { 
						System.out.print("*");
					}
					System.out.print("\n");
				}
				int pentagonColumns = pentagonAsteriskLength -1;
				//calculations part 2
				for (int columns = 0; columns < pentagonRows; columns++) {
					for (int rows = 0; rows < pentagonColumns; rows++) {
						System.out.print("*");
					}
					System.out.print("\n");
				}
				break;
				
			default: //invalid input
				System.out.println("Invalid shape");
				System.out.println("Goodbye!");
		}
	}
}


