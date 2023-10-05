import java.util.Scanner;
/*
\ * RockPaperScissors.java
 * Author:  Rishi Kumar 
 * Submission Date:  10/03/2023
 *
 * Purpose: A simple game of Rock, Paper, Scissors.
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
public class RockPaperScissors {

	public static void main(String[] args) {
		
		int personScore = 0;
		int computerScore = 0;
		int pointsToWin;
		String personMove;
		Scanner scan = new Scanner(System.in);
		System.out.print("Points to win: ");
		pointsToWin = scan.nextInt();
		while ((pointsToWin > personScore) && (pointsToWin > computerScore)) {
			System.out.print("Rock, paper, or scissors? ");
			personMove = scan.next();
			
			if (personMove.equalsIgnoreCase("rock")) {
				String computerMove = ComputerOpponent.getMove();
				if (computerMove.equals("rock")) {
					System.out.print(", so it's a tie. (" + personScore +"-" + computerScore + ")\n");
				}
				else if (computerMove.equals("paper")) {
					computerScore += 1;
					System.out.print(", so you lose. (" + personScore +"-" + computerScore + ")\n");
				}
				else if (computerMove.equals("scissors")) {
					personScore += 1;
					System.out.print(", so you win! (" + personScore +"-" + computerScore + ")\n");
					
				}
			}
				
			else if (personMove.equalsIgnoreCase("scissors")) {
				String computerMove = ComputerOpponent.getMove();
				if (computerMove.equals("scissors")) {
					System.out.print(", so it's a tie. (" + personScore +"-" + computerScore + ")\n");
				}
				else if (computerMove.equals("rock")) {
					computerScore += 1;
					System.out.print(", so you lose. (" + personScore +"-" + computerScore + ")\n");
				}
				else if (computerMove.equals("paper")) {
					personScore += 1;
					System.out.print(", so you win! (" + personScore +"-" + computerScore + ")\n");
				}
			}
			
			else if (personMove.equalsIgnoreCase("paper")) {
				String computerMove = ComputerOpponent.getMove();
				if (computerMove.equals("paper")) {
					System.out.print(", so it's a tie. (" + personScore +"-" + computerScore + ")\n");
				}
				else if (computerMove.equals("scissors")) {
					computerScore += 1;
					System.out.print(", so you lose. (" + personScore +"-" + computerScore + ")\n");
				}
				else if (computerMove.equals("rock")) {
					personScore += 1;
					System.out.print(", so you win! (" + personScore +"-" + computerScore + ")\n");
				}
			}
			else {
				System.out.print("");
			}
		}
		if(personScore > computerScore) {
			System.out.println("Congratulations! You won!");
		}
		
		if(computerScore > personScore) {
			System.out.print("Sorry, you lost. Better luck next time!");
		}

	}
}
