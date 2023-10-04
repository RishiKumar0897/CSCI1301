import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * GradeCalculator.java
 * Author:  Rishi Kumar
 * Submission Date:  9/23/2023
 *
 * Purpose: Aids students in calculating their final grade
 * as well as helping them figure out what score they need on 
 * an assessment to score a particular final grade in the class
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
public class GradeCalculator {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat("0.00");
		//initializing some of the variables I will be using later
		double exam1Score = 0, exam2Score = 0, finalExamScore = 0, labAverage = 0, projectAverage = 0, participationAverage = 0, quizAverage = 0;
		double totalKnownGradeWeight = 0;
		double avgToFinalLetterGrade = 0;
		double finalOverallScore = 0;
		
		//printing the grading scale
		System.out.println("Grading Scale:\n"
				+ "A\t90 - 100\n"
				+ "B\t80 - 89\n"
				+ "C\t70 - 79\n"
				+ "D\t60 - 69\n"
				+ "F\tbelow 60");
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What letter grade do you want to achieve for the course?");
		String desiredLetterGrade = scan.next();
		
		//determining the minimum score that the user will need, for later use
		if (desiredLetterGrade.equalsIgnoreCase("A")) {
			finalOverallScore = 90;
		} else if (desiredLetterGrade.equalsIgnoreCase("B")) {
			finalOverallScore = 80;
		} else if (desiredLetterGrade.equalsIgnoreCase("C")) {
			finalOverallScore = 70;
		} else if (desiredLetterGrade.equalsIgnoreCase("D")) {
			finalOverallScore = 70;
		} else if (desiredLetterGrade.equalsIgnoreCase("F")){
			finalOverallScore = 60;
		} else {
			System.out.println("The input is invalid.");
			System.exit(1);
		}
		
		//taking the weights of each category from the user
		System.out.println("Enter percentage weights below.");
		System.out.print("Exam 1:\t\t");
		double exam1Weight = scan.nextDouble();
		System.out.print("Exam 2:\t\t");
		double exam2Weight = scan.nextDouble();
		System.out.print("Final Exam:\t");
		double finalExamWeight = scan.nextDouble();
		System.out.print("Labs:\t\t");
		double labWeight = scan.nextDouble();
		System.out.print("Projects:\t");
		double projectWeight = scan.nextDouble();
		System.out.print("Participation:\t");
		double participationWeight = scan.nextDouble();
		System.out.print("Quizzes:\t\t");
		double quizWeight = scan.nextDouble();
		
		//exit the program in case the weights do not add up to 100
		if (exam1Weight + exam2Weight + finalExamWeight + labWeight + projectWeight + participationWeight + quizWeight != 100) {
			System.out.println("Weights don’t add up to 100, program exiting...");
			System.exit(1);
		}
		
		//the logic involved in asking for exam 2 and final exam only if previous exam scores are known
		//also taking and storing the scores and averages for each category
		System.out.print("Do you know your exam 1 score?");
		String exam1ScoreKnown = scan.next();
		if (exam1ScoreKnown.equalsIgnoreCase("y") || exam1ScoreKnown.equalsIgnoreCase("yes")) {
			
			System.out.print("Score received on exam 1:");
			exam1Score = scan.nextDouble();
			totalKnownGradeWeight += exam1Weight;
			
			System.out.print("Do you know your exam 2 score?");
			String exam2ScoreKnown = scan.next();
			if (exam2ScoreKnown.equalsIgnoreCase("y") || exam2ScoreKnown.equalsIgnoreCase("yes")) {
				
				System.out.print("Score received on exam 2:");
				exam2Score = scan.nextDouble();
				totalKnownGradeWeight += exam2Weight;
				
				System.out.print("Do you know your final exam score?");
				String finalExamScoreKnown = scan.next();
				
				if (finalExamScoreKnown.equalsIgnoreCase("y") || finalExamScoreKnown.equalsIgnoreCase("yes")) {
					System.out.print("Score received on final exam:");
					finalExamScore = scan.nextDouble();
					totalKnownGradeWeight += finalExamWeight;
				}
				
			}
		}
		
		System.out.print("Do you know your lab average?");
		String labAverageKnown = scan.next();
		if (labAverageKnown.equalsIgnoreCase("y") || labAverageKnown.equalsIgnoreCase("yes")) {
			System.out.print("Average lab grade:");
			labAverage = scan.nextDouble();
			totalKnownGradeWeight += labWeight;
		}
		
		System.out.print("Do you know your project average?");
		String projectAverageKnown = scan.next();
		if (projectAverageKnown.equalsIgnoreCase("y") || projectAverageKnown.equalsIgnoreCase("yes")) {
			System.out.print("Average project grade:");
			projectAverage = scan.nextDouble();
			totalKnownGradeWeight += projectWeight;
		}
		
		System.out.print("Do you know your participation average?");
		String participationAverageKnown = scan.next();
		if (participationAverageKnown.equalsIgnoreCase("y") || participationAverageKnown.equalsIgnoreCase("yes")) {
			System.out.print("Average participation grade:");
			participationAverage = scan.nextDouble();
			totalKnownGradeWeight += participationWeight;
		}
		
		System.out.print("Do you know your quiz average?");
		String quizAverageKnown = scan.next();
		if (quizAverageKnown.equalsIgnoreCase("y") || quizAverageKnown.equalsIgnoreCase("yes")) {
			System.out.print("Average quiz grade:");
			quizAverage = scan.nextDouble();
			totalKnownGradeWeight += quizWeight;
		}
		
		//(weight * score)/gradeWeight; repeat for every category to find current grade score
		double currentGradeScore = (exam1Weight * exam1Score)/totalKnownGradeWeight;
		currentGradeScore += (exam2Weight * exam2Score)/totalKnownGradeWeight;
		currentGradeScore += (finalExamWeight * finalExamScore)/totalKnownGradeWeight;
		currentGradeScore += (labWeight * labAverage)/totalKnownGradeWeight;
		currentGradeScore += (projectWeight * projectAverage)/totalKnownGradeWeight;
		currentGradeScore += (participationWeight * participationAverage)/totalKnownGradeWeight;
		currentGradeScore += (quizWeight * quizAverage)/totalKnownGradeWeight;
		
		//deciphering the corresponding letter grade for current grade score
		System.out.println("Current grade score:" + df.format(currentGradeScore));
		String currentLetterGrade = "A";
		if (currentGradeScore >= 90) {
			currentLetterGrade = "A";
			
		} else if (currentGradeScore < 90 && currentGradeScore >= 80) {
			currentLetterGrade = "B";
			
		} else if (currentGradeScore < 80 && currentGradeScore >= 70) {
			currentLetterGrade = "C";
			
		} else if (currentGradeScore < 70 && currentGradeScore >= 60) {
			currentLetterGrade = "D";
			
		} else {
			currentLetterGrade = "F";
			
		}
		
		System.out.println("Your current letter grade:" + currentLetterGrade);
		
		
		//the logic involved for printing what average is needed to achieve a certain grade,
		//if it is achievable, or if the grade has been achieved
		if (currentLetterGrade.equalsIgnoreCase(desiredLetterGrade)) {
			System.out.println("Congratulations! You received the " + desiredLetterGrade + " that you wanted!");
			
		} else {
			if (totalKnownGradeWeight < 100) {
				avgToFinalLetterGrade = ((100 * finalOverallScore) - (currentGradeScore * totalKnownGradeWeight))/(100 - totalKnownGradeWeight);
				if (avgToFinalLetterGrade > 100) {
					System.out.println("Unfortunately, a grade of " + desiredLetterGrade + " is not possible.");
				} else if (avgToFinalLetterGrade > 0){
					System.out.println("In order to receive a grade of " + desiredLetterGrade + ",\n"
							+ "you need to score an average greater than\n"
							+ "or equal to " + df.format(avgToFinalLetterGrade) + " in the rest of the grade items.");
					
				} else {
					System.out.println("You will receive at least a grade of " + desiredLetterGrade);
				}
				
			} else {
				if (!(currentLetterGrade.equalsIgnoreCase(desiredLetterGrade))) {
					System.out.println("Unfortunately, a grade of " + desiredLetterGrade + " is not possible.");
			}
			
		}

	}
		scan.close();

}
}
