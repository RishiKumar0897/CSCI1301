/*
 * ParseTheTweet.java
 * Author: Rishi Kumar 
 * Submission Date:  9/08/2023
 *
 * Purpose: parse a tweet to look for valuable information and display 
 * that back to the user (type, detail, location, latitude,
 * and longitude) using methods from String class.
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

public class ParseTheTweet {

	public static void main(String[] args) {
		
		// declaring variables
		String tweet = "";
		String tweetType = "";
		String tweetDetail = "";
		String tweetLocation = "";
		String tweetLatitude = "";
		String tweetLongitude = "";
				
				
		//user input
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter A Tweet Below");
		tweet = scan.nextLine();
				
		//indexing tweetType from full tweet and printing the tweetType, making a new string
		int start = tweet.indexOf("#");
		int end = tweet.indexOf(";");
		tweetType = tweet.substring(start+5, end);
		String Type = tweetType.toUpperCase();
		System.out.println("");
		System.out.println("Type:\t\t" + Type);
				
		tweet = tweet.substring(end+1);
				
		//repeating same process for rest of variables
		int start2 = tweet.indexOf("#");
		int end2 = tweet.indexOf(";");
		tweetDetail = tweet.substring(start2+5, end2);
		String detailComma = tweetDetail.replace(",", "-");
		System.out.println("Detail:\t\t" + detailComma);
				
		tweet = tweet.substring(end2+1);
			
				
				
		int start3 = tweet.indexOf("#");
		int end3 = tweet.indexOf(";");
		tweetLocation = tweet.substring(start3+5, end3);
		String locationComma = tweetLocation.replace(",", "-");
		System.out.println("Location:\t" + locationComma);
				
		tweet = tweet.substring(end3+1);
				
		int start4 = tweet.indexOf("#");
		int end4 = tweet.indexOf(";");
		tweetLatitude = tweet.substring(start4+5, end4);
		System.out.println("Latitude:\t" + tweetLatitude);
				
		tweet = tweet.substring(end4+1);
				
		int start5 = tweet.indexOf("#");
		int end5 = tweet.indexOf(";");
		tweetLongitude = tweet.substring(start5+5, end5);
		System.out.println("Longitude:\t" + tweetLongitude);
				
		tweet = tweet.substring(end5+1);

	}

}
