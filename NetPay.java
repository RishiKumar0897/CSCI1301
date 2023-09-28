/*
 * NetPay.java
 * Author:  Rishi Kumar 
 * Submission Date:  08/28/2023
 *
 * Purpose: Calculates gross and net pay, as well as the numerical values of all deductions
 * that go into the calculation of net pay, and prints those values to the user.
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



import java.util.Scanner; 


public class NetPay {
	//constants for the tax rates
	public static final double FEDERAL_TAX_PERCENT = 10.00;
	public static final double STATE_TAX_PERCENT = 4.5;
	public static final double SS_PERCENT = 6.2;
	public static final double MEDICARE_PERCENT = 1.45;
	public static final double PAY_PER_HOUR = 7.25;
	
	public static void main(String[] args) {
		
		//creates input for hours
		Scanner scan = new Scanner(System.in);
		System.out.print("Hours Per Week: ");
		int hours = scan.nextInt();
		
		System.out.println();
		//calculates gross pay using the hourly wage and hours worked
		double grossPay = hours * PAY_PER_HOUR; 
		System.out.println("Gross Pay: \t\t" + grossPay);
		//calculates the net pay with the now known gross pay and numerical values of the deductions
		double netPay = grossPay - ((grossPay * FEDERAL_TAX_PERCENT/100) + (grossPay * STATE_TAX_PERCENT/100) + (grossPay * SS_PERCENT/100) + (grossPay * MEDICARE_PERCENT/100));
		System.out.println("Net Pay: \t\t" + netPay);
		
		System.out.println();
		//Below prints out the values of the deductions
		System.out.println("Deductions");
		System.out.println("Federal Tax: \t\t" + (grossPay * FEDERAL_TAX_PERCENT/100));
		System.out.println("State Tax: \t\t" + (grossPay * STATE_TAX_PERCENT/100));
		System.out.println("Social Security: \t" + (grossPay * SS_PERCENT/100));
		System.out.println("Medicare: \t\t" + (grossPay * MEDICARE_PERCENT/100));
		
		}

}
