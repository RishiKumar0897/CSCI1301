import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * StarGraph.java
 * Author:  Rishi Kumar
 * Submission Date:  10/17/2023
 *
 * Purpose: create a program using two arrays of type double to store 
 * multiple values for x and y; Once the values are found, the program should
 * print them out as indicated by the examples. The program should also print 
 * out a graphical representation of the function, using a sequence of ‘*’s 
 * to indicate the magnitude of y.
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
public class StarGraph {

	public static void main(String[] args) {
		//rounds to 3 decimals for y
		DecimalFormat df = new DecimalFormat("#.###");
        
		Scanner scan = new Scanner(System.in);
		//ask for array length
		System.out.print("Please enter the number of x values to process: ");
		int arrLength = scan.nextInt();
		//checks if array length is greater than 0
		if (arrLength <= 0) {
			System.out.println("The number of x values must be an integer greater than 0.");
			System.exit(1);
		}
		double[] xValues = new double[arrLength];
		double[] yValues = new double[arrLength];
		//asks for minimum x value
		System.out.print("Enter a minimum value for x: ");
		
		double minX = scan.nextDouble();
		//asks for increment constant
		System.out.print("Enter the amount to increment x: ");
		double incrementXAmount = scan.nextDouble();
		//check if increment constant is greater than 0
		if (incrementXAmount <= 0) {
			System.out.println("The increment must be a decimal number greater than 0.");
			System.exit(1);
		}
		//calculate x values
		for (int i = 0; i < xValues.length; i++) {
			if (i == 0) {
				xValues[i] = minX;
			}
			else {
				xValues[i] = xValues[i-1] + incrementXAmount;
			}
		}
		//calculate y values with formula: y = 20 * |sin(x)|
		for (int i = 0; i < yValues.length; i++) {
			yValues[i] = 20 * Math.abs(Math.sin(xValues[i]));
		}
		//prints out the values according to given format
		System.out.println("\nValues");
		for (int i = 0; i < xValues.length; i++) {
			System.out.println("x: " + xValues[i] + ", " + "y: " + df.format(yValues[i]));
		}
		//graph code; prints out asterisks according to truncated values of corresponding y values.
		System.out.println("\nGraph");
		int asteriskCount = 0;
		for (int i = 0; i < yValues.length; i++) {
			asteriskCount = (int) yValues[i];
			System.out.print(":");
			for (int j = 0; j < asteriskCount; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}

}
